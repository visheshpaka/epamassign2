package epam.training1;
import sweets.*;
import tasks.*;
public class App
{
	private static final int START = 25;
	private static final int END = 40;

	// Creating objects
	private static final Jalebi Jalebi1 = new Jalebi("Jalebi1", 10, 10);
	private static final Jalebi Jalebi2 = new Jalebi("Jalebi2", 15, 15);
	private static final Jalebi Jalebi3 = new Jalebi("Jalebi3", 25, 20);
	private static final mysorepak mysorepak1 = new mysorepak("mysorepak1", 10, 50);
	private static final mysorepak mysorepak2 = new mysorepak("mysorepak2", 20, 50);
	private static final Laddo Laddo1 = new Laddo("Laddo1", 20, 15);
	private static final Laddo Laddo2 = new Laddo("Laddo2", 30, 20);

	// Creating container
	private static final  tasks GIFT = new tasks();

	public static tasks getGift() {
		return GIFT;
	}



	public static void createGift() {
		getGift().add(Jalebi1, 6);
		getGift().add(Jalebi2, 8);
		getGift().add(Jalebi3, 7);
		getGift().add(mysorepak1, 1);
		getGift().add(mysorepak2, 1);
		getGift().add(Laddo1, 3);
		getGift().add(Laddo2, 4);
		getGift().add(Laddo2, 5);
		getGift().add(Jalebi1, 12);
		getGift().add(Jalebi2, 17);
		getGift().add(Jalebi3, 14);
		getGift().add(mysorepak1, 1);
		getGift().add(mysorepak2, 1);
		getGift().add(Laddo1, 3);
		getGift().add(Laddo2, 1);
	}
    public static void main( String[] args )
    {
    	createGift();
		System.out.println("Getting all objects from the gift:");
		getGift().getAllCandy();
		System.out.println();
		System.out.println("Sorting objects by sugarValue:");
		getGift().sortBySugarValue(getGift().getList());
		getGift().getAllCandy();
		System.out.println();
		System.out.println("Calculating total weight of the gift: ");
		System.out.println(getGift().calculateTotalWeight() + " gm");
		System.out.println();
		System.out
				.println("Getting all objects with selected range of sugar value(from "
						+ START + "% to " + END + "%) :");
		for (All sweets : getGift().receiveBySugarValue(START, END)) {
			System.out.print(sweets.printAllValues());
		}
	}

}