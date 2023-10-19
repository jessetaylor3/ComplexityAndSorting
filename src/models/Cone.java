package models;

//Representation of a three-dimensional Cone.
public class Cone extends Shape {
    private double radius;

    public Cone(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double calculateBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }

    public double getRadius() {
        return radius;
    }
}
