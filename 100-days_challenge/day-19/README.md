#day19 of #100days

Today, i continued from where i stopped yesterday. I learnt about The StringBuilder and StringBuffer Classes, Modifying Strings in the StringBuilder, The toString, capacity, length, setLength, and charAt Methods

-The StringBuilder and StringBuffer classes are similar to the String class except that the String class is immutable.  the StringBuilder and StringBuffer classes can be used wherever a string is used. StringBuilder and StringBuffer are more flexible than String. You can add, insert, or append new contents into StringBuilder and StringBuffer objects, whereas the value of a String object is fixed once the string is created.

-The StringBuilder class is similar to StringBuffer except that the methods for modifying the buffer in StringBuffer are synchronized, which means that only one task is allowed to execute the methods. Use StringBuffer if the class might be accessed by multiple tasks concurrently, because synchronization is needed in this case to prevent corruptions to StringBuffer.

-The StringBuilder class provides several overloaded methods to append boolean, char, char[], double, float, int, long, and String into a string builder.

-The capacity() method returns the current capacity of the string builder. The capacity is the number of characters the string builder is able to store without having to increase its size.

-The length() method returns the number of characters actually stored in thenstring builder.

-The setLength(newLength) method sets the length of the string builder.

-The charAt(index) method returns the character at a specific index in the string builder. The index is 0 based.

So, i wrote a program that ignores nonalphanumeric characters in checking whether a string is a palindrome.
