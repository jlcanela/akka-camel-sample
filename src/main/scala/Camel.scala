package sample.kernel.hello

import akka.camel.{ CamelMessage, Consumer }
 
class Consumer2 extends Consumer {
  def endpointUri = "jetty:http://localhost:8877/camel/default?maxThreads=80"
 
  def receive = {
    case msg: CamelMessage ⇒ sender ! ("Hello %s" format msg.bodyAs[String])
  }
}

class ConsumerNetty extends Consumer {
  def endpointUri = "netty:tcp://localhost:8878"
 
  def receive = {
    case msg: CamelMessage ⇒ sender ! ("Hello %s" format msg.bodyAs[String])
  }
}


