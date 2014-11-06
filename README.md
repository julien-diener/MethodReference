MethodReference
===============

Simple example of using method reference with Java 8

The Application.main creates a `FirstClass` and a `SecondClass` instances, 
then call the `second.applyFunction` with the method `first.addPrefix` as argument.

Here `java.util.function.Function` is used as function-type argument: 
a function with one generic argument and a generic output. Look at `java.util.function` for other function-type:

http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
