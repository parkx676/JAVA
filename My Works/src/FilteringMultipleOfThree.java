public class FilteringMultipleOfThree {
	public static void main(String[] args) {
		
		int low;
		int high;
		
		if (args.length != 2) {
			System.out.println("Wrong range. Please check the range again.");
		}  // if
		else {
			
			low = Integer.parseInt(args[0]);
			high = Integer.parseInt(args[1]);
			
			while (low <= high) {
				if (low % 3 == 0) {
					System.out.println(low);
					low++;
				}
				else {
					low++;
				}
			} // while
		} // else
	} // main
} //class
