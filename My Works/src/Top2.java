
public class Top2 {

	public static int top2(int[] a) {
		int answer = 0;
		int temp;
		
		for (int i=0; i < a.length-1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = a.length - 2; i < a.length; i++) {
			answer += a[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] a = {300, 750, 100, 420, 50, 20};
		
		System.out.println(top2(a));
	}
}
