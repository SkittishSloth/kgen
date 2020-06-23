package kgen.core.events

import java.util.concurrency.*
import java.util.concurrency.atomic.AtomicBoolean

class EventBus {
  
  private val queues = ConcurrentHashMap<KClass<out Any>, BlockingQueue>()
}