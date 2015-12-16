package network.nodetypes
import neurotest.gui.Launcher.dmsg


/**
 * A node type that outputs the information received in some manner or another.
 */

trait OutputNode extends NetworkNode {
  
  dmsg("I give output! " + this)
  
}