package xitrum.routing

import java.io.Serializable
import scala.collection.mutable.ArrayBuffer
import xitrum.Action

class SerializableRouteCollection extends Serializable {
  val firstGETs = ArrayBuffer[SerializableRoute]()
  val lastGETs  = ArrayBuffer[SerializableRoute]()
  val otherGETs = ArrayBuffer[SerializableRoute]()

  val firstPOSTs = ArrayBuffer[SerializableRoute]()
  val lastPOSTs  = ArrayBuffer[SerializableRoute]()
  val otherPOSTs = ArrayBuffer[SerializableRoute]()

  val firstPUTs = ArrayBuffer[SerializableRoute]()
  val lastPUTs  = ArrayBuffer[SerializableRoute]()
  val otherPUTs = ArrayBuffer[SerializableRoute]()

  val firstDELETEs = ArrayBuffer[SerializableRoute]()
  val lastDELETEs  = ArrayBuffer[SerializableRoute]()
  val otherDELETEs = ArrayBuffer[SerializableRoute]()

  val firstOPTIONSs = ArrayBuffer[SerializableRoute]()
  val lastOPTIONSs  = ArrayBuffer[SerializableRoute]()
  val otherOPTIONSs = ArrayBuffer[SerializableRoute]()

  val firstWEBSOCKETs = ArrayBuffer[SerializableRoute]()
  val lastWEBSOCKETs  = ArrayBuffer[SerializableRoute]()
  val otherWEBSOCKETs = ArrayBuffer[SerializableRoute]()

  // Mutable map is not serializable
  var sockJsRoutes = Map[String, SockJsClassAndOptions]()

  // 404.html and 500.html are used by default
  var error404: Option[String] = None
  var error500: Option[String] = None
}
