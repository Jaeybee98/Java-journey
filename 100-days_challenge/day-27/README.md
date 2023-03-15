#day27 of #100days

I learnt about the File Class, File Input and Output

-The File class contains the methods for obtaining the properties of a file/directory, and for renaming and deleting a file/directory. Every file is placed in a directory in the file system. An absolute file name (or full name) contains a file name with its complete path and drive letter.

-A relative file name is in relation to the current working directory. The complete directory path for a relative file name is omitted. For example, Welcome.java is a relative file name. If the current working directory is c:\book, the absolute file name would be c:\book\Welcome.java.

-Constructing a File instance does not create a file on the machine. You can create a File instance for any file name regardless of whether it exists or not. You can invoke the exists() method on a File instance to check whether the file exists.

-Use the Scanner class for reading text data from a file, and the PrintWriter class for writing text data to a file. A File object encapsulates the properties of a file or a path, but it does not contain the methods for writing/reading data to/from a file (referred to as data input and output, or I/O for short). In order to perform I/O, you need to create objects using appropriate Java I/O classes. The objects contain the methods for reading/writing data from/to a file. There are two types of files: text and binary. Text files are essentially characters on disk. The java.io.PrintWriter class can be used to create a file and write data to a text file. First, you have to create a PrintWriter object for a text file as follows: PrintWriter output = new PrintWriter(filename);

I wrote some programs putting into practise what i've learnt.
