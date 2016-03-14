
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		ListInterface<String> words = new ArrayList<>();
//		ListInterface<String> words2 = new LinkedList<>();
		words.add("Hi");
		words.add("What");
		words.add("Up");
		words.add("Down");
		words.add("Hi");
		words.add("What");
		words.add("Up");
		words.add("Down");
		
		System.out.println(Arrays.toString(words.toArray()));
		

		
//		System.out.println(words.get(1)); // What
//		System.out.println(words.indexOf("What")); // 1
//		System.out.println(words.contains("Up")); // True
//		System.out.println(words.isEmpty()); // False
//		System.out.println(words.size()); // 4
//		System.out.println(words.set(0, "Hello")); // Hi
//		System.out.println(words.get(0)); // Hello
//		System.out.println(Arrays.deepToString(words.toArray()));
//		
//		words2.add("Hi");
//		words2.add("What");
//		words2.add("Up");
//		words2.add("Down");
//		
//		System.out.println(Arrays.deepToString(words2.toArray()));
//		System.out.println(words.equals(words2)); // False
//		words.set(0, "Hi");
//		System.out.println(Arrays.deepToString(words2.toArray()));
//		System.out.println(words.equals(words2)); // True
//		
//		System.out.println(Arrays.deepToString(words.toArray()));
//		words.remove(0);
//		System.out.println(Arrays.deepToString(words.toArray()));
//		System.out.println(words.size());
//		System.out.println(words.add("again Hi", 0));
//		System.out.println(Arrays.deepToString(words.toArray()));
//		System.out.println(words.add(null));
//		System.out.println(Arrays.deepToString(words.toArray()));
//		System.out.println(words.size());
		
//		ListInterface<String> words;
//		words = new ArrayList<>();
//		ListInterface<String> words2 = new ArrayList<>();
//		
//		words.add("Hi");
//		words.add("What");
//		words.add("Up");
//		words.add("Down");
//		System.out.println(words.get(1)); // What
//		System.out.println(words.indexOf("What")); // 1
//		System.out.println(words.contains("Up")); // True
//		System.out.println(words.isEmpty()); // False
//		System.out.println(words.size()); // 4
//		System.out.println(words.set(0, "Hello")); // Hi
//		System.out.println(words.get(0)); // Hello
//		System.out.println(Arrays.deepToString(words.toArray()));
//		
//		words2.add("Hi");
//		words2.add("What");
//		words2.add("Up");
//		words2.add("Down");
//		
//		System.out.println(Arrays.deepToString(words2.toArray()));
//		System.out.println(words.equals(words2)); // False
//		words.set(0, "Hi");
//		System.out.println(Arrays.deepToString(words2.toArray()));
//		System.out.println(words.equals(words2)); // True
//		
//		System.out.println(Arrays.deepToString(words.toArray()));
//		System.out.println(words.remove(0));
//		System.out.println(Arrays.deepToString(words.toArray()));
	}

}
