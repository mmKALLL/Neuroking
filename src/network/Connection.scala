package network.nodetypes

/**
 * A connection is a one-way link between two nodes, passing data.
 * 
 */

class Connection(from: NetworkNode, to: NetworkNode) {
  
  // FIXME: proper id mechanism
  val id: Int = ???
  var name: String = id.toString
  
  def send(data: Any) = to.receive(data)
  
  override def toString = "Connection " + this.name + " connected from " + from.name + " to " + to.name + "."
  
}