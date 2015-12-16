package network.nodetypes
import neurotest.gui.Launcher.dmsg
import scala.collection.mutable.ArrayBuffer


/**
 * A node type that outputs the information received in some manner or another.
 * 
 * They should not output prematurely, as it would break potential parallelization.
 */

trait OutputNode extends NetworkNode {
  
  val inputs = ArrayBuffer[Connection]()
  
  // When the Network flushes its outputs, they will display their data in a 
  // corresponding way; the exact implementation is left to each individual type.
  def out
  
  
  override def toString = super.toString +
                          "\ninputs:\n" + inputs.foreach { _.toString + "\n" }
}