
public class ArrayChange {
    public static void main(String[] args) {

    int a[] = {1, 2, 3, 4, 5};
    int n = 0;

    System.out.println();
    System.out.println("Value of n to start is: " + n);
    System.out.println("Array values to start...");
    
    for (int i = 0; i < a.length; i++)
        System.out.println("  index: " + i + "     value is: " + a[i]);

    increment(a, n);  // increment each value in the array

    System.out.println();
    System.out.println("Value of n after increment is: " + n);
    System.out.println("Array values after increment...");

    for (int i = 0; i < a.length; i++) 
        System.out.println("  index: " + i + "     value is: " + a[i]);

    }  // main method

    public static void increment(int[] x, int value) {

    value++;
    for (int i = 0; i < x.length; i++)
        x[i]++;

    }
}
