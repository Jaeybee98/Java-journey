#day39 of #100days

I continued Recursion today. I learnt about Recursive helper methods, Difference between Recursion and Iteration, Tail Recursion.

-Sometimes you can find a solution to the original problem by defining a recursive function to a problem similar to the original problem. This new method is called a recursive helper method. The original problem can be solved by invoking the recursive helper method.

-Recursion is an alternative form of program control. It is essentially repetition without a loop. When you use loops, you specify a loop body. The repetition of the loop body is controlled by the loop control structure. In recursion, the method itself is called repeatedly. A selection statement must be used to control whether to call the method recursively or not.

-Recursion bears substantial overhead. Each time the program calls a method, the system must allocate memory for all of the method’s local variables and parameters. This can consume considerable memory and requires extra time to manage the memory. Any problem that can be solved recursively can be solved nonrecursively with iterations.

-A tail recursive method is efficient for reducing stack size. A recursive method is said to be tail recursive if there are no pending operations to be performed on return from a recursive call. Tail recursion is desirable: because the method ends when the last recursive call ends, there is no need to store the intermediate calls in the stack. Compilers can optimize tail recursion to reduce stack size.
