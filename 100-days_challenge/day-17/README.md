#day17 of #100days

Today, i learnt about Processing Primitive Data Type Values as Objects, Th BigInteger and BigDecimal Classes

-A primitive-type value is not an object, but it can be wrapped in an object using a wrapper class in the Java API. Many Java methods require the use of objects as arguments. Java offers a convenient way to incorporate, or wrap, a primitive data type value into an object (e.g., wrapping an int into an Integer object, wrapping a double into a Double object, and wrapping a char into a Character object). By using a wrapper class, you can process primitive data type values as objects. Java provides Boolean, Character, Double, Float, Byte, Short, Integer, and Long wrapper classes in the java.lang package for primitive data types. The Boolean class wraps a Boolean value true or false. 

-A primitive-type value can be automatically converted to an object using a wrapper class, and vice versa, depending on the context.This is called 'Auto Boxing' and 'Auto Unboxing'.

-The BigInteger and BigDecimal classes can be used to represent integers or decimal numbers of any size and precision. If you need to compute with very large integers or high-precision floating-point values, you can use the BigInteger and BigDecimal classes in the java.math package. Both are immutable.

I wrote a program that returns the factorial of any Integer using the BigInteger class and a class named "Course' that uses an array to store the students offering the course.
