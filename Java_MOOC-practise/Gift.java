public class Gift {
	private String name;
	private int weightOfItem;

	public Gift(String name, int weightOfItem) {
		this.name = name;
		this.weightOfItem = weightOfItem;
	}

	public String getName() {
		return this.name;
	}

	public int getWeight() {
		return this.weightOfItem;
	}

	public String toString() {
		return name + "(" + getWeight() + " kg)";
	}
}

