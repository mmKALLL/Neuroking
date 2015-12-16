package network.nodetypes
import neurotest.gui.Launcher.dmsg // The debug message function

/**
 * A node type that processes data from inputs and supplies it to outputs.
 * 
 */

trait ProcessorNode extends NetworkNode {
  
  def receive(input: Any*)
  
}