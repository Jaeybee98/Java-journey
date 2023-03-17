#day29 of #100days

So today, i learnt more about how Scanner works

-You can read data from a file or from the keyboard using the Scanner class. You can also scan data from a string using the Scanner class. The token-based input methods nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble(), and next() read input separated by delimiters. By default, the delimiters are whitespace characters. You can use the useDelimiter(String regex) method to set a new pattern for delimiters.

-How does an input method work? A token-based input first skips any delimiters (whitespace characters by default) then reads a token ending at a delimiter. The token is then automatically converted into a value of the byte, short, int, long, float, or double type for nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), and nextDouble(), respectively. For the next() method, no conversion is performed. If the token does not match the expected type, a runtime exception java.util.InputMismatchException will be thrown.

