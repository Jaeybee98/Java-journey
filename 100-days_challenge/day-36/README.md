#day36 of @100days

I learnt about Serialising Arrays and Random-Access Files.

-An array is serializable if all its elements are serializable. An entire array can be saved into a file using writeObject and later can be restored using readObject. I wrote a program that stores an array of five int values and an array of three strings and reads them back to display on the console.

-All of the streams i have used so far are known as read-only or write-only streams. These streams are called sequential streams. A file that is opened using a sequential stream is called a sequential-access file. The contents of a sequential-access file cannot be updated. However, it is often necessary to modify files. Java provides the RandomAccessFile class to allow data to be read from and written to at any locations in a file. A file that is opened using the RandomAccessFile class is known as a random-access file.
