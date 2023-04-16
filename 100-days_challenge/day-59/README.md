#day59 of #100days

I learnt about Hashing today.

-Hashing uses a hashing function to map a key to an index. A typical hash function first converts a search key to an integer value called a hash code, then compresses the hash code into an index to the hash table.

-Java’s root class Object has the hashCode method, which returns an integer hash code. By default, the method returns the memory address for the object. The general contract for the hashCode method is as follows:
	i) You should override the hashCode method whenever the equals method is overridden to ensure that two equal objects return the same hash code.
	ii) During the execution of a program, invoking the hashCode method multiple times returns the same integer, provided that the object’s data are not changed.
	iii) Two unequal objects may have the same hash code, but you should implement the hashCode method to avoid too many such cases.

-Hashing is superefficient. It takes O(1) time to search, insert, and delete an element using hashing.
