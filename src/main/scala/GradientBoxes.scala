import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object GradientBoxes {
  val aBox = rectangle(30, 30) lineWidth 3

  def gradientBoxes(count: Int, color: Color): Image = {
    count match {
      case 0 => Image.empty
      case n => 
        (aBox.fillColor(color).lineColor(color darken 0.3.normalized)) beside
        gradientBoxes(n-1, color spin 15.degrees)
    }
  }
}
