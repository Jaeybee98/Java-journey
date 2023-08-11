import java.util.ArrayList;

public class Suitcase {
	private ArrayList<Item> items;
	private int maxWeight;

	public Suitcase(int maxWeight) {
		this.items = new ArrayList<>();
		this.maxWeight = maxWeight;
	}

	public void addItem(Item item) {
		if (totalWeight() + item.getWeight() <= maxWeight) {
			items.add(item);
		}
	}

	public int totalWeight() {
		int totalWeight = 0;
		for (Item item : items) {
			totalWeight += item.getWeight();
		}
		return totalWeight;
	}

	public void printItems() {
		for (Item item : items) {
			System.out.println(item);
		}
	}

	public Item heaviestItem() {
		if (items.isEmpty()) {
			return null;
		}

		Item heaviest = items.get(0);
		for (Item item : items) {
			if (item.getWeight() > heaviest.getWeight()) {
				heaviest = item;
			}
		}
		return heaviest;
	}

	public String toString() {
		int itemCount = items.size();
		int totalWeight = totalWeight();

		if (itemCount == 0) {
			return "No items (" + totalWeight + " kg)";
		}
		else if (itemCount == 1) {
			return itemCount + " item (" + totalWeight + " kg)";
		}
		else {
			return itemCount + " items (" + totalWeight + " kg)";
		}
	}
}
