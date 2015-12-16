package network.nodetypes
import neurotest.gui.Launcher.dmsg // The debug message function

/**
 * A node which takes some sort of input and passes that along to HiddenNodes to process.
 */

trait InputNode extends NetworkNode {
  
  dmsg("I am taking input! " + this)
  
  
  
  
}