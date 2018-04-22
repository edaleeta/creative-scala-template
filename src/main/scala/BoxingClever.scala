def boxes(count: Int): Image = {
  val aBox = {
    println("Creating a box.")
    Image.rectangle(20, 20).fillColor(Color.royalBlue)
  }

  def loop(count: Int): Image = {
    count match {
      case 0 => Image.empty
      case n => aBox beside loop(n-1)
    }
  }
  loop(count)
}