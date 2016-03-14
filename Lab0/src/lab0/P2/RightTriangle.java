package lab0.P2;

public class RightTriangle {
	private double base;
	private double height;
	
	public RightTriangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double area() {
		return (this.base * this.height)/2; 
	}
	
	public double perimeter() {
		return this.base + this.height + Math.sqrt((Math.pow(this.base, 2)) + (Math.pow(this.height, 2)));
	}
	
	public void setBase(double newBase) {
		this.base = newBase;
	}
	
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
}
