#day72 of #100days

I decided to rest and prevent burnout yesterdy which was supposed to be day 72. So, today, i learnt about Thread Cooperation.

-Conditions on locks can be used to coordinate thread interactions. Thread synchronization suffices to avoid race conditions by ensuring the mutual exclusion of multiple threads in the critical region, but sometimes you also need a way for threads to cooperate. Conditions can be used to facilitate communications among threads. A thread can specify what to do under a certain condition. Conditions are objects created by invoking the newCondition() method on a Lock object. Once a condition is created, you can use its await(), signal(), and signalAll() methods for thread communications. The await() method causes the current thread to wait until the condition is signaled. The signal() method wakes up one waiting thread, and the signalAll() method wakes all waiting threads.

I'll try to write a program tomorrow, practising what i've learnt.
