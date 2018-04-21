import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object StackingBoxes {
  val aBox = rectangle(20, 20) fillColor Color.royalBlue lineWidth 0 

  def stack(count: Int): Image = {
    count match {
      case 0 => Image.empty
      case n => aBox above stack(n-1)
    }
  }
}
