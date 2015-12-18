package neurotest
package network

import scala.collection.mutable.Queue


/**
 * A node type that outputs the information received in some manner or another.
 * 
 * They should not output prematurely, as it would break potential parallelization.
 */

trait OutputNode extends NetworkNode {
  
  val outputQueue = Queue[Any]()
  
  // When the Network flushes its outputs, they will display their data in a 
  // corresponding way; the exact implementation is left to each individual type.
  def out
  
  
  // Inherited methods from NetworkNode, TODO: incomplete list of inherited methods
  
  def receive(data: Any, from: Connection) = outputQueue.enqueue(data)
  
  override def toString = super.toString
}