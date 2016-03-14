
public class main {

	public static void main(String[] args) {
		Player p = new BaseballPlayer("Joe", "Smith", 35, 1);
//		BaseballPlayer bb = p;
		System.out.println(p.toString());
		BaseballPlayer bb2 = new BaseballPlayer("Joe", "Smith", 25, 1);
		System.out.println(bb2.toString());
		System.out.println(p.equals(bb2));
		System.out.println("Hi" == "Hi");
	}

}
