#day45 of #100days

I learnt about Queues and Priority Queues today.

-A queue is a first-in, first-out data structure. Elements are appended to the end of the queue and are removed from the beginning of the queue. In a priority queue, elements are assigned priorities. When accessing elements, the element with the highest priority is removed first.

-The Queue interface extends java.util.Collection with additional insertion, extraction, and inspection operations.

-The offer method is used to add an element to the queue. This method is similar to the add method in the Collection interface, but the offer method is preferred for queues. The poll and remove methods are similar, except that poll() returns null if the queue is empty, whereas remove() throws an exception. The peek and element methods are similar, except that peek() returns null if the queue is empty, whereas element() throws an exception.


