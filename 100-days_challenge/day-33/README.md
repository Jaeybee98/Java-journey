#day33 of #100days

Today, i made a quick introduction to Binary I/O in Java, hoe Text I?O is handled in Java, differences and similarities between Text I/O and Binary I/O and Binary I/O classes.

-Java provides many classes for performing text I/O and binary I/O. Files can be classified as either text or binary. A file that can be processed (read, created, or modified) using a text editor such as Notepad on Windows or vi on UNIX is called a text file. All other files are called binary files. You cannot read binary files using a text editor—they are designed to be read by programs. For example, Java source programs are text files and can be read by a text editor, but Java class files are binary files and are read by the JVM.

-Text data are read using the Scanner class and written using the PrintWriter class. Recall that a File object encapsulates the properties of a file or a path but does not contain the methods for reading/writing data from/to a file. In order to perform I/O, you need to create objects using appropriate Java I/O classes. The objects contain the methods for reading/writing data from/to a file.

-Binary I/O does not involve encoding or decoding and thus is more efficient than text I/O. Computers do not differentiate between binary files and text files. All files are stored in binary format, and thus all files are essentially binary files. Text I/O is built upon binary I/O to provide a level of abstraction for character encoding and decoding. Binary I/O does not require conversions. If you write a numeric value to a file using binary I/O, the exact value in the memory is copied into the file.

-In general, you should use text input to read a file created by a text editor or a text output program, and use binary input to read a file created by a Java binary output program.
