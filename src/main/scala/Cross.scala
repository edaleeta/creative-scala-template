import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object Cross {
  val aCircle = circle(15)
  def cross(count: Int): Image = {
    count match {
      case 0 => aCircle
      case n => (aCircle beside (aCircle above (aCircle below cross(n-1))) beside aCircle)
    }
  }
}
