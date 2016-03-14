package Part2;

public class Prime {
	
	public static int check = 0;
	public static int temp = 0;
	
	public static boolean isPrime(int p) {
		
		boolean result = true;
		int i = 2;
		
		if (p == 0 || p < 0 || p == 1) {
			result = false;
		}
		else {
			while (i < p && result == true) {
				if (p % i != 0){
					i++;
				}
				else {
					result = false;
				}
			}
		}
		return result;
	} //isPrime()
	
	public static int getPrime() {
		if (check == 0) {
			temp = 2;
			check = 3;
		}
		else {
			while (isPrime(check) == false) {
				check++;
			}
			temp = check;
			check++;
		}
		return temp;
	} //getPrime()
	
	public static void reset() {
		temp = 0;
		check = 0;
	} // reset()
	
	public static void reset(int n) {
		check = n;
	} //reset(n)
	
	public static int sumPrimes(int n) {
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			answer += getPrime();
		}
		return answer;
	} //sumPrimes(n)
	
} // class
