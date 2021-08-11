package example.example4

import scalacss.DevDefaults._

class Example4Module(multiplier: Int)(implicit r: StyleSheet.Register) extends StyleSheet.Inline()(r) {

  import dsl._

  def borderStyle(x: Int) = style(borderWidth(x.px))

  val smallBorder = borderStyle(1 * multiplier)

  val thickBorder = borderStyle(5 * multiplier)
}
