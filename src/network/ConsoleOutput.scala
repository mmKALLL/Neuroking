package neurotest.network
import neurotest.gui.Launcher.dmsg // The debug message function
import network.nodetypes.OutputNode

/**
 * A ConsoleOutput is a type of output node that will print all
 * received data to the console as-is. Note that the printing is not
 * immediate, but rather will depend on the flush from Network.
 */
class ConsoleOutput extends OutputNode {
  
}