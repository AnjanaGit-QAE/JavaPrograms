package polymorphism;

//Vehicle.java (Superclass)
class Vehicle {
	
	String brand;
	int year;

	// Superclass constructor
	Vehicle(String Brand, int Year) {
		
		this.brand = Brand;
		this.year = Year;
		
		System.out.println("Vehicle constructor called :" + Brand +" " + Year );
	}

	// Superclass method
	void start() {
		System.out.println(brand +" " + year + " vehicle is starting.");
	}
}

//Car.java (Subclass)
class Car extends Vehicle {
	
	String model;

	// Subclass constructor
	Car(String brand, int year, String Model) {
		
		// Call the superclass (Vehicle) constructor
		 super(brand, year);
		 this.model = Model;
		
		System.out.println("Car constructor called : "+ brand +" " + year+" "+ Model);
	}

	// Override method from Vehicle class
	
	@Override
	void start() {
		super.start(); // Calls the Vehicle's start method
		System.out.println("Car " + model+" " + brand+" " + year + " is starting with extra features.");
	}
}

//Main class to run the program
public class MethodOverridingUsingSuperKeyword {
	
	public static void main(String[] args) {
		
		// Create a Car object
		Car myCar = new Car("Toyota", 2023, "Corolla");

		// Call the start method on the Car object
		myCar.start();
	}
}
