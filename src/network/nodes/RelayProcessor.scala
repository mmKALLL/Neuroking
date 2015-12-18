package neurotest
package network
package nodes


/**
 * A RelayProcessor is a type of HiddenNode that does
 * nothing but forward all received data onwards to
 * all its exits.
 * 
 */
class RelayProcessor extends HiddenNode {
  
  // TODO: id handler
  val id: Int = (Math.random() * 10000).toInt
  var name: String = "RelayProcessor " + id
  
  // Inherited methods from HiddenNode
  private[network] def receive(data: Any, from: Connection): Unit = {
    send(data, outputs: _*)
  }

  
  
}