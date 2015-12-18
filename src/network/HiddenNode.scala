package neurotest
package network

import scala.collection.mutable.ArrayBuffer

/**
 * A node type that processes data from inputs and supplies it to outputs.
 * Implements internal details which are "hidden" from the external system, that is,
 * the network should be viewed as a black box.
 * 
 */

trait HiddenNode extends NetworkNode {
  
  
  // Inherited methods from NetworkNode  
  override def toString = super.toString +
                          "\noutputs:\n[\n" + outputs.foreach { _.toString + "\n" } + "]\n"
}