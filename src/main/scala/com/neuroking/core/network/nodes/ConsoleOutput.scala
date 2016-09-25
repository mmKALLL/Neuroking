<<<<<<< HEAD:src/network/nodes/ConsoleOutput.scala
package neurotest
package network
package nodes

import scala.collection.mutable.Queue



/**
 * A ConsoleOutput is a type of output node that will print all
 * received data to the console as-is. Note that the printing is not
 * immediate, but rather will depend on the flush from Network.
 */
class ConsoleOutput(var name: String = "") extends OutputNode {
  
  if (name.equals("")) name = "ConsoleInput " + id
  
  
  private[network] def out: Unit = {
    for (x <- (0 until outputQueue.length))
      println(name + " output: " + outputQueue.dequeue.toString)
  }
  
}
=======
package com.neuroking.core.network.nodes

import com.neuroking.core.network._
import scala.collection.mutable.Queue



/**
 * @author mmKALLL
 * 
 * A ConsoleOutput is a type of output node that will print all
 * received data to the console as-is. Note that the printing is not
 * immediate, but rather will depend on the flush from Network.
 */
class ConsoleOutput(var name: String = "") extends OutputNode {
  
  if (name.equals("")) name = "ConsoleInput " + id
  
  
  private[network] def out: Unit = {
    for (x <- (0 until outputQueue.length))
      println(name + " output: " + outputQueue.dequeue.toString)
  }
  
}
>>>>>>> 2a3da6903cf17f86e70b982b162280503ca4a157:src/main/scala/com/neuroking/core/network/nodes/ConsoleOutput.scala
