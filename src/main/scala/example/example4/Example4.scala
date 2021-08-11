package example.example4

import scalacss.DevDefaults._

object Example4 extends StyleSheet.Inline {
  val standard = new Example4Module(multiplier = 1)

  val large = new Example4Module(multiplier = 10)
}
