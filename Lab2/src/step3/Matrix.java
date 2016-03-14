package step3;

public class Matrix {
	
	public static int[][] matrixTranspose(int[][] m) {
		int[][] transposedArray = new int[m[0].length][m.length];	
		
		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m.length; j++) {
				transposedArray[i][j] = m[j][i];
			}
		} // Transposing matrix m
		return transposedArray;
	} // matrixTranspose
} //Matrix class
