#day68 of #100days

I learnt about the Thread Class today.

The Thread class contains the constructors for creating threads for tasks and the methods for controlling threads. Since the Thread class implements Runnable, you could define a class that extends Thread and implements the run method.

-The Thread class contains the start(), isAlive(), join(), sleep() methods. The sleep method may throw an InterruptedException, which is a checked exception. Such an exception may occur when a sleeping thread’s interrupt() method is called. You can use the join() method to force one thread to wait for another thread to finish. 

-Java assigns every thread a priority. By default, a thread inherits the priority of the thread that spawned it. You can increase or decrease the priority of any thread by using the setPriority method, and you can get the thread’s priority by using the getPriority method. Priorities are numbers ranging from 1 to 10. The Thread class has the int constants MIN_PRIORITY, NORM_PRIORITY, and MAX_PRIORITY, representing 1, 5, and 10, respectively. The priority of the main thread is Thread.NORM_PRIORITY. The JVM always picks the currently runnable thread with the highest priority. A lower priority thread can run only when no higher-priority threads are running. If all runnable threads have equal priorities, each is assigned an equal portion of the CPU time in a circular queue. This is called round-robin scheduling. 
