#day22 of #100days

I continued from where i stopped yesterday. I learnt about Casting Objects and the instanceof Operator, The Object's equals method, The ArrayList Class

-One object reference can be typecast into another object reference. This is called casting object. The statement Object o = new Student(), known as implicit casting, is legal because an instance of Student is an instance of Object. Explicit casting  is similar to the one used for casting among primitive data types. Enclose the target object type in parentheses and place it before the object to be cast, as follows: Student b = (Student)o;

-Like the toString() method, the equals(Object) method is another useful method defined in the Object class. This method tests whether two objects are equal. The syntax for invoking it is: object1.equals(object2);. This implementation checks whether two reference variables point to the same object using the == operator. You should override this method in your custom class to test whether two distinct objects have the same content.

-An ArrayList object can be used to store a list of objects. Java provides the ArrayList class, which can be used to store an unlimited number of objects. This ArrayList object can be used to store strings. ArrayList<String> cities = new ArrayList<String>();

I wrote some programs putting into practise all i learnt today. I wrote a program that prompts the user to enter a sequence of numbers and displays the distinct numbers in the sequence. Assume the input ends with 0, and 0 is not counted as a number in the sequence.
