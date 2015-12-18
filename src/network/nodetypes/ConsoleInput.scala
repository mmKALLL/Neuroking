package neurotest
package network
package nodetypes


/**
 * At the time of running a Network, all ConsoleInputs will
 * on their turn take a single line of input from the console,
 * and then pass that to their outwards connections.
 */
class ConsoleInput extends InputNode {
  
  // TODO: id handler
  val id: Int = ???
  var name: String = ???
  
  private val reader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in))
  
  // Members declared in network.nodetypes.InputNode
  def readInput: Unit = {
    send(reader.readLine(), this.outputs: _*)
  }
  
  // Members declared in network.nodetypes.NetworkNode
  def receive(data: Any, from: Connection): Unit = ???
  
  
}