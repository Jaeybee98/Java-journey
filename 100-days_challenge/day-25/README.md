#day25 of #100days

I continued from where i stopped yesterday. I took a deep dive into Exceptions Handling in Java. I learnt about the advantages of Exceptions Handling, Exception types, Declaring and Throwing Exceptions.

-Advantage of using exception handling: It enables a method to throw an exception to its caller, enabling the caller to handle the exception. Without this capability, the called method itself must handle the exception or terminate the program.

-Often the called method does not know what to do in case of error. This is typically the case for the library methods. The library method can detect the error, but only the caller knows what needs to be done when an error occurs. The key benefit of exception handling is separating the detection of an error (done in a called method) from the handling of an error (done in the calling method).

-Exceptions are objects, and objects are defined using classes. The root class for exceptions is java.lang.Throwable. The exception classes can be classified into three major types: system errors, exceptions, and runtime exceptions.

-To declare an exception in a method, use the throws keyword in the method header, as in this example: public void myMethod() throws IOException.  If the method might throw multiple exceptions, add a list of the exceptions, separated by commas, after throws: public void myMethod() throws Exception1, Exception2, ..., ExceptionN

-A program that detects an error can create an instance of an appropriate exception type and throw it. This is known as throwing an exception. Here is an example: Suppose the program detects that an argument passed to the method violates the method contract (e.g., the argument must be nonnegative, but a negative argument is passed); the program can create an instance of IllegalArgumentException and throw it, as follows:
IllegalArgumentException ex =
new IllegalArgumentException("Wrong Argument");
throw ex;
Or, if you prefer, you can use the following: throw new IllegalArgumentException("Wrong Argument");

So, i wrote some programs to test what i've learnt about exceptions.
