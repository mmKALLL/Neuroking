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
  private val hiddenNodes = ArrayBuffer[NetworkNode]()
  private val outputNodes = ArrayBuffer[NetworkNode]()
  private var ready = false
  
  def getInputNodes = inputNodes
  def getHiddenNodes = hiddenNodes
  def getOutputNodes = outputNodes
  
  
  def addNode(node: NetworkNode, name: String = "") = {
    if (!name.isEmpty()) {
      node.name = name
    }
    
    node.TYPE match {
      case "input" => inputNodes += node
      case "hidden" => hiddenNodes += node
      case "output" => outputNodes += node
      case _ => throw new NotImplementedError("The Node.TYPE is invalid. Please file a bug report or contact the developer.")
    }
  }
  
  // Starts the network: inputs gather input and things are passed along
  def run = inputNodes.foreach { x => x.readInput() }
  
  // Once done, outputs receive a notification that they may output their data
  def flush = ???
  
}

