package com.neuroking.core.network

import scala.collection.mutable.Queue


/**
 * @author mmKALLL
 *
 * A node type that outputs the information received in some manner or another.
 * They should not output prematurely, as it would break potential parallelization.
 */

trait OutputNode extends NetworkNode {

  protected val outputQueue = Queue[Any]()

  // When the Network flushes its outputs, they will display their data in a
  // corresponding way; the exact implementation is left to each individual type.
  private[network] def out


  // Inherited methods from NetworkNode
  override def connect(that: NetworkNode) = throw new UnsupportedOperationException("Cannot call connect for an OutputNode!")

  override private[network] def send(data: Any, to: Connection*) = throw new UnsupportedOperationException("Cannot call send for an OutputNode!")
  override private[network] def receive(data: Any, from: Connection) = outputQueue.enqueue(data)

  override def toString = super.toString
}
