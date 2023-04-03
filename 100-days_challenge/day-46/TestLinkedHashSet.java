import java.util.*;

class TestLinkedHashSet {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("Akure");
		set.add("Abeokuta");
		set.add("Ijebu");
		set.add("Ibadan");
		set.add("Oshogbo");
		set.add("Lagos");
		
		System.out.println(set);
		
		for (String e: set)
			System.out.print(e.toLowerCase() + " ");
	}
}
