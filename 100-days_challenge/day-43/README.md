#day43 of #100days

So, i learnt about Iterators and Lists today.

-Each collection is Iterable. You can obtain its Iterator object to traverse all the elements in the collection. Iterator is a classic design pattern for walking through a data structure without having to expose the details of how data is stored in the data structure. The Collection interface extends the Iterable interface. The Iterable interface defines the iterator method, which returns an iterator. 

-The List interface extends the Collection interface and defines a collection for storing elements in a sequential order. To create a list, use one of its two concrete classes: ArrayList or LinkedList.

-The ArrayList class and the LinkedList class are two concrete implementations of the List interface. ArrayList stores elements in an array. The array is dynamically created. If the capacity of the array is exceeded, a larger new array is created and all the elements from the current array are copied to the new array. LinkedList stores elements in a linked list. Which of the two classes you use depends on your specific needs. If you need to support random access through an index without inserting or removing elements at the beginning of the list, ArrayList offers the most efficient collection. If, however, your application requires the insertion or deletion of elements at the beginning of the list, you should choose LinkedList. A list can grow or shrink dynamically. Once it is created, an array is fixed. If your application does not require the insertion or deletion of elements, an array is the most efficient data structure.


