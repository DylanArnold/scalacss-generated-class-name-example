package example
import example.example1.Example1
import example.example2.Example2
import example.example3.Example3
import example.example4.Example4
import scalacss.DevDefaults._

object Hello {
  def main(args: Array[String]): Unit = {
    println(
      "\n[ Example 1 ]\n\n" +
        "This simple example demonstrates that when constructing the same module twice, " +
        "ScalaCSS will create unique class names for each style. " +
        "It's not really useful from a practical point of view but illustrates the internal logic. " +
        "This approach would be more useful in practice if passing differing configuration to the module " +
        "each time it is constructed.\n\n"
    )

    println(Example1.render)

    println(
      "\n[ Example 2 ]\n\n" +
        "This example demonstrates calling a function with an argument to generate two different styles. " +
        "ScalaCSS will generate two unique class names.\n\n"
    )

    println(Example2.render)

    println(
      "\n[ Example 3 ]\n\n" +
        "Pretty much the same as example 2, but generating two styles for each function call and returning a case class." +
        "Kind of like a template with styles for each state of a button (default and disabled)." +
        "ScalaCSS will generate 2 * 4 unique class names. (2 styles for each button (function call) " +
        "times by 4 button variants smallPrimary, largePrimary, smallSecondary, largeSecondary)\n\n"
    )

    println(Example3.render)


    println(
      "\n[ Example4 ]\n\n" +
        "A mixture of Example 1 and Example 2. Demonstrates that constructing the same module multiple times " +
        "can be mixed with reusable function calls in the module. This one also passes differing configuration" +
        "each time the module is constructed. ScalaCSS generates 4 unique class names.\n\n"
    )

    println(Example4.render)
  }
}
