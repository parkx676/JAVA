package lab0.P2;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return (this.length * this.width)/2; 
	}
	
	public double perimeter() {
		return (this.length * 2) + (this.width * 2);
	}
	
	public void setLength(double newLength) {
		this.length = newLength;
	}
	
	public void setWidth(double newWidth) {
		this.width = newWidth;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
}

