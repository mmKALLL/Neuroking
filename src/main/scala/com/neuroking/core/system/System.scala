package com.neuroking.core.system

import com.neuroking.core.network._
import com.neuroking.core.ui.Launcher.dmsg
import scala.collection.mutable.ArrayBuffer


/**
 * @author mmKALLL
 * 
 * A system consists of a collection of networks, and handles managing input and output.
 * A system can also apply fitness functions, evolutionary progression, 
 * data mining, deep learning, and other things that happen as a function of time.
 * 
 * Any UI implementations should ALWAYS initialize at least one network in a System before trying
 * to access them. (...TODO: Initialize network in System, add getNetworks method)
 * 
 * Parameters:
 */

class System(var name: String = (Math.random * 99999).toInt.toString) {
  // TODO: Probability density function nodes and fitness evaluation
  private val networks = ArrayBuffer[Network]()
  private def allNetworkNodes(network: Network = latestNetwork) = network.getInputNodes ++ network.getHiddenNodes ++ network.getOutputNodes
  
  // Methods for adding and fetching networks easily.
  // Note that latestNetwork throws an exception if called with no networks!
  def addNetwork() = networks += new Network()
  def addNetwork(name: String) = networks += new Network(name)
  def latestNetwork = networks.last
  
  def removeNetwork(index: Int) = networks.remove(index)
  def getAllNetworks = networks
  
//  // TODO: Overloading of addNode is not elegant
//  def addNode(node: NetworkNode) = latestNetwork.addNode(node, "")
//  def addNode(node: NetworkNode, name: String) = latestNetwork.addNode(node, name)
//  def addNode(network: Network, node: NetworkNode) = network.addNode(node, "")
//  def addNode(network: Network, node: NetworkNode, name: String) = network.addNode(node, name)
  // EXTEND: Document the method
  def addNode(node: NetworkNode, network: Network = latestNetwork, name: String = "") = network.addNode(node, name)
  def addNode(network: Network, node: NetworkNode*) = node.foreach(network.addNode(_))
  def addNode(node: NetworkNode*) = node.foreach(latestNetwork.addNode(_))
  
  // TODO: Node connect overloading is not elegant
  // TODO: Node connect is too hacky
  def connect(network: Network, from: String, to: String) = {
    val nodes = allNetworkNodes(network)
    nodes.find(_.name == from) match {
      case x: Some[NetworkNode] => nodes.find(_.name == to) match {
        case y: Some[NetworkNode] => x.get.connect(y.get)
        case _ => ???
      }
      case _ => ???
    }
  }
  
  
  
  // TODO: Feedback loop, genetics, etc
  // TODO: ID system for nodes
  
  // EXTEND: Indentation for the .toString newlines.
  override def toString() = if (this.networks.isEmpty) "System " + name + " has no networks.\n\n"
                            else "System " + name + " has the following networks:\n" + 
                                  this.networks.map("{\n" + _.toString + "\n}").reduceLeft(_ + "\n" + _) + "\n"
  
}

object System {
  // TODO: Better id implementation.
  def nextID() = (Math.random * 99999).toInt
}

