package question3;

public class Fibonacci {
	
	public static int fibRec(int n) {
		int answer = 0;
		if (n < 2) {
			answer = n;
		}
		else {
			answer = fibRec(n-1) + fibRec(n-2);
		}
		return answer;
	}
	
	public static int fibLoop(int n) {
		int count = 0;
		int temp = 1;
		int answer = 0;
		
		while (count < n) {
			count++;
			answer += temp;
			temp = answer - temp;
		}
		return answer;
	}
}
