package neurotest
package network
package nodes



/**
 * A ConsoleOutput is a type of output node that will print all
 * received data to the console as-is. Note that the printing is not
 * immediate, but rather will depend on the flush from Network.
 */
class ConsoleOutput extends OutputNode {
  // TODO: id handler
  val id: Int = (Math.random() * 10000).toInt
  var name: String = "ConsoleOutput " + id

  // TODO: implementation  
  private[network] def out: Unit = {
    ???
  }
  
}