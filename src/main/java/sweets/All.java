package sweets;


public class All {
	public All(int sugarValue, int weight) {
		setSugarValue(sugarValue);
		setWeight(weight);
	}

private String name;
private int sugarValue;
private int weight;
private int count;

public int getCount() {
	return count;
}

public final void setCount(int count) {
	this.count = count;
}

public String getName() {
	return name;
}

public final void setName(String name) {
	this.name = name;
}

public int getSugarValue() {
	return sugarValue;
}

public final void setSugarValue(int sugarValue) {
	this.sugarValue = sugarValue;
}

public int getWeight() {
	return weight;
}

public final void setWeight(int weight) {
	this.weight = weight;
}

public String printName() {
	return "name: " + this.getName();
}

public String printSugarValue() {
	return "sugarValue: " + this.getSugarValue() + "%";
}

public String printWeight() {
	return "Weight: " + this.getWeight() + " gm";
}

public String printCount() {
	return "Count: " + this.getCount() + " pcs";
}

public String printAllValues() {
	return printName() + ", " + printSugarValue() + ", " + printWeight()
			+ ", " + printCount() + System.lineSeparator();
};
}

