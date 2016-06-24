package com.neuroking.core.ui

import com.neuroking.test._

/**
 * @author mmKALLL
 * 
 * A simple wrapper for launching the software and displaying debug messages.
 * 
 * Command line arguments:
 * -d, --debug - enable debug messages to console.
 * -T, --test - run tests instead of UI
 * 
 */
object Launcher {
  
  var debug = false
  var runTests = false
  
  def main(args: Array[String]) {
    // EXTEND: Better and safer system for parsing arguments; fix nonescaped user args
    debug = args.filter(_.contains("-d")).length >= 1
//    dmsg("debug mode enabled" + "asd " + 123, 1234, "aaaa", new Object)
    runTests = args.filter(_.toLowerCase().contains("-t")).length >= 1
    if (runTests)
      new TestClass()
    else
      print("Note: The UI is still under work. Execute with --test to run tests.")
  }
  
  // TODO: Debug levels based on message prefix
  def dmsg(in: Any*) {
    if (debug) in.map(println(_))
  }
  
}
