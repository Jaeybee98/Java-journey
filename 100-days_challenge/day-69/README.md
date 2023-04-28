#day69 of #100days

Today, I learnt about Thread Pools

-A thread pool can be used to execute tasks efficiently. Starting a new thread for each task could limit throughput and cause poor performance. Using a thread pool is an ideal way to manage the number of tasks executing concurrently. Java provides the Executor interface for executing tasks in a thread pool and the ExecutorService interface for managing and controlling tasks. ExecutorService is a subinterface of Executor.

-To create an Executor object, use the static methods in the Executors class. The newFixedThreadPool(int) method creates a fixed number of threads in a pool. If a thread completes executing a task, it can be reused to execute another task. If a thread terminates due to a failure prior to shutdown, a new thread will be created to replace it if all the threads in the pool are not idle and there are tasks waiting for execution. The newCachedThreadPool() method creates a new thread if all the threads in the pool are not idle and there are tasks waiting for execution. A thread in a cached pool will be terminated if it has not been used for 60 seconds. A cached pool is efficient for many short tasks.
