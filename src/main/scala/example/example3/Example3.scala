package example.example3

import scalacss.DevDefaults._
import scalacss.internal.ValueT

case class ButtonStyles(
  default: StyleA,
  disabled: StyleA
)

object Example3 extends StyleSheet.Inline {
  import dsl._

  val smallPrimary = button(fontColor = gold, pad = 5)
  val largePrimary = button(fontColor = gold, pad = 20)

  val smallSecondary = button(fontColor = red, pad = 5)
  val largeSecondary = button(fontColor = red, pad = 20)

  def button(fontColor: ValueT[ValueT.Color], pad: Int): ButtonStyles = {
    val base = mixin(
      color(fontColor),
      padding(pad.px)
    )

    ButtonStyles(
      default = style(base),
      disabled = style(
        base,
        backgroundColor.gray
      )
    )
  }
}
