package polymorphism;

//Method Overriding is Runtime Polymorphism.

//Parent class Animal
class Animal {
	
	// Method to be overridden
	public void makeSound() {
		System.out.println("Some generic animal sound");
	}
	
	public void sound() {
		System.out.println("Sound! Sound!");
	}

	void makeSounds() {
		// TODO Auto-generated method stub
		
	}
}

//Child class Dog that overrides makeSound method of Animal class
class Dog extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
	
}

//Child class Cat that overrides makeSound method of Animal class
class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow! Meow!");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		// Creating objects of different classes
	
		Animal myAnimal = new Animal(); // Animal object
		Animal myDog = new Dog(); // Dog object (as Animal reference)
		Animal myCat = new Cat(); // Cat object (as Animal reference)

		// Calling overridden methods
		myAnimal.makeSound(); // Calls Animal's method
		myDog.makeSound(); // Calls Dog's overridden method
		myCat.makeSound(); // Calls Cat's overridden method
		
		System.out.println();
		
		myAnimal.sound();
		myDog.sound();
		myCat.sound();
		
	}
}
