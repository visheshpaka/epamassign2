package tasks;
import sweets.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class tasks {
	private List<All> list = new ArrayList<All>();

	public List<All> getList() {
		return list;
	}

	

	public void add(All absCandy, int count) {
		for (All candy : getList()) {
			if (candy.getName().equals(absCandy.getName())) {
				candy.setCount(candy.getCount() + count);
				return;
			}
		}
		getList().add(absCandy);
		absCandy.setCount(count);
	}

	
	public int calculateTotalWeight() {
		int value = 0;
		for (All candy : getList()) {
			value += candy.getCount() * candy.getWeight();
		}
		return value;
	}

	public void getAllCandy() {
		for (All candy : getList()) {
			System.out.print(candy.printAllValues());
		}
	}

	     
	

	public List<All> receiveBySugarValue(int start, int end) {
		ArrayList<All> list2 = new ArrayList<All>();
		sortBySugarValue(list2);
		for (All candy : getList()) {
			if (start <= candy.getSugarValue() && candy.getSugarValue() < end) {
				list2.add(candy);
			}
		}
		return list2;
	}

	
	public void sortBySugarValue(List<All> list) {
		Collections.sort(list, new CompareBySugarValue());
	}

	static class CompareBySugarValue implements Comparator<All>,
			Serializable {

		private static final long serialVersionUID = -6923839843945617223L;

		public int compare(All o1, All o2) {
			return o1.getSugarValue() - o2.getSugarValue();
		}

	}
}