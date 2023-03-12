#day24 of #100days

Today was somewhat hectic for me but i managed to learn about Exceptions Handling. I'd be taking a deep dive into it tomorrow.

Java provides a powerful exception handling mechanism that allows programmers to write code that can gracefully handle unexpected errors and exceptions. An exception is an event that occurs during the execution of a program that disrupts the normal flow of control.

In Java, exceptions are objects that are thrown by the Java Virtual Machine (JVM) or by Java code. The code that throws an exception is responsible for creating an exception object and throwing it using the throw keyword.

To handle exceptions in Java, programmers use a try-catch block. The code that might throw an exception is placed inside a try block, and the catch block is used to handle any exceptions that are thrown. If an exception is thrown, the JVM looks for a catch block that can handle it, based on the type of the exception. Here's an example of a try-catch block:
try {
    // code that might throw an exception
} catch (ExceptionType e) {
    // code to handle the exception
}

In this example, the try block contains code that might throw an exception of type ExceptionType. If an exception of that type is thrown, the catch block will handle it.

Java also provides a finally block, which is executed after the try block and any catch blocks. The finally block is used to release any resources that were acquired in the try block, regardless of whether an exception was thrown or not.

So, i wrote some codes to practise what i learnt today.
