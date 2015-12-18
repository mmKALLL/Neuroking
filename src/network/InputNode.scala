package neurotest
package network

import scala.collection.mutable.ArrayBuffer

/**
 * An InputNode receives input in some manner (e.g. console, file, visual data, ...),
 * can modify it and then sends that in some manner to its outputs to process.
 */

trait InputNode extends NetworkNode {
  
  private[network] def readInput
  
  // Inherited methods from NetworkNode
  override private[network] def receive(data: Any, from: Connection) = throw new IllegalFunctionCallException("Cannot call receive for an InputNode!")
  
  override def toString = super.toString +
                          "\noutputs:\n[\n" + outputs.foreach { _.toString + "\n" } + "]\n"

}