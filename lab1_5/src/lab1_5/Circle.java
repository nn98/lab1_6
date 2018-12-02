package lab1_5;

public class Circle {
	int radius;
	public Circle() {
		radius=1;
	}
	public Circle(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double value() {
		return (double)radius*radius*3.14;
	}
	@Override
	public String toString() {
		return "Circle [radius="+radius+"]";
	}
}
