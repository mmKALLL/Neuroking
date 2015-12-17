package neurotest.network
import neurotest.gui.Launcher.dmsg // The debug message function
import network.nodetypes.InputNode

/**
 * At the time of running a Network, all ConsoleInputs will
 * on their turn take a single line of input from the console,
 * and then pass that to their outwards connections.
 */
class ConsoleInput extends InputNode {
  
  // TODO: id handler
  val id: Int = ???
  var name: String = ???
  
  
  
  // Members declared in network.nodetypes.InputNode
  def readInput: Unit = ???
  
  // Members declared in network.nodetypes.NetworkNode
  def connect(that: network.nodetypes.NetworkNode): Unit = ???
  
  def receive(data: Any): Unit = ???
  
  
}