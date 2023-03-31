import java.util.*;

class TestIterator {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("Abeokuta");
		collection.add("Akure");
		collection.add("Ibadan");
		collection.add("Oshogbo");

		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase() + " ");
		}
		System.out.println();
	}
}
