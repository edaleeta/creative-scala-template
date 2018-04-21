import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object StreetsAhead {
  object Tree {
    val leaves = (circle(30) fillColor Color.green).noLine
    val trunk = (rectangle(12, 30) fillColor Color.brown).noLine
    val tree = leaves above trunk

    def draw(): Unit = {
      tree.draw
    }
  }

  object House {
    val roof = (triangle(60, 30) fillColor Color.brown).noLine
    val houseTop = (rectangle(60, 25) fillColor Color.red).noLine
    val houseSide = (rectangle(24, 35) fillColor Color.red).noLine
    val door = (rectangle(12, 35) fillColor Color.black).noLine
    val block = (
      houseTop above
      (houseSide beside door beside houseSide)
    )
    val house = roof above block

    def draw(): Unit = {
      house.draw
    }
  }

  object Street {
    val yellowDash = (rectangle(45, 5) fillColor Color.yellow).noLine
    val spacer = (rectangle(15, 5) fillColor Color.black).noLine
    val lane = (rectangle(60, 15) fillColor Color.black).noLine
    val street = (
      (yellowDash beside spacer) above
      lane
    )

    def draw(): Unit = {
      street.draw
    }
  }

  val houseAndRoad = (
    (House.house beside Tree.tree) above
    (Street.street beside Street.street beside Street.street)
  )

  val block = houseAndRoad beside houseAndRoad beside houseAndRoad

  def main(args: Array[String]): Unit = {
    block.draw
  }
}
