

public class RowSum {
	
	public static int tally(int[][] a) {
		int temp=0, sum=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			if (temp < sum) {
				temp = sum;
			}
			sum = 0;
		}
		return temp;
	}

	public static void main(String[] args) {
		int[][] a = {{1,1,1,1,0},{1,20,1,10,1},{4,4,0,2,0}};
	
		
		System.out.println(tally(a));
	}

}
