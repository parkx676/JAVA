
class BaseballPlayer extends Player {
	protected int position;
	
	public BaseballPlayer (String f, String l, int n, int p) {
		first = f; last = l; number = n; position = p;}
	
	public String toString() {
		return first + " " + last + " " + number + " " + position;
	}
	
	public int getPosition() {
		return position;
	}
}
