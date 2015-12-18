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
  
  def addNode(name: String) = {
    // add id! how to determine type?
  }
  
  // Starts the network: inputs gather input and things are passed along
  def run = ???
  
  // Once done, outputs receive a notification that they may output their data
  def flush = ???
  
}

