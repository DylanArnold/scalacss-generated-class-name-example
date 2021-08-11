package example.example1

import scalacss.DevDefaults._
import scalacss.internal.ValueT

class Example1Module(implicit r: StyleSheet.Register) extends StyleSheet.Inline()(r) {

  import dsl._

  val fooStyle = style(
    color.green
  )
}
