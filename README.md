# scalacss-generated-class-name-example

A simple example to show how ScalaCSS generates unique css class names to reflect the styles in scala code. 

`sbt run` will output each example to the console.

Copy of output here:

> ```
[ Example 1 ]

This simple example demonstrates that when constructing the same module twice, ScalaCSS will create unique class names for each style. It's not really useful from a practical point of view but illustrates the internal logic. This approach would be more useful in practice if passing differing configuration to the module each time it is constructed.

.Example1Module-fooStyle {
  color: green;
}

.Example1Module-fooStyle-2 {
  color: green;
}


[ Example 2 ]

This example demonstrates calling a function with an argument to generate two different styles. ScalaCSS will generate two unique class names.

.Example2-borderStyle {
  border-width: 1px;
}

.Example2-borderStyle-2 {
  border-width: 5px;
}


[ Example 3 ]

Pretty much the same as example 2, but generating two styles for each function call and returning a case class.Kind of like a template with styles for each state of a button (default and disabled).ScalaCSS will generate 2 * 4 unique class names. (2 styles for each button (function call) times by 4 button variants smallPrimary, largePrimary, smallSecondary, largeSecondary)

.Example3-button {
  color: gold;
  padding: 5px;
}

.Example3-button-2 {
  color: gold;
  padding: 5px;
  background-color: gray;
}

.Example3-button-3 {
  color: gold;
  padding: 20px;
}

.Example3-button-4 {
  color: gold;
  padding: 20px;
  background-color: gray;
}

.Example3-button-5 {
  color: red;
  padding: 5px;
}

.Example3-button-6 {
  color: red;
  padding: 5px;
  background-color: gray;
}

.Example3-button-7 {
  color: red;
  padding: 20px;
}

.Example3-button-8 {
  color: red;
  padding: 20px;
  background-color: gray;
}


[ Example4 ]

A mixture of Example 1 and Example 2. Demonstrates that constructing the same module multiple times can be mixed with reusable function calls in the module. This one also passes differing configurationeach time the module is constructed. ScalaCSS generates 4 unique class names.

.Example4Module-borderStyle {
  border-width: 1px;
}

.Example4Module-borderStyle-2 {
  border-width: 5px;
}

.Example4Module-borderStyle-3 {
  border-width: 10px;
}

.Example4Module-borderStyle-4 {
  border-width: 50px;
}
```
