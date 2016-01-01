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
class Network(var name: String = (Math.random * 99999).toInt.toString) {

  private val inputNodes = ArrayBuffer[InputNode]()
  private val hiddenNodes = ArrayBuffer[HiddenNode]()
  private val outputNodes = ArrayBuffer[OutputNode]()
  private var ready = false

  // FIXME: a better system for accessing nodes to add connections
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
  
  // EXTEND: for-comprehensions are slow; use while-loops instead
  // Starts the network: inputs gather input and things are passed along
  def run = inputNodes.foreach { _.readInput() }

  // Once done, outputs receive a notification that they may output their data
  def flush = outputNodes.foreach { _.out }
  
  
  override def toString() = "Network, name:" + name + "\n" +
                            "List of input nodes:\n" + 
                            (if (this.inputNodes.isEmpty) "[]"
                            else "[" + this.inputNodes.map(_.toString + ",\n ").reduceLeft(_ + _).dropRight(3) + " ]") +
                            "\nList of hidden nodes:\n" +
                            (if (this.hiddenNodes.isEmpty) "[]"
                            else "[" + this.hiddenNodes.map(_.toString + ",\n ").reduceLeft(_ + _).dropRight(3) + " ]") +
                            "\nList of output nodes:\n" +
                            (if (this.outputNodes.isEmpty) "[]"
                            else "[" + this.outputNodes.map(_.toString + ",\n ").reduceLeft(_ + _).dropRight(3) + " ]") +
                            ""
}

