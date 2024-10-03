package oopsinheritance;

//Child class is inhereting the  ParentClass then it is Single-Level Inheritance.

public class SingleLevelInheritance extends ParentClass {

	public void SingleLevel() {
		System.out.println("I am SingleLevelInheritance class method(SingleLevelInheritance) Inheriting ParentClass" );
	}
	
	@Override
	public void Guidence() {
		System.out.println("I am learning..... Selenium Course Under Raja Gudience" );
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		SingleLevelInheritance  SL = new SingleLevelInheritance();
		SL.Selenium(); // Parent class methods inherting in child class using "extends" keyword with child class object.
		SL.Guidence(); // Parent class methods inherting in child class using "extends" keyword with child class object.
		SL.SingleLevel(); // Child class (SingleLevelInheritance) Method.

	}

}
