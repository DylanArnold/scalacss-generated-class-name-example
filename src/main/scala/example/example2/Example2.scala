package example.example2

import scalacss.DevDefaults._

object Example2 extends StyleSheet.Inline {
  import dsl._

  def borderStyle(x: Int) = style(borderWidth(x.px))

  val smallBorder = borderStyle(1)

  val thickBorder = borderStyle(5)
}
