#day8 of #100days

I learnt about arrays in java today. There are two types of arrays: 1) Single-Dimensional arrays and 2) Multi-Dimensional arrays.

Today, i learnt about single-dimensional arrays. An array which stores a fixed size of elements of the same type. it is an efficient and organised data structure. An array can be used to store a collection of data. Once an array is created, it's size is fixed.
Unlike declarations for primitive data type variables, the declaration of an array variable does not allocate any space in memory for the array. An array variable is not a primitive data type variable. An array variable contains a reference to an array.

A variable is declared as an array type using the syntax elementType[] arrayRefVar or elementType arrayRefVar[]. The style elementType[] arrayRefVar is preferred, although elementType arrayRefVar[] is legal e.g double[] mylist;

You cannot assign elements to an array unless it has already been created. You can create an array by using the new operator with the following syntax: new elementType[arraySize]. After an array is created, its size becomes permanent and can be obtained using arrayRefVar.length. Since the index of an array always begins with 0, the last index is always arrayRefVar.length − 1. An out-of-bounds error will occur if you attempt to reference elements beyond the bounds of an array.

Java has a shorthand notation, known as the array initializer, which combines declaring an array, creating an array, and initializing an array in one statement, using the syntax elementType[] arrayRefVar = {value0,value1, . . . , valuek}.

I couldnt finish learning everything about arrays today, so, i'll continue tomorrow. So, i wrote a program using arrays to read 100 numbers, get the average and find the number of items greater than the average.
