package com.neuroking.core.network

import scala.collection.mutable.ArrayBuffer
import com.neuroking.core.system.System

/**
 * @author mmKALLL
 * 
 * A trait that defines the nodes that are part of the neural network.
 * Nodes can create connections with each other.
 * 
 * Extensions of this class may implement different internals for storing the connections.
 * First it was specified as mandatory but I believe that that would be premature optimization,
 * even though executing the network should be as fast as possible.
 */

trait NetworkNode {
  
  protected val outputs = ArrayBuffer[Connection]()
  
  // Name is intended for user interaction, id for System-level unique identification
  val id: Int = System.nextID()
  var name: String
  
  // One-way connection from this to the target node.
  def connect(that: NetworkNode) = outputs += new Connection(this, that)
  
  // Methods for sending processed data to named connections and receiving it.
  // The processing of received data can then be done within a receive call.
  private[network] def send(data: Any, to: Connection*) = to.foreach(_.send(data))
  private[network] def receive(data: Any, from: Connection)
  
  // Extending classes should call super.toString and add their own to this list, e.g. outwards connections etc.
  // For nodes, toString should be a single-line string.
  override def toString = "Network node, type: " + this.getClass.getSimpleName + ", id: " + id + ", name: " + name
  
}

