package models;

public class OctagonalPrism extends Prism {
	private double sideLength;
	
	public OctagonalPrism(double height, double sideLength) {
		super(height);
		this.sideLength = sideLength;
	}
	
	@Override
	public double calculateBaseArea() {
		return 2 * (1 + Math.sqrt(2) * Math.pow(sideLength, 2));
	}
	
	public double getSideLength() {
		return sideLength;
	}

}
