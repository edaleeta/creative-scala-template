import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object Chessboard {
  val redSquare = rectangle(20, 20) fillColor Color.red
  val blackSquare = rectangle(20, 20) fillColor Color.black
  val boardUnit = (
    (redSquare beside blackSquare) above
    (blackSquare beside redSquare)
  )
  
  def chessboard(count: Int): Image = {
    count match {
      case 0 => boardUnit
      case n =>
        val unit = chessboard(n-1)
        (unit beside unit) above (unit beside unit)
    }
  }
}
