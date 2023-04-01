#day44 of #100days

I learnt about the Vector and Stack Classes today.

-Vector is a subclass of AbstractList, and Stack is a subclass of Vector in the Java API. Vector is the same as ArrayList, except that it contains synchronized methods for accessing and modifying the vector. Synchronized methods can prevent data corruption when a vector is accessed and modified by two or more threads concurrently.

-The Stack class was introduced prior to Java 2. The empty() method is the same as isEmpty(). The peek() method looks at the element at the top of the stack without removing it. The pop() method removes the top element from the stack and returns it. The push(Object element) method adds the specified element to the stack. The search(Object element) method checks whether the specified element is in the stack.
