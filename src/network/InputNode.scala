package neurotest
package network

import scala.collection.mutable.ArrayBuffer

/**
 * An InputNode receives input in some manner (e.g. console, file, visual data, ...),
 * can modify it and then sends that in some manner to its outputs to process.
 */

trait InputNode extends NetworkNode {
  
  protected val outputs = ArrayBuffer[Connection]()
  
  def readInput
  
  def connect(that: NetworkNode) = outputs += new Connection(this, that)
  
  override def receive(data: Any, from: Connection) = throw new IllegalFunctionCallException("Cannot call receive for an InputNode!")
  
  override def toString = super.toString +
                          "\noutputs:\n" + outputs.foreach { _.toString + "\n" }

}