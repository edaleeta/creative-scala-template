import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object Sierpinski {
  val aTriangle = triangle(30, 30) lineColor Color.orchid lineWidth 2
  val base = aTriangle above (aTriangle beside aTriangle)

  def sierpinski(count: Int): Image = {
    count match {
      case 0 => base
      case n =>
        val unit = sierpinski(n-1)
        unit above (unit beside unit)
    }
  }
}
