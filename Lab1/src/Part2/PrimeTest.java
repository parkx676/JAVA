package Part2;

public class PrimeTest {
	
	public static void main(String[] args) {
		PrimeInst p1 = new PrimeInst();
		PrimeInst p2 = new PrimeInst();
		System.out.println(p1.getPrime()); // Should print 2 for p1
		System.out.println(p2.getPrime()); // Should print 2 for p2
		System.out.println(p2.getPrime()); // should print 3 for p2
		System.out.println(p2.getPrime()); // should print 5 for p2
		System.out.println(p1.getPrime()); // should print 3 for p1
		// thus p1 and p2 are independent.
	} // main()
} // PrimeTest class
