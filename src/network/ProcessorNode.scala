package neurotest
package network

import scala.collection.mutable.ArrayBuffer

/**
 * A node type that processes data from inputs and supplies it to outputs.
 * 
 */

trait ProcessorNode extends NetworkNode {
  
  private val outputs = ArrayBuffer[Connection]()
  
  
  def connect(that: NetworkNode) = outputs += new Connection(this, that)
  
  
  override def toString = super.toString +
                          "\n\noutputs:\n" + outputs.foreach { _.toString + "\n" }
}