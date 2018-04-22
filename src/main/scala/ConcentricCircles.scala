import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object ConcentricCircles {
  def concentricCircles(count: Int, size: Int, color: Color): Image = {
    count match {
      case 0 => Image.empty
      case n =>
        val thisSize = n * 10 + size
        val thisSpin = (n * 15).degrees
        val thisAlpha = (1 - (n * 0.02)).normalized
        Image.circle(thisSize).lineWidth(3).lineColor(color.spin(thisSpin).alpha(thisAlpha)) on
        concentricCircles(n-1, size, color)
    }
  }
}