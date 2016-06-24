package com.neuroking.core.ui

// FIXME: Change the source file folder paths to reflect new packages

/**
 * A simple wrapper for launching the software and displaying debug messages.
 * 
 * Command line arguments:
 * -d, --debug - enable debug messages to console.
 * 
 */
object Launcher {
  
  var debug = false
  
  def main(args: Array[String]) {
    debug = args.filter(_.contains("-d")).length >= 1
//    dmsg("debug mode enabled" + "asd " + 123, 1234, "aaaa", new Object)
    new TestClass()
  }
  
  def dmsg(in: Any*) {
    if (debug) in.map(println(_))
  }
  
}