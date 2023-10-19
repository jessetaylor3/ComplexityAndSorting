package models;

public class Cylinder extends Shape{
	private double radius;
	
	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	@Override
	public double calculateBaseArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double calculateVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	public double getRadius() {
		return radius;
	}
}