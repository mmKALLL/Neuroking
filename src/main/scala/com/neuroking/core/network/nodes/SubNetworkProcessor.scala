<<<<<<< HEAD:src/network/nodes/SubNetworkProcessor.scala
package neurotest
package network
package nodes

/**
 * @author mmKALLL
 * 
 * A SubNetworkProcessor is a HiddenNode which encapsulates a complete
 * network within itself, and whose inputs and outputs are connected
 * to the underlying network's input and output nodes.
 */
class SubNetworkProcessor(var name: String = "") extends HiddenNode {
  // TODO: Implement SubNetworkProcessor
  if (name.isEmpty()) name = "SubNetworkProcessor " + id
  
  private[network] def receive(data: Any, from: Connection): Unit = {
    ???
  }
  
}
=======
package com.neuroking.core.network.nodes

import com.neuroking.core.network._

/**
 * @author mmKALLL
 * 
 * A SubNetworkProcessor is a HiddenNode which encapsulates a complete
 * network within itself, and whose inputs and outputs are connected
 * to the underlying network's input and output nodes.
 */

class SubNetworkProcessor(var name: String = "") extends HiddenNode {
  // TODO: Implement SubNetworkProcessor; consider how inputs are specified
  if (name.isEmpty()) name = "SubNetworkProcessor " + id
  
  private[network] def receive(data: Any, from: Connection): Unit = {
    ???
  }
  
}
>>>>>>> 2a3da6903cf17f86e70b982b162280503ca4a157:src/main/scala/com/neuroking/core/network/nodes/SubNetworkProcessor.scala
