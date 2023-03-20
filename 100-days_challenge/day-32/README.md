#day32 of #100days

I learnt about the Cloneable Interface today.

-The Cloneable interface specifies that an object can be cloned. Often, it is desirable to create a copy of an object. An interface contains constants and abstract methods, but the Cloneable interface is a special case. The Cloneable interface in the java.lang package is defined as follows:
java.lang.Cloneable
package java.lang;
public interface Cloneable {
}

This interface is empty. An interface with an empty body is referred to as a marker interface. A marker interface is used to denote that a class possesses certain desirable properties. A class that implements the Cloneable interface is marked cloneable, and its objects can be cloned using the clone() method defined in the Object class.
