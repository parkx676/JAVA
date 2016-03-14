package step0;

import java.util.Arrays;
import java.util.Scanner;

public class Warmup {

	private static Scanner inputs;
	
	public static void main(String[] args) {
		inputs = new Scanner(System.in);
		int count = 0;
    	int sum = 0;
		int[] array = new int[count];

        System.out.print("Please enter an integer: ");
        while (inputs.hasNextInt()) { 
        	int[] array_temp = array;
        	count++;
        	array = new int[count];
        	int k = 0;
			while (k < array_temp.length) {
				for (int j = 0; j < array_temp.length; j++) {
					array[k] = array_temp[j];
					k++;
				}
			}
			k = 0;
        	array[count-1] = inputs.nextInt();
        	for (int i = 0; i < array.length; i++) {
        		sum += array[i];
        	}
            System.out.println(Arrays.toString(array));
            System.out.println("Sum of Integers in the Array: " + sum);
            sum = 0;
            System.out.print("Please enter an integer: ");
        } // while loop
	} // main
} // class
