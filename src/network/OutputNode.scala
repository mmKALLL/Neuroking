package network
import neurotest.gui.Launcher.dmsg // The debug message function


/**
 * A node type that outputs the information received in some manner or another.
 */

trait OutputNode extends NetworkNode {
  
  dmsg("I give output! " + this)
  
}