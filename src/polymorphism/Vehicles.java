package polymorphism;

//Vehicle.java
public class Vehicles {
	
	String brand;
	int year;

	// Constructor of the superclass Vehicle
	public Vehicles(String brand, int year) {
		this.brand = brand;
		this.year = year;
		
		System.out.println("Vehicle constructor called.");
	}

	// Method of the superclass Vehicle
	public void start() {
		System.out.println(brand + " vehicle is starting.");
	}
}
