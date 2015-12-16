package network.nodetypes

/**
 * @author admin
 * 
 * A connection is a one-way link between two nodes, passing data.
 */

class Connection(from: NetworkNode, to: NetworkNode) {
  
  def send(data: Any) = to.receive(data)
  
  override def toString = "Connection " + this + " connected from " + from + " to " + to + "."
  
}