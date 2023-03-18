#day30 of #100days

I learnt about Abstract classes and Interfaces today.

-An abstract class cannot be used to create objects. An abstract class can contain abstract methods that are implemented in concrete subclasses. Abstract classes are like regular classes, but you cannot create instances of abstract classes using the new operator. An abstract method is defined without implementation. Its implementation is provided by the subclasses. A class that contains abstract methods must be defined as abstract.

-The constructor in the abstract class is defined as protected because it is used only by subclasses. When you create an instance of a concrete subclass, its superclass’s constructor is invoked to initialize data fields defined in the superclass.

-An interface is a class-like construct for defining common operations for objects. In many ways an interface is similar to an abstract class, but its intent is to specify common behavior for objects of related classes or unrelated classes. For example, using appropriate interfaces, you can specify that the objects are comparable, edible, and/or cloneable. To distinguish an interface from a class, Java uses the following syntax to define an interface:
modifier interface InterfaceName {
	/** Constant declarations */
	/** Abstract method signatures */
}

An interface is treated like a special class in Java. Each interface is compiled into a separate bytecode file, just like a regular class. You can use an interface more or less the same way you use an abstract class. For example, you can use an interface as a data type for a reference variable, as the result of casting, and so on. As with an abstract class, you cannot create an instance from an interface using the new operator.
