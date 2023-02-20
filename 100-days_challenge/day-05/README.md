#day5 of #100days

Today, i learnt and practise more about loops to get a better understanding of how it really works and how it can help simplify my codes.

I also learnt more about the String data type and the character (char) data type.

1- The character type (char) represents a single character (e.g 'a', 'b', 'c' etc). It is enclosed in a single quotation mark. The Character class contains the methods isDigit( for testing whether a character is a digit), isLetter(for testing whether a character is a letter), isLowerCase(for testing whether a character is in lowercase), isUpperCase(for testing whether a character is in uppercase). There are several useful methods in the Character class which can simplify codes and make it more readable.

2- The String type is a sequence of characters. It is not a primitive data type (It's a reference data type). Strings are immutable objects in java. There are various useful methods in the String class predefined in java, such as: 
length() - which returns the number of chars in the string.
charAt(index) - returns the char at the specified index.
concat(s1) - returns a new string that concatenates this string with s1.
toUpperCase() - returns a new string with all letters in uppercase
toLowerCase() - returns a new string with all letters in lowercase
equals(s1) - returns true if this string is equal to s1.
compareTo(s1) - returns an integer greater than 0, equal to 0 or less than 0.
contains(s1) - returns true if s1 is a substring in this string.
There are several other useful methods in the String class predefined to make live easier for java users.

I also did some learning around conversion between strings and numbers by using the Integer.parseInt(int String) to convert a string into an int value. I learnt about formatting console outputs too by using the printf format. The syntax for using the printf format is: System.out.printf(format, item1, item2, ..., itemk);. There are various format specifiers too e.g %b (for boolean values), %c (for chars), %d (for a decimal integer), %s (for a string) etc.

So today, i practised what i've learnt by building a program that prompts the user to enter two cities and display them in alphabetical order and a lottery game similar to the one i built in #day3 albeit this time, i used some of the char and String methods.
