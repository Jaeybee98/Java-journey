#day46 of #100days

I learnt about Sets and Maps today.

-A set is an efficient data structure for storing and processing nonduplicate elements. A map is like a dictionary that provides a quick lookup to retrieve a value using a key.

-You can create a set using one of its three concrete classes: HashSet, LinkedHashSet, or TreeSet. The Set interface extends the Collection interface.

-The HashSet class is a concrete class that implements Set. You can create an empty hash set using its no-arg constructor or create a hash set from an existing collection. A HashSet can be used to store duplicate-free elements. 

-LinkedHashSet extends HashSet with a linked-list implementation that supports an ordering of the elements in the set. The elements in a HashSet are not ordered, but the elements in a LinkedHashSet can be retrieved in the order in which they were inserted into the set.

-TreeSet implements the SortedSet interface. SortedSet is a subinterface of Set, which guarantees that the elements in the set are sorted. 
Additionally, it provides the methods first() and last() for returning the first and last elements in the set, and headSet(toElement) and tailSet(fromElement) for returning a portion of the set whose elements are less than toElement and greater than or equal to fromElement, respectively.
