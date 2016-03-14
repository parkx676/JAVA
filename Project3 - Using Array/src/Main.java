import java.util.Arrays;



public class Main {

	public static void main(String[] args) {
		ListInterface<String> words;
		ListInterface<Double> grades;
		ListInterface<Double> duplicatedGrades;
		ListInterface<Puppy> basketOfPuppies;
		
		words = new TreeList<>();
		grades = new TreeList<>();
		duplicatedGrades = new TreeList<>();
		basketOfPuppies = new TreeList<>();
		
//		 
//		String[] wordsToBeAdded = {"Hello", "Goodbye", "Search", "Computer", "Technology"};
//		for (String word : wordsToBeAdded) {
//			words.add(word);
//		}
//		
//		// Adding to grades and duplicated grades
		double[] gradesToBeAdded = {100.0, 99.2, 34.4, 85.0, 74.4, 100.0};
		for (double grade : gradesToBeAdded) {
			grades.add(grade);
			duplicatedGrades.add(grade);
		}
		System.out.println(Arrays.toString(grades.toArray()));
//		
//		// Adding to the basket of puppies
//		Puppy[] puppiesToBeAdded = {new Puppy("Jasper", 100), new Puppy("Reo", 65), new Puppy("Dingo", 15), new Puppy("Byte", 30)};
//		for (Puppy puppy : puppiesToBeAdded) {
//			basketOfPuppies.add(puppy);
//		}
//		
//		System.out.println(basketOfPuppies.get(3).getName());
		
//		System.out.println(Arrays.toString(words.toArray()));
//		System.out.println(words.get(0));
		
//		
		
	}

}
