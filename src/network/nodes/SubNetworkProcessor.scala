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
  // TODO: Implement SubNetworkProcessor
  if (name.isEmpty()) name = "SubNetworkProcessor " + id
  
  private[network] def receive(data: Any, from: Connection): Unit = {
    ???
  }
  
}