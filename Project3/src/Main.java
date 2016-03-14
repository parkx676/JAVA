import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		TreeList<Double> grades;
		grades = new TreeList<>();
		double[] gradesToBeAdded = {100.0, 99.2, 34.4, 85.0, 74.4, 100.0, 69.5};
		for (double grade : gradesToBeAdded) {
			System.out.println(grades.add(grade));
		}


		System.out.println(Arrays.toString(grades.toArray()));
		System.out.println(grades.size());
		System.out.println(grades.get(0));
		System.out.println(grades.isEmpty());
		System.out.println(grades.contains(100.0));
		grades.set(6, 50.0);
		System.out.println(Arrays.toString(grades.toArray()));
		System.out.println(grades.countLeaves(grades.root));
		
		double v = 5.0/2.0;
		System.out.println(v);
		String a = "A";
		String b = new String("A");
		String c = new String("A");
		String d = "A";
		
		System.out.println(a == d);
	}

}
