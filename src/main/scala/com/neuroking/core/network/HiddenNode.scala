package com.neuroking.core.network

import scala.collection.mutable.ArrayBuffer

/**
 * @author mmKALLL
 * 
 * A node type that processes data from inputs and supplies it to outputs.
 * Implements internal details which are "hidden" from the external system, that is,
 * the network should be viewed as a black box.
 * 
 */

trait HiddenNode extends NetworkNode {
  
  // Inherited methods from NetworkNode
  override def toString = if (outputs.isEmpty) super.toString + ", connected to: []"
                          else  super.toString + ", connected to: [" + outputs.map(_.to.name).reduceLeft(_ + ", " + _) + "]"
}
