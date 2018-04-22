import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object ConcentricCircles {
  def concentricCircles(count: Int, size: Int): Image = {
    count match {
      case 0 => Image.empty
      case n =>
        Image.circle(size + n * 10).lineWidth(3).lineColor(Color.royalBlue) on
        concentricCircles(n-1, size)
    }
  }
}