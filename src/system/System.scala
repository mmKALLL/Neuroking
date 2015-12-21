package neurotest
package system

import neurotest.gui.Launcher.dmsg
import scala.collection.mutable.ArrayBuffer
import neurotest.network._


/**
 * @author mmKALLL
 * 
 * A system consists of a collection of networks, and handles managing input and output.
 * A system can also apply fitness functions, evolutionary progression, 
 * data mining, deep learning, and other things that happen as a function of time.
 * 
 * Parameters:
 */

class System(var name: String = (Math.random * 99999).toInt.toString) {
  
  private val networks = ArrayBuffer[Network]()
  
  def addNetwork = networks += new Network()
  def latestNetwork = networks.last
  
  def removeNetwork(index: Int) = networks.remove(index)
  def getAllNetworks = networks
  
  // FIXME: addNode overloading does not work
  def addNode(node: NetworkNode, name: String = "") = latestNetwork.addNode(node, name)
  def addNode(network: Network, node: NetworkNode, name: String = "") = network.addNode(node, name)
  
  // TODO: feedback loop, genetics, etc
  // TODO: id system for nodes
  
  override def toString() = "System " + name + " has the following networks:\n" + networks.foreach(_.toString + "\n") + "\n"
  
}