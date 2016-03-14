
class Player extends Person {
	protected int number;
	
	public Player() {}
	
	public Player(String f, String l, int n) {
		first = f; last = l; number =n;}
	
	public int getNumber() {return number;}
	
	public String toString() {
		return "Player" + first + " " + last;}
}
