package lab0.P1;

/**
 * Lab 0 Part 1
 */
public class ABunchOfStringMethods {
	public boolean isAPicture(String fileName) {
		return fileName.contains(".png");
	}
	
	/*
	 * Write this one yourself, use name.equalsIgnoreCase() case so bob is valid as well as BoB
	 */
	public boolean isBob(String name) {
		return name.equalsIgnoreCase("BoB");
	}

	public String sayHelloTo(String name) {
		return "Hello, " + name;
	}

	public boolean shouldSkipLine(String string) {
		String trimmed = string.trim();
		return trimmed.charAt(0) == '#';
	}
}
