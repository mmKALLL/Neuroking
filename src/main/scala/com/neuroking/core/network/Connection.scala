package com.neuroking.core.network


/**
 * A connection is a one-way link between two nodes, passing data.
 * 
 */

class Connection(private[network] val from: NetworkNode, private[network] val to: NetworkNode) {
  
  val id: Int = com.neuroking.core.system.System.nextID
  var name: String = "Connection " + id
  
  private[network] def send(data: Any) = to.receive(data, this)
  
  override def toString = "Connection; name: " + this.name + ", from: " + from.name + ", to: " + to.name + "."
  
} 