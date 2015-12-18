package neurotest 
package network
package nodes

/**
 * At the time of running a Network, all ConsoleInputs will
 * on their turn take a single line of input from the console,
 * and then pass that to their outwards connections.
 */
class ConsoleInput extends InputNode {
  
  // TODO: id handler
  val id: Int = (Math.random() * 10000).toInt
  var name: String = "ConsoleInput " + id
  
  private val reader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in))
  
  // Members declared in network.nodetypes.InputNode
  private[network] def readInput: Unit = {
    send(reader.readLine(), this.outputs: _*)
  }
  
}