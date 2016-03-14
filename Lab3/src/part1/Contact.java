package part1;

public class Contact {
	
	private String name;
	private String number;
	
	public Contact(String name, String number) {
		this.name = name;
		this.number = number;
	} // Constructor
	
	public Contact() {
	} // Default Constructor
	
	@Override
	public String toString() {
		return name + ": " + number;
	}
	
	// setter
	public void setName(String newname) {
		name = newname;
	}
	
	public void setNumber(String newnumber) {
		number = newnumber;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
	
} // Contact class
