package Part3;

public class MostDivisors {
	
	private int n;
	
	public MostDivisors(int n) {
		this.n = n;
	}
	
	public int getMost() {
		
		int count = 0;
		int temp = 0;
		int most = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++){
				if (i % j == 0) {
					count += 1;
				}
			}
			if (count >= temp) {
				temp = count;
				count = 0;
				most = i;
			}
			else {
				count = 0;
			}
		}
		return most;
	} // getMost()
	// if there are multiple possible answers, it returns the answer with the biggest number.  
	
	public String getDivisors() {
		int mostdivisors = getMost();
		String divisors = "";
		for (int i = 1; i <= mostdivisors; i++) {
			if (mostdivisors % i == 0) {
				divisors += (i+" ");
			}
		}
		divisors = divisors.trim();
		return divisors;
	} // getDivisors()
}
