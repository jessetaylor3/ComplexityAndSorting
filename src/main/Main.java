package main;
import models.Cone;
import models.Cylinder;

//Main method to test functionality
public class Main {
	public static void main(String[] args) {
		//Create Cylinder object
		Cylinder cylinder = new Cylinder(5.0, 2.0);
		
		//Create Cone
		Cone cone = new Cone(5.0, 2);
		
		//Calculate and print base area and volume of the cylinder
		System.out.println("Cylinder base area: " + cylinder.calculateBaseArea());
		System.out.println("Cylinder volume: " + cylinder.calculateVolume());
		System.out.println("Cone base area: " + cone.calculateBaseArea());
		System.out.println("Cone volume: " + cone.calculateVolume());
	}
}
