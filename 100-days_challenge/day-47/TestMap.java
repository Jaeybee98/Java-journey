import java.util.*;

class TestMap {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Junaid", 30);
		hashMap.put("Ajibola", 31);
		hashMap.put("Quayum", 29);
		hashMap.put("Bobo", 29);
		
		System.out.println("Display entries in HashMap");
		System.out.println(hashMap + "\n");
		
		// Create a TreeMap from the preceding HashMap
		Map<String, Integer> treeMap = new TreeMap<>(hashMap);
		System.out.println("Display entries in ascending order of key");
		System.out.println(treeMap);
		
		// Create a LinkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
		linkedHashMap.put("Junaid", 30);
		linkedHashMap.put("Ajibola", 31);
		linkedHashMap.put("Quayum", 29);
		linkedHashMap.put("Bobo", 29);
		
		// Display the age for Lewis
		System.out.println("\nThe age for " + "Quayum is " + linkedHashMap.get("Quayum"));
		
		System.out.println("Display entries in LinkedHashMap");
		System.out.println(linkedHashMap);
	}
}
