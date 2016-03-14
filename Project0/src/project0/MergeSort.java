package project0;

import java.util.Arrays;

public class MergeSort {
	
	private int[] merge(int[] array1, int[] array2) {
		int[] finalArray = new int[array1.length+array2.length];
		int idx = 0;
		int i = 0;
		int j = 0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] <= array2[j]) {
				finalArray[idx] = array1[i];
				idx++;
				i++;
			}
			else {
				finalArray[idx] = array2[j];
				idx++;
				j++;
			}
		}
		if (i == array1.length) {
			while (j != array2.length) {
				finalArray[idx] = array2[j];
				idx++;
				j++;
			}
		}
		else if (j == array2.length) {
			while (i != array1.length) {
				finalArray[idx] = array1[i];
				idx++;
				i++;
			}
		}
		return finalArray;
	} // merge
	
	public int[] mergeSort(int[] toSort) {
		int[] sortedArray = new int[toSort.length];
		
		if (toSort.length < 2) {
			sortedArray[0] = toSort[0];
		}
		else {
			int size1 = 0;
			int size2 = 0;
			
			if (toSort.length % 2 == 0) {
				size1 = toSort.length / 2;
				size2 = toSort.length / 2;
			}
			else {
				size1 = toSort.length / 2;
				size2 = (toSort.length / 2) + 1;
			}
			
			int[] array1 = new int[size1];
			int[] array2 = new int[size2];
			
			array1 = Arrays.copyOfRange(toSort, 0, size1);
			array2 = Arrays.copyOfRange(toSort, size1, size1 + size2);
			
			array1 = mergeSort(array1);
			array2 = mergeSort(array2);
			
			sortedArray = merge(array1, array2);
		}
		return sortedArray;
	} //mergeSort()
}
