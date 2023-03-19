#day31 of #100days

I learnt about the comparable Interface.

-The Comparable interface defines the compareTo method for comparing objects. Suppose you want to design a generic method to find the larger of two objects of the same type, such as two students, two dates, two circles, two rectangles, or two squares. In order to accomplish this, the two objects must be comparable, so the common behavior for the objects must be comparable. Java provides the Comparable interface for this purpose. The interface is defined as follows: 
java.lang.
package java.lang;
public interfaceComparable<E> {
	public int compareTo(E o);
}

-Since all Comparable objects have the compareTo method, the java.util.Arrays.sort(Object[]) method in the Java API uses the compareTo method to compare and sorts the objects in an array, provided the objects are instances of the Comparable interface.

