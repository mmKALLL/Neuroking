package neurotest
package network
package nodes

import scala.collection.mutable.Queue



/**
 * A ConsoleOutput is a type of output node that will print all
 * received data to the console as-is. Note that the printing is not
 * immediate, but rather will depend on the flush from Network.
 */
class ConsoleOutput extends OutputNode {
  
  private[this] val outputQueue = Queue[Any]()
  
  // TODO: id handler
  val id: Int = (Math.random() * 10000).toInt
  var name: String = "ConsoleOutput " + id

  private[network] def out: Unit = {
    for (x <- (0 to outputQueue.length))
      println(name + " output: " + outputQueue.dequeue.toString)
  }
  
}