package models;

public class SquarePrism extends Prism {
	private double baseLength;
	
	public SquarePrism(double height, double baseLength) {
		super(height);
		this.baseLength = baseLength;
	}
	
	@Override
	public double calculateBaseArea() {
		return baseLength * baseLength; //SideLength^
	}
	
	public double getBaseLength() {
		return baseLength;
	}

}
