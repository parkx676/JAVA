
public class Swapper {

	public static void main(String[] args) {
		
		int a[] = {0,1,2,3,4};
		int i = 8;
		int j = 9;
	
		System.out.println("Start: i is: " + i + "  j is: " + j);
		System.out.println("Start: a[0] is: " + a[0] + "  a[1] is: " + a[1]);
		
		changer(i,j,a);
		
		System.out.println("End: i is: " + i + "  j is: " + j);
		System.out.println("End: a[0] is: " + a[0] + "  a[1] is: " + a[1]);
	}
	
	public static void changer(int val1, int val2, int[] x) {
		System.out.println("Changer start: val1 is: " + val1 + "  val2 is: " + val2);
		System.out.println("Changer start: x[0] is: " + x[0] + "  x[1] is: " + x[1]);
		
		x[0] = val1;
		val1 = val2;
		val2 = x[0];
		
		System.out.println("Changer end: val1 is: " + val1 + "  val2 is: " + val2);
		System.out.println("Changer end: x[0] is: " + x[0] + "  x[1] is: " + x[1]);
	}
	

}
