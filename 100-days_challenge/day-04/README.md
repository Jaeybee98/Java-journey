#Day4 of #100Days

Today is the fourth day of my 100 days journey and i learnt about loops. 
A loop can be used to tell a program how to behave/ how to execute statements repeatedly. Java provides a very powerful construct called a "LOOP" that controls how many times an operation or a sequence of operations is performed in succession. Using a loop statement, you simply tells the computer to display/execute a statement (can be a string or any other data type) a number of times without having to code the print statement the number of times.

The part of the loop that contains the statements to be repeated is called the loop body. Java provides 3 types of loop statements: 1- The while loop, 2- The do-while loop, and 3- The for loop.

1- The while loop: A while loop executes statements repeatedly while the condition is true. It chcks the loop-continuation-continuation condition first and if it's false, the loop terminates. Syntax is: while (loop-continuation-condition) {
					statements(s);
				}

2- The do-while loop: It's the same as the while loop except that it executes the loop body first and then checks the loop continuation condition. It's a variation of the while loop. Syntax is: do {
				statement(s);
		       } while (loop-continuation-condition);

3- The for loop: A for loop has a concise syntax for writing loops. The for loop contorl has 3 parts. The first part is an initial action that often initializes a control variable. The second part, the loop-continuation-condition, determines whether the loop body is to be executed. The third part is executed after each iteration and is often used to adjust the control variable. Syntax is: for (initial-action; loop-continuation-condition; action-after-each-iteration) {
							statement(s);
						}

Things to note about loops:
- A one-time execution of a loop body is referred to as an iteration of the loop.

- An infinite loop is a loop statement that executes infinitely.

-In designing loops, you need to consider both the loop control structure and the loop body.

- The while loop and the do-while loop often are used when the number of repetitions is not predetermined.

- The for loop generally is used to execute a loop body a fixed number of times.

- Two keywords break and continue can be used in a loop. The break keyword immediately ends the innermost loop, which contains the break. The continue keyword only ends the current iteration.

So, to practise all what i've learnt, i rewrote the subtraction quiz i wrote on #day2 of this journey to include loops and execute the program five times, a number guessing program and a program that displays the first 50 prime numbers in five lines.
