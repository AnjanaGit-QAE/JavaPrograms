package oopsinheritance;

//If one or more child class is inhereting the same ParentClass then it is Heirarchy Inheritance.
//i.e SingleLevelInheritance,HeirarchyInheritance classes Inhereting same Parentclass.

public class HeirarchyInheritance extends ParentClass { 

	public void Heirarchy() {
		System.out.println("I am New Child class Inheriting ParentClass" );
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		HeirarchyInheritance  HL = new HeirarchyInheritance();
		
		HL.Selenium(); // Parent class methods inherting in child class using "extends" keyword with child class object.
		HL.Guidence(); // Parent class methods inherting in child class using "extends" keyword with child class object.
		HL.Heirarchy(); // Child class (HeirarchyInheritance class) Method.

	}

}
