package neurotest
package network

import scala.collection.mutable.ArrayBuffer
import neurotest.gui.Launcher.dmsg

/**
 * This class represents a single network and controls the nodes
 * within, distributing and managing IDs and names, etc.
 *
 * An important part of Network is keeping track of when the network is
 * ready to output, at which point it flushes the output nodes' data.
 *
 */
class Network {

  private val inputNodes = ArrayBuffer[InputNode]()
  private val hiddenNodes = ArrayBuffer[HiddenNode]()
  private val outputNodes = ArrayBuffer[OutputNode]()
  private var ready = false

  def getInputNodes = inputNodes
  def getHiddenNodes = hiddenNodes
  def getOutputNodes = outputNodes
  
  // Adds a node into the network, depending on type.
  def addNode(node: NetworkNode, name: String = "") = {
    if (!name.isEmpty()) {
      node.name = name
    }
    node match {
      case node: InputNode => inputNodes += node
      case node: HiddenNode => hiddenNodes += node
      case node: OutputNode => outputNodes += node
      case _ => throw new Exception("The type of node " + node.name + " is not supported!")
    }
  }
  
  // FIXME: for-comprehensions
  // Starts the network: inputs gather input and things are passed along
  def run = inputNodes.foreach { _.readInput() }

  // Once done, outputs receive a notification that they may output their data
  def flush = outputNodes.foreach { _.out }

}

