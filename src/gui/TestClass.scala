package com.neuroking.core.ui

import com.neuroking.core.system._
import com.neuroking.core.network._
import com.neuroking.core.network.nodes._
import com.neuroking.core.ui._
import java.io._

/**
 * A class that will hold unit tests eventually, but for now is used
 * for playing around with the system.
 */

class TestClass {
  
  val test = new System
  
  assert(true, "this assertion should be true")
  
  // Test number 1:   CI--RP--CO
  test.addNetwork("1")
  assert(test.latestNetwork.name == "1", "System.latestNetwork doesn't work as intended")
  assert(test.getAllNetworks(0).name == "1", "System.getAllNetworks doesn't return as intended")
  assert(test.latestNetwork.getInputNodes.isEmpty, "empty network has input nodes")
  assert(test.latestNetwork.getHiddenNodes.isEmpty, "empty network has hidden nodes")
  assert(test.latestNetwork.getOutputNodes.isEmpty, "empty network has output nodes")
  
  test.latestNetwork.addNode(new ConsoleInput, "inp1")
  test.latestNetwork.addNode(new RelayProcessor, "hid1")
  test.addNode(new ConsoleOutput("out1"))
  
  assert(test.latestNetwork.getInputNodes.length == 1, "network has too many input nodes")
  assert(test.latestNetwork.getHiddenNodes.length == 1, "network has too many hidden nodes")
  assert(test.latestNetwork.getOutputNodes.length == 1, "network has too many output nodes")
  
  test.latestNetwork.getInputNodes(0).connect(test.latestNetwork.getHiddenNodes(0))
  test.latestNetwork.getHiddenNodes(0).connect(test.latestNetwork.getOutputNodes(0))
  
  assert(test.latestNetwork.getInputNodes(0).toString().contains("[hid1]"), "could not connect input to relay")
  assert(test.latestNetwork.getHiddenNodes(0).toString().contains("[out1]"), "could not connect relay to output")
  
  
  // Test number 2:   [12, 12]
  test.addNetwork("2")
  test.addNode(new ConsoleInput("in1"), new ConsoleInput("in2"), 
      new RelayProcessor("hid1"), 
      new ConsoleOutput("out1"), new ConsoleOutput("out2"))
  
  test.connect(test.latestNetwork, "in1", "hid1")
  test.connect(test.latestNetwork, "in2", "hid1")
  test.connect(test.latestNetwork, "hid1", "out1")
  test.connect(test.latestNetwork, "hid1", "out2")
  
  
  // Test number 3:   [12, 122]
  test.addNetwork("3")
  test.addNode(new ConsoleInput("in1"), new ConsoleInput("in2"), new ConsoleInput("in3"), 
      new RelayProcessor("hid1"), new RelayProcessor("hid2"),
      new ConsoleOutput("out1"), new ConsoleOutput("out2"), new ConsoleOutput("out3"))
  
  test.connect(test.latestNetwork, "in1", "hid1")
  test.connect(test.latestNetwork, "in2", "hid1")
  test.connect(test.latestNetwork, "in2", "hid2")
  test.connect(test.latestNetwork, "hid1", "out1")
  test.connect(test.latestNetwork, "hid1", "out2")
  test.connect(test.latestNetwork, "hid2", "out2")
  
  
  // Test number 4:   [1233, 3]
  test.addNetwork("4")
  test.addNode(new ConsoleInput("in1"), new ConsoleInput("in2"), new ConsoleInput("in3"), 
      new RelayProcessor("hid11"), new RelayProcessor("hid12"),
      new RelayProcessor("hid21"), new RelayProcessor("hid22"),
      new ConsoleOutput("out1"), new ConsoleOutput("out2"))
  
  test.connect(test.latestNetwork, "in1", "hid11")
  test.connect(test.latestNetwork, "in2", "hid11")
  test.connect(test.latestNetwork, "in3", "hid12")
  test.connect(test.latestNetwork, "hid11", "hid21")
  test.connect(test.latestNetwork, "hid12", "hid21")
  test.connect(test.latestNetwork, "hid12", "hid22")
  test.connect(test.latestNetwork, "hid21", "out1")
  test.connect(test.latestNetwork, "hid22", "out1")
  test.connect(test.latestNetwork, "hid22", "out2")
  
  
  // Test number 5:   [11112233, 111233, 12]
  test.addNetwork("5")
  test.addNode(new ConsoleInput("in1"), new ConsoleInput("in2"), new ConsoleInput("in3"), 
      new RelayProcessor("hid11"), new RelayProcessor("hid12"), new RelayProcessor("hid13"),
      new RelayProcessor("hid21"), new RelayProcessor("hid22"), new RelayProcessor("hid23"), new RelayProcessor("hid24"),
      new ConsoleOutput("out1"), new ConsoleOutput("out2"), new ConsoleOutput("out3"))
  
  test.connect(test.latestNetwork, "in1", "hid11")
  test.connect(test.latestNetwork, "in1", "hid12")
  test.connect(test.latestNetwork, "in1", "hid13")
  test.connect(test.latestNetwork, "in2", "hid11")
  test.connect(test.latestNetwork, "in2", "hid13")
  test.connect(test.latestNetwork, "in3", "hid12")
  
  test.connect(test.latestNetwork, "hid11", "hid21")
  test.connect(test.latestNetwork, "hid11", "hid22")
  test.connect(test.latestNetwork, "hid12", "hid21")
  test.connect(test.latestNetwork, "hid12", "hid22")
  test.connect(test.latestNetwork, "hid12", "hid23")
  test.connect(test.latestNetwork, "hid12", "hid24")
  test.connect(test.latestNetwork, "hid13", "out3")
  
  test.connect(test.latestNetwork, "hid21", "out1")
  test.connect(test.latestNetwork, "hid22", "out1")
  test.connect(test.latestNetwork, "hid22", "out2")
  test.connect(test.latestNetwork, "hid23", "out2")
  
  
  
  println(test)
  
  
  
  // Setting up the console tests.
  private val oldOut = java.lang.System.out
  private val baos = new ByteArrayOutputStream()
  java.lang.System.setOut(new PrintStream(baos))
  
  
  // TODO: Should not need to flush the System manually.
  // TODO: Test should be automated.
  for (x <- test.getAllNetworks) {
    println("\ntest case " + x.name + "; " + x.getInputNodes.length + " input nodes")
    x.run
    x.flush
  }
  
  // Set the console back.
  var result = baos.toString()
  java.lang.System.out.flush()
  java.lang.System.setOut(oldOut)
  
  println(result)
  //assert(result == "out1 output: asdf\n")
  
}

class TestClassOld {
  
  val test = new System()
  
  println(test.toString)
  
  
  test.addNetwork()
  
  test.addNode(new ConsoleInput())
  test.addNode(new ConsoleInput(), test.latestNetwork, "asdasdasd of " + test.name)
  
  println(test)
  
  test.addNetwork()
  test.addNode(new RelayProcessor())
  test.addNode(new RelayProcessor())
  test.addNode(new ConsoleInput())
  test.addNode(new RelayProcessor())
  test.addNode(new ConsoleOutput())
  
  println("\n" + test)
  
  
}