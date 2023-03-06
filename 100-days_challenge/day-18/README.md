#day17 of #100days

I learnt about Immutable Strings and Interned Strings, Replacing and Splitting Strings, Matching, Replacing and Splitting by Patterns, Conversion between Strings and Arrays, Converting Characters and Numeric Values to Strings

-A String object is immutable; its contents cannot be changed. Because strings are immutable and are ubiquitous in programming, the JVM uses a unique instance for string literals with the same character sequence in order to improve efficiency and save memory. Such an instance is called an interned string.

-The String class provides the methods for replacing and splitting strings. Once a string is created, its contents cannot be changed. The methods replace, -replaceFirst, and replaceAll return a new string derived from the original string (without changing the original string!). Several versions of the replace methods are provided to replace a character or a substring in the string with a new character or a new substring. The split method can be used to extract tokens from a string with the specified delimiters.

-Often we will need to write code that validates user input, such as to check whether the input is a number, a string with all lowercase letters. A simple and effective way to accomplish this task is to use the regular expression.
A regular expression (abbreviated regex) is a string that describes a pattern for matching a set of strings. You can match, replace, or split a string by specifying a pattern. This is an extremely useful and powerful feature.

Strings are not arrays, but a string can be converted into an array and vice versa. To convert a string into an array of characters, use the toCharArray method. You can also use the getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) method to copy a substring of the string from index srcBegin to index srcEnd–1 into a character array dst starting from index dstBegin.

-Recall that you can use Double.parseDouble(str) or Integer.parseInt(str) to convert a string to a double value or an int value", and you can convert a character or a number into a string by using the string concatenating operator. Another way of converting a number into a string is to use the overloaded static valueOf method. This method can also be used to convert a character or an array of characters into a string.

So, i couldn't write any programs today as i'm not done learning couple with the fact that ALX's tasks (low-level programming) was somehow daunting. 
