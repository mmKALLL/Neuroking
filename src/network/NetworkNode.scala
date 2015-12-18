package neurotest
package network


/**
 * A trait that defines the nodes that are part of the neural network.
 * Nodesimport network.Connection
 can create connections with each other.
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
  def receive(data: Any, from: Connection)
  
  // Extending classes should call super.toString and add their own to this list, e.g. outwards connections etc.
  override def toString = "This network node is of type " + this.getClass + " and has the following information." +
                          "\nid: " + id +
                          "\nname: " + name
  
}


/**
 * Used for calling functions which are not supposed to be used, i.e. receive for InputNode and send for OutputNode.
 */
class IllegalFunctionCallException(msg: String) extends Exception(msg) {
  
}


