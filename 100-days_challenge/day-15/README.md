#day15 of #100days

I learnt about passing objects to methods. Passing an object to a method is to pass the reference of the object. You can pass objects to methods. Like passing an array, passing an object is actually passing the reference of the object. Java uses exactly one mode of passing arguments: pass-by-value.

I also learnt about array of objects, an array can hold objects as well as primitive-type values. An array of objects is actually an array of reference variables. When an array of objects is created using the new operator, each element in the array is a reference variable with a default value of null.

-Immutable Objects and Classes: You can define immutable classes to create immutable objects. The contents of immutable objects cannot be changed. Normally, you create an object and allow its contents to be changed later. However, occasionally it is desirable to create an object whose contents cannot be changed once the object has been created. We call such an object as immutable object and its class as immutable class. The String class, for example, is immutable.

-The this reference: The keyword this refers to the object itself. It can also be used inside a constructor to invoke another constructor of the same class. You can use the this keyword to reference the object’s instance members. For example, the following code in (a) uses this to reference the object’s radius and invokes its getArea() method explicitly. The this reference is normally omitted for brevity as shown in (b). However, the this reference is needed to reference a data field hidden by a method or constructor parameter, or to invoke an overloaded constructor.

I finished yesterday's program(Circle with private fields and data encapsulation), and i wrote another Student class that has all data fields set as private and no setter methods.
