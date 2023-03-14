#day26 of #100days

Today, i learnt about The finally clause, When to use Exceptions, Rethrowing Exceptions, Chained Exceptions

-The finally clause is always executed regardless of whether an exception occurred or not. Occasionally, you may want some code to be executed regardless of whether an exception occurs or is caught. Java has a finally clause that can be used to accomplish this objective. The syntax for the finally clause might look like this:
try {
  statements;
}

catch (TheException ex) {
  handling ex;
}

finally {
  finalStatements;
}

-When should you use a try-catch block in the code? Use it when you have to deal with unexpected error conditions. Do not use a try-catch block to deal with simple, expected situations. Which situations are exceptional and which are expected is sometimes difficult to decide. The point is not to abuse exception handling as a way to deal with a simple logic test.

-Java allows an exception handler to rethrow the exception if the handler cannot process the exception, or simply wants to let its caller be notified of the exception. The syntax for rethrowing an exception may look like this:
try {
  statements;
}
catch (TheException ex) {
  perform operations before exits;
  throw ex;
}

The statement throw ex rethrows the exception to the caller so other handlers in the caller get a chance to process the exception ex.

-Throwing an exception along with another exception forms a chained exception. Sometimes, you may need to throw a new exception (with additional information) along with the original exception. This is called chained exceptions.

I wrote some programs to test what i've learnt.
