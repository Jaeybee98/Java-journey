#day23 of 100days

I learnt about Visibility Modifiers, The Protected Data and Methods, Preventing Extending and Overriding

-The modifiers private, protected, and public are known as visibility or accessibility modifiers because they specify how classes and class members are accessed. The visibility of these modifiers increases in this order: private, default (no modifier), protected, public.

-A protected member of a class can be accessed from a subclass.  Private members can be accessed only from inside of the class, and public members can be accessed from any other classes.

-Neither a final class nor a final method can be extended. A final data field is a constant. You may occasionally want to prevent classes from being extended. In such cases, use the final modifier to indicate a class is final and cannot be a parent class. The Math class is a final class. The String, StringBuilder, and StringBuffer classes, and all wrapper classes for primitive data types are also final classes.

The modifiers public, protected, private, static, abstract, and final are used on classes and class members (data and methods), except that the final modifier can also be used on local variables in a method. A final local variable is a constant inside a method.
