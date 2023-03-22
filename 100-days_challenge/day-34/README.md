#day34 of #100days

I continued learning about Binary I/O classes and how to detect the end of a file.

-DataInputStream/DataOutputStream: DataInputStream reads bytes from the stream and converts them into appropriate primitive-type values or strings. DataOutputStream converts primitive-type values or strings into bytes and outputs the bytes to the stream. DataInputStream extends FilterInputStream and implements the DataInput interface. DataOutputStream extends FilterOutputStream and implements the DataOutput interface.

-BufferedInputStream/BufferedOutputStream: BufferedInputStream/BufferedOutputStream can be used to speed up input and output by reducing the number of disk reads and writes. Using BufferedInputStream, the whole block of data on the disk is read into the buffer in the memory once. The individual data are then delivered to your program from the buffer. Using BufferedOutputStream, the individual data are first written to the buffer in the memory. When the buffer is full, all data in the buffer are written to the disk once.

-The performance of the TestDataStream program can be improved by adding buffers in the stream as follows:
DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("temp.dat")));

DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("temp.dat")));
