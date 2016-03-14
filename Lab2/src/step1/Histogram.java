package step1;

public class Histogram {
	
	private int[] array;
	private int idx = 0;
	private int size;
	
	public Histogram (int n) {
		size = n;
		array = new int[size];
	} // Constructor
	
	public void add(int i) {
		if (i >= 0 && i <= 100 && array.length > idx) {
			array[idx] = i;
			idx++;
		}
	} // add method
	
	public String toString() {
		String ans = "{";
		for (int i = 0; i < array.length; i++) {
			ans += (array[i] + ", ");
		}
		ans = ans.substring(0, ans.length()-2);
		ans += "}";
		return ans;
	}
	
	public void addAuto(int i) {
		if (i >= 0 && i <= 100) {
			int[] array_temp = array; // copying old array
			size += 1; 
			array = new int[size]; // making new array
			int k = 0;
			while (k < array_temp.length) {
				for (int j = 0; j < array_temp.length; j++) {
					array[k] = array_temp[j];
					k++;
				}
			} //copying old array values into new array
			array[idx] = i; // adding new value
			idx++;
		}
	}
	
	public void display(String option) {
		int biggest = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > biggest) {
				biggest = array[i];
			}
		} // getting biggest number
		
		int[] array_sorted = new int[biggest+1];
		int[] array_count = new int[array_sorted.length];
		
		for (int i = 0; i < array_sorted.length; i++) {
			array_sorted[i] = i;
		} // makes new array with histogram values
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array_sorted.length; j++) {
				if (array[i] == array_sorted[j]) {
					array_count[j] += 1;
				}
			}
		} // add numbers of * to array_count
		
		if (option == "s") {
			for (int i = 0; i < array_sorted.length; i++) {
				if (array_count[i] != 0) {
					System.out.print(i+": ");
					for (int j = 0; j < array_count[i]; j++){
						System.out.print("*");
					}
					System.out.println("");
				}
			}
		}
		else if (option == "l") {
			for (int i = 0; i < array_sorted.length; i++) {
				if (array_count[i] != 0) {
					System.out.print(i+": ");
					for (int j = 0; j < array_count[i]; j++){
						System.out.print("*");
					}
					System.out.println("");
				}
				else {
					System.out.println(i+": ");
				}
			}
		}
	} // display method
	
} // Histogram class
