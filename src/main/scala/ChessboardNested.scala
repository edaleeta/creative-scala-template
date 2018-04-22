def chessboard(count: Int): Image = {
  val blackSquare = {
      println("Creating black square.")
      Image.rectangle(30, 30) fillColor Color.black
  }
  val redSquare = {
      println("Creating red square.")
      Image.rectangle(30, 30) fillColor Color.red
  }
  
  val base = {
    println("Creating base.")
    (redSquare beside blackSquare) above (blackSquare beside redSquare)
  }

  def loop(count: Int): Image = {
    count match {
      case 0 => base
      case n =>
        val unit = loop(n-1)
        (unit beside unit) above (unit beside unit)
    }
  }

  loop(count)
}