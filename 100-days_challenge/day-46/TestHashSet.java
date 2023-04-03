import java.util.*;

class TestHashSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Abeokuta");
		set.add("Akure");
		set.add("Ibadan");
		set.add("Lagos");
		set.add("Oshogbo");
		set.add("Ijebu");
		
		System.out.println(set);
		
		for (String s: set) {
			System.out.print(s.toUpperCase() + " ");
		}
	}
}
