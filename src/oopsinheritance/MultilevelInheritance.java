package oopsinheritance;

//Multilevel Inheritance Class extends the child class(SingleLevelInheritance) of an ParentClass

public class MultilevelInheritance extends SingleLevelInheritance {  

	public void MultiLevel() {
		System.out.println("I am MultilevelInheritance class Method Inheriting SubClass(SingleLevelInheritance) of an Parent Class" );
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		MultilevelInheritance  ML = new MultilevelInheritance();
		
		ML.Selenium(); // Parent class methods inherting in child class(SingleLevelInheritance) using "extends" keyword, and that child class is inherting the new Child class(MultilevelInheritance)with child class object.
		ML.Guidence(); // Parent class methods inherting in child class(SingleLevelInheritance) using "extends" keyword, and that child class is inherting the new Child class(MultilevelInheritance)with child class object.
		ML.SingleLevel(); // Child class(SingleLevelInheritance) Method.
		ML.MultiLevel(); // Child class(MultilevelInheritance) Method.
		
	}

}
