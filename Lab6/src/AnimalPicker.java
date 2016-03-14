

public class AnimalPicker {
	private BTNode root = new BTNode("Is it a mammal?", 
			new BTNode("Does it have more than 2 legs?", 
					new BTNode("Is it a bird?", 
							new BTNode("Is it aquatic?", 
									new BTNode("Snake", 
											new BTNode("Warm", null, null), null), 
									new BTNode("Fish", 
											new BTNode("Shark", null, null), null)), 
							new BTNode("Is it aggressive?", 
									new BTNode("Chicken", 
											new BTNode("Penguine", null, null), null), 
									new BTNode("Goose", 
											new BTNode("Ostrich", null, null), null))), 
					new BTNode("Is it aquatic?", 
							new BTNode("Is it an insect?", 
									new BTNode("Scorpion", 
											new BTNode("Spider", null, null), null), 
									new BTNode("Ant", 
											new BTNode("Bee", null, null), null)), 
							new BTNode("Is it an arthropod?", 
									new BTNode("Alligator", 
											new BTNode("Frog", null, null), null), 
									new BTNode("Crab", 
											new BTNode("Lobster", null, null), null)))), 
											
			new BTNode("Does it live with humans?", 
					new BTNode("Is it intelligent?", 
							new BTNode("Is it a pack hunter?", 
									new BTNode("Bear", 
											new BTNode("Kangaroo", null, null), null), 
									new BTNode("Lion", 
											new BTNode("Wolf", null, null), null)), 
							new BTNode("Is it aquatic?", 
									new BTNode("Elephant", 
											new BTNode("Gorilla", null, null), null), 
									new BTNode("Dolphin", 
											new BTNode("Whale", null, null), null))), 
					new BTNode("Is it used for food?", 
							new BTNode("Is it a pet?", 
									new BTNode("Horse", 
											new BTNode("Human", null, null), null), 
									new BTNode("Cat", 
											new BTNode("Dog", null, null), null)), 
							new BTNode("Do we use it for clothes?", 
									new BTNode("Goat", 
											new BTNode("Pig", null, null), null), 
									new BTNode("Cow", 
											new BTNode("Sheep", null, null), null)))));
	private int depth = 0;
	private BTNode ptr;
	private boolean checker;
	
	public class BTNode {
		private String data;
		private BTNode left;
		private BTNode right;
		
		public BTNode(String data, BTNode left, BTNode right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		public String getData() {
			return data;
		}
		
		public BTNode getLeft() {
			return left;
		}
		
		public BTNode getRight() {
			return right;
		}
		
		public void setLeft(BTNode left) {
			this.left = left;
		}
		
		public void setRightt(BTNode right) {
			this.right = right;
		}
	}
	
	public String getString() {
		String data = null;
		if (depth == 0) {
			ptr = root;
			data = ptr.getData();
			depth++;
		}
		else if (depth < 4) {
			if (checker == false) {
				ptr = ptr.getLeft();
				data = ptr.getData();
				depth++;
			}
			else if (checker == true) {
				ptr = ptr.getRight();
				data = ptr.getData();
				depth++;
			}
		}
		else if (depth == 4) { // When depth = 4
			if (checker == false) {
				ptr = ptr.getLeft();
				data = "Is it a " + ptr.getData() +"?";
				depth++;
			}
			else if (checker == true) {
				ptr = ptr.getRight();
				data = "Is it a " + ptr.getData() +"?";
				depth++;
			}
		}
		else if (depth == 5) { // When depth = 5
			if (checker == false) {
				ptr = ptr.getLeft();
				data = "Your animal is " + ptr.getData();
			}
			else {
				data = "Your animal is " + ptr.getData();
			}
		}
		return data;
	}
	
	public void giveAnswer(boolean answer) {
		checker = answer;
	}
	
	public void reset() {
		depth = 0;
	}
}
