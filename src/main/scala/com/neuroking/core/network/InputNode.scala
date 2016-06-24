package com.neuroking.core.network

import scala.collection.mutable.ArrayBuffer

/**
 * @author mmKALLL
 * 
 * An InputNode receives input in some manner (e.g. console, file, visual data, ...),
 * can modify it and then sends that in some manner to its outputs to process.
 */

trait InputNode extends NetworkNode {
  
  private[network] def readInput()
  
  // Inherited methods from NetworkNode
  override private[network] def receive(data: Any, from: Connection) = throw new UnsupportedOperationException("Cannot call receive for an InputNode!")
  
  override def toString = if (outputs.isEmpty) super.toString + ", connected to: []"
                          else  super.toString + ", connected to: [" + outputs.map(_.to.name).reduceLeft(_ + ", " + _) + "]"
                          

}
