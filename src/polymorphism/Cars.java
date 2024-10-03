package polymorphism;

//Car.java
public class Cars extends Vehicles {
	
	String model;

	// Constructor of the subclass Car
	public Cars(String brand, int year, String model) {
		
		// Calls the constructor of the superclass (Vehicle)
		super(brand, year);
		this.model = model;
		
		System.out.println("Car constructor called.");
	}

	// Overriding the start method from Vehicle
	@Override
	public void start() {
		
		super.start(); // Calls the Vehicle's start method
		System.out.println("Car " + model + " is starting with extra features.");
	}
}
