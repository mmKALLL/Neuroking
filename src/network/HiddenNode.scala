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
  
  private[network] val outputs = ArrayBuffer[Connection]()
  
  
  def connect(that: NetworkNode) = outputs += new Connection(this, that)
  
  
  override def toString = super.toString +
                          "\n\noutputs:\n" + outputs.foreach { _.toString + "\n" }
}