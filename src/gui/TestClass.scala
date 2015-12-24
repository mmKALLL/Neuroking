package neurotest
package gui

import neurotest._
import neurotest.network._
import neurotest.network.nodes._
import neurotest.system._

/**
 * A class that will hold unit tests eventually, but for now is used
 * for playing around with the system.
 */
class TestClass {
  
  val test = new System()
  
  println(test.toString)
  
  
  test.addNetwork
  
  test.addNode(new ConsoleInput())
  
  println(test)
  
  
}