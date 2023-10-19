package models;

public class Pyramid extends Shape {
	private double baseLength;
	private double baseWidth;
	
	public Pyramid(double height, double baseLength, double baseWidth) {
		super(height);
		this.baseLength = baseLength;
		this.baseWidth = baseWidth;
	}
	
	@Override
	public double calculateBaseArea() {
		return baseLength * baseWidth;
	}
	
	@Override
	public double calculateVolume() {
		return (baseLength * baseWidth * height) / 3;
	}
	
	public double getBaseLength() {
		return baseLength;
	}
	
	public double getBaseWidth() {
		return baseWidth;
	}

}
