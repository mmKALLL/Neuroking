package neurotest
package network


/**
 * A connection is a one-way link between two nodes, passing data.
 * 
 */

class Connection(from: NetworkNode, to: NetworkNode) {
  
  // FIXME: proper id mechanism
  val id: Int = (Math.random() * 10000).toInt
  var name: String = "Connection " + id
  
  private[network] def send(data: Any) = to.receive(data, this)
  
  override def toString = "Connection " + this.name + " connected from " + from.name + " to " + to.name + "."
  
}