package models;

public abstract class Shape {
	protected double height;
	
	public Shape(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	//Abstract method to calculate the base area of the shape
	public abstract double calculateBaseArea();
	
	//Abstract method to calculate the volume of the shape
	public abstract double calculateVolume();

}
