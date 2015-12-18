package neurotest
package network

import scala.collection.mutable.ArrayBuffer

/**
 * This class represents a single network and controls the nodes
 * within, distributing and managing IDs and names, etc.
 *
 * An important part of Network is keeping track of when the network is
 * ready to output, at which point it flushes the output nodes' data.
 *
 */
class Network {
  // TODO: specification implementation

  private val inputNodes = ArrayBuffer[InputNode]()
  private val hiddenNodes = ArrayBuffer[HiddenNode]()
  private val outputNodes = ArrayBuffer[OutputNode]()
  private var ready = false

  def getInputNodes = inputNodes
  def getHiddenNodes = hiddenNodes
  def getOutputNodes = outputNodes
  
  // Adds a node into the network, depending on type.
  def addNode(node: InputNode, name: String = "") = {
    if (!name.isEmpty()) {
      node.name = name
    }
    inputNodes += node
  }
  
  def addNode(node: HiddenNode, name: String = "") = {
    if (!name.isEmpty()) {
      node.name = name
    }
    hiddenNodes += node
  }
  
  def addNode(node: OutputNode, name: String = "") = {
    if (!name.isEmpty()) {
      node.name = name
    }
    outputNodes += node
  }
  
  
  // Starts the network: inputs gather input and things are passed along
  def run = inputNodes.foreach { _.readInput() }

  // Once done, outputs receive a notification that they may output their data
  def flush = outputNodes.foreach { _.out }

}

