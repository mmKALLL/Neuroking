package network.nodetypes
import neurotest.gui.Launcher.dmsg
import neurotest.network._
import scala.collection.mutable.ArrayBuffer


/**
 * A trait that defines the nodes that are part of the neural network.
 * Nodes can create connections with each other.
 */

trait NetworkNode {
  
  private val inputs = ArrayBuffer[Connection]()
  private val outputs = ArrayBuffer[Connection]()
  
  // TODO: finish connections 
  def connect(that: NetworkNode) = this.outputs += new Connection(this, that);
  
}