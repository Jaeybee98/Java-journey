#day71 of #100days

-I continued the Thread Synchronization i was trying to learn yesterday. So, after watching series of videos on Youtube, i was able to atleast grasp it. I saw a sample program online and i tried to replicate it to further understand what it's about.

-I also learnt about the Synchronized Keywords and Synchronization Using Keywords. To avoid race conditions, it is necessary to prevent more than one thread from simultaneously entering a certain part of the program, known as the critical region. You can use the keyword synchronized to synchronize the method so that only one thread can access the method at a time. 

-A synchronized method acquires a lock before it executes. A lock is a mechanism for exclusive use of a resource. In the case of an instance method, the lock is on the object for which the method was invoked. In the case of a static method, the lock is on the class. If one thread invokes a synchronized instance method (respectively, static method) on an object, the lock of that object (respectively, class) is acquired first, then the method is executed, and finally the lock is released. Another thread invoking the same method of that object (respectively, class) is blocked until the lock is released.
