package network.nodetypes
import neurotest.gui.Launcher.dmsg // The debug message function
import scala.collection.mutable.ArrayBuffer

/**
 * A node which takes some sort of input and passes that along to HiddenNodes to process.
 */

/**
 * An InputNode receives input in some manner (e.g. console, file, visual data, ...),
 * can modify it and then sends that in some manner to its outputs to process.
 */

trait InputNode extends NetworkNode {

  val outputs = ArrayBuffer[Connection]()

  override def toString = super.toString +
                          "\noutputs:\n" + outputs.foreach { _.toString + "\n" }

}