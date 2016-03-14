package lab0.P2;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(this.radius, 2); 
	}
	
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	public double getRadius() {
		return this.radius;
	}

}
