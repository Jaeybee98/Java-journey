//import arraylist
import java.util.ArrayList;

class TestArrayList {
	public static void main(String[] args) {
		//create a list to store cities
		ArrayList <String> cityList = new ArrayList<>();

		//add cities into the list
		cityList.add("Abuja");
		cityList.add("Kaduna");
		cityList.add("Port-harcourt");
		cityList.add("Lagos");
		cityList.add("Calabar");
		cityList.add("Abeokuta");

		System.out.println("List size? " + cityList.size());
		System.out.println("Is Lagos in the list? " + cityList.contains("Lagos"));
		System.out.println("The location of Kaduna in in the list? " + + cityList.indexOf("Kaduna"));
		System.out.println("Is the list empty? " + cityList.isEmpty());
		//inserts a new city at index 2
		cityList.add(2, "Onitsha");

		//remove a city from the list
		cityList.remove("Lagos");

		//remove the city at index 1
		cityList.remove(1);

		//display the list
		System.out.println(cityList.toString());

		//display the content of the list in reverse order
		for (int i = cityList.size() - 1; i >= 0; i--)
			System.out.print(cityList.get(i) + " ");
		System.out.println();
	}
}
