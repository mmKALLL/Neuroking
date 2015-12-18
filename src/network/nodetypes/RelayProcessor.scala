package neurotest
package network
package nodetypes

import neurotest.network.ProcessorNode
import neurotest.network.Connection


/**
 * A RelayProcessor is a type of processor that does
 * nothing but forward all received data onwards to
 * all its exits.
 * 
 */
class RelayProcessor extends ProcessorNode {
  val id: Int = (Math.random() * 10000).toInt

  var name: String = "RelayProcessor " + id

  def receive(data: Any, from: Connection): Unit = {
    ???
  }
  
  
}