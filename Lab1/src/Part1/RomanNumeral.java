package Part1;

public class RomanNumeral {
	
	public int integerValue;
	public String romanValue;
	public static int MAX_VALUE = 2500;
	public static int MIN_VALUE = 1;
	public static String UNDEFINED = "Error. Out of Range.";
	
	public RomanNumeral(int integerValue) {
		this.integerValue = integerValue;
		romanValue = toString();
	} // constructor
	
	public String toString() {
		String roman = "";
		int integer = integerValue;
		
		if (integer < MIN_VALUE || integer > MAX_VALUE) {
			roman = UNDEFINED;
		}
		else {
			if (integer == 1) {
				roman = "I";
			}
			else if (integer == 5) {
				roman = "V";
			}
			else if (integer == 10) {
				roman = "X";
			}
			else if (integer == 50) {
				roman = "L";
			}
			else if (integer == 100) {
				roman = "C";
			}
			else if (integer == 500) {
				roman = "D";
			}
			else if (integer == 1000) {
				roman = "M";
			}
			else {
				while (integer >= 1000) {
					roman += "M";
					integer -= 1000;
				}
				while (integer >= 900) {
					roman += "CM";
					integer -= 900;
				}
				while (integer >= 500) {
					roman += "D";
					integer -= 500;
				}
				while (integer >= 400) {
					roman += "CD";
					integer -= 400;
				}
				while (integer >= 100) {
					roman += "C";
					integer -= 100;
				}
				while (integer >= 90) {
					roman += "XC";
					integer -= 90;
				}
				while (integer >= 50) {
					roman += "L";
					integer -= 50;
				}
				while (integer >= 40) {
					roman += "XL";
					integer -= 40;
				}
				while (integer >= 10) {
					roman += "X";
					integer -= 10;
				}
				while (integer >= 9) {
					roman += "IX";
					integer -= 9;
				}
				while (integer >= 5) {
					roman += "V";
					integer -= 5;
				}
				while (integer >= 4) {
					roman += "IV";
					integer -= 4;
				}
				while (integer >= 1) {
					roman += "I";
					integer -= 1;
				}
			}
		}
		return roman;
	} // toString()
	
	public int toInt() {
		return integerValue;
	} // toInt()
	
	public int compareTo(RomanNumeral r) {
		int int_compare = 0;
		
		if (integerValue < r.integerValue) {
			int_compare = -1;
		}
		else if (integerValue == r.integerValue) {
			int_compare = 0;
		}
		else if (integerValue > r.integerValue) {
			int_compare = 1;
		}
		return int_compare;
	} // compareTo
} // class
