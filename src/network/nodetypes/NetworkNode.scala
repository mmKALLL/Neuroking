package network.nodetypes
import neurotest.gui.Launcher.dmsg
import neurotest.network._
import scala.collection.mutable.ArrayBuffer


/**
 * A trait that defines the nodes that are part of the neural network.
 * Nodes can create connections with each other.
 * 
 * Extensions of this class should implement internals for storing the connections.
 */

trait NetworkNode {
  
  val id: Int
  var name: String
  
  // One-way connection from this to the target node.
  def connect(that: NetworkNode)
  
  // Methods for sending processed data to named connections and receiving it.
  // The processing of received data can then be done within a receive call.
  def send(data: Any, to: Connection*) = to.foreach(_.send(data))
  def receive(data: Any)
  
}