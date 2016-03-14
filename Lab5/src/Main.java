import java.util.Arrays;




public class Main {

	public static void main(String[] args) {
		ListInterface<Puppy> basketOfPuppies = new ExtendedList<>(0, false);
		
		Puppy[] puppiesToBeAdded = {new Puppy("Jasper", 100), new Puppy("Jasper", 100), new Puppy("Reo", 65), new Puppy("Dingo", 15), new Puppy("Byte", 30)};
		for (Puppy puppy : puppiesToBeAdded) {
			basketOfPuppies.add(puppy);
		}
		System.out.println(basketOfPuppies.size());
		System.out.println(basketOfPuppies.get(2).getName());


		
//		ListInterface<Double> grades = new ExtendedList<>(1 , false);
//		double[] gradesToBeAdded = {100.0, 99.2, 34.4, 85.0, 74.4, 100.0, 69.5};
//		for (double grade : gradesToBeAdded) {
//			grades.add(grade);
//		}
//		
//		System.out.println(Arrays.toString(grades.toArray()));
		
		
		//		ListInterface<String> words= new ExtendedList<>(0, true);
//		
//		String[] wordsToBeAdded = {"Hello", "Goodbye", "Search", "Computer", "Technology"};
//		for (String word : wordsToBeAdded) {
//			words.add(word);
//		}
//		System.out.println(words.size());
//		System.out.println(Arrays.toString(words.toArray()));
//		System.out.println(words.add("Hello"));
//		System.out.println(words.size());
//		System.out.println(Arrays.toString(words.toArray()));
		
	}

}
