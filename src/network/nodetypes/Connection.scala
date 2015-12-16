package network.nodetypes

/**
 * @author admin
 */
// FIXME: no parameters allowed???
class Connection(from: NetworkNode, to: NetworkNode) {
  
  override def toString = "Connection " + this + " connected from " + from + " to " + to + "."
  
}