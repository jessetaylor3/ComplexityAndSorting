package models;

public abstract class Prism extends Shape{
	public Prism(double height) {
		super(height);
	}
	
	//Force it to be declared by subclass
	@Override
	public abstract double calculateBaseArea();
	
	//The volume is *usually* the baseArea * height so we can implement and do changes in subclass
	@Override
	public double calculateVolume() {
		return calculateBaseArea() * height;
	}
}