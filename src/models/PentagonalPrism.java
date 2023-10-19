package models;

public class PentagonalPrism extends Prism {
	private double sideLength;
	
	public PentagonalPrism(double height, double sideLength) {
		super(height);
		this.sideLength = sideLength;
	}
	
	@Override
	public double calculateBaseArea() {
		return (5.0 / 4.0) * Math.pow(sideLength, 2) * (1.0 / Math.tan(Math.PI / 5.0));
	}
	
	public double getSideLength() {
		return sideLength;
	}

}
