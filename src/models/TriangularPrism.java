package models;

public class TriangularPrism extends Prism {
	private double base;
	private double heightOfTriangle;
	
	public TriangularPrism(double height, double base, double heightOfTriangle) {
		super(height);
		this.base = base;
		this.heightOfTriangle = heightOfTriangle;
	}
	
	@Override
	public double calculateBaseArea() {
		//Area of triangle is 0.5 * base * height
		return 0.5 * base * heightOfTriangle;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeightOfTriangle() {
		return heightOfTriangle;
	}

}
