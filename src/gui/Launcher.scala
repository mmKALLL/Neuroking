package neurotest.gui

/**
 * A simple wrapper for launching the software and displaying debug messages.
 * 
 * Parameters:
 * -d, --debug - enable debug messages to console.
 * 
 */
object Launcher {
  
  var debug = false
  
  def main(args: Array[String]) {
    debug = args.filter(_.contains("-d")).length >= 1
    dmsg("debug mode enabled" + "asd " + 123, 1234, "aaaa", new Object)
  }
  
  def dmsg(in: Any*) {
    if (debug) in.map(println(_))
  }
  
}