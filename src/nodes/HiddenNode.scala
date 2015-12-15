package neurotest.nodes
import neurotest.gui.Launcher.dmsg // The debug message function

/**
 * A node type that processes data from inputs and supplies it to outputs.
 * 
 */

class HiddenNode {
  dmsg("I am hidden! " + this)
}