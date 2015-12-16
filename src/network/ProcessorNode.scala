package network
import neurotest.gui.Launcher.dmsg // The debug message function

/**
 * A node type that processes data from inputs and supplies it to outputs.
 * 
 */

trait ProcessorNode extends NetworkNode {
  dmsg("I am hidden! " + this)
}