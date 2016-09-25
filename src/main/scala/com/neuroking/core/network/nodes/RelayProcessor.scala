<<<<<<< HEAD:src/network/nodes/RelayProcessor.scala
package neurotest
package network
package nodes


/**
 * A RelayProcessor is a type of HiddenNode that does
 * nothing but forward all received data onwards to
 * all its exits.
 * 
 */
class RelayProcessor(var name: String = "") extends HiddenNode {
  
  if (name.isEmpty()) name = "RelayProcessor " + id
  
  // Inherited methods from HiddenNode
  private[network] def receive(data: Any, from: Connection): Unit = {
    send(data, outputs: _*)
  }

  
  
}
=======
package com.neuroking.core.network.nodes

import com.neuroking.core.network._


/**
 * @author mmKALLL
 * 
 * A RelayProcessor is a type of HiddenNode that does nothing but
 * forward all received data onwards to all its exits.
 */
class RelayProcessor(var name: String = "") extends HiddenNode {
  
  if (name.isEmpty()) name = "RelayProcessor " + id
  
  // Inherited methods from HiddenNode
  private[network] def receive(data: Any, from: Connection): Unit = {
    send(data, outputs: _*)
  }

  
  
}
>>>>>>> 2a3da6903cf17f86e70b982b162280503ca4a157:src/main/scala/com/neuroking/core/network/nodes/RelayProcessor.scala
