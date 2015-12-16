package network.nodetypes
import neurotest.gui.Launcher.dmsg // The debug message function
import scala.collection.mutable.ArrayBuffer

/**
 * A node type that processes data from inputs and supplies it to outputs.
 * 
 */

trait ProcessorNode extends NetworkNode {
  
  val inputs = ArrayBuffer[Connection]()
  val outputs = ArrayBuffer[Connection]()
  
  def receive(input: Any)
  
  override def toString = super.toString +
                          "\n\ninputs:\n" + inputs.foreach { _.toString + "\n" }
                          "\n\noutputs:\n" + outputs.foreach { _.toString + "\n" }
}