import java.util.ArrayList;

public class Hold {
	private ArrayList<Suitcase> suitcases;
	private int maxWeight;

	public Hold(int maxWeight) {
		this.suitcases = new ArrayList<>();
	       this.maxWeight = maxWeight;
	}

	public void addSuitcase (Suitcase suitcase) {
		if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
			suitcases.add(suitcase);
		}
	}

	public int totalWeight() {
		int totalWeight = 0;
		for (Suitcase suitcase : suitcases) {
			totalWeight += suitcase.totalWeight();
		}
		return totalWeight;
	}

	public void printItems() {
		for (Suitcase suitcase : suitcases) {
			suitcase.printItems();
		}
	}

	public String toString() {
		int suitcasesCount = suitcases.size();
		int totalWeight = totalWeight();
		return suitcasesCount + " suitcases (" + totalWeight + " kg)";
	}
}
