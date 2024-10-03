package finalpackage;

final public class FamilyClass {
	
	String name="Anjana";
	int count=5;
    int ages =10;
	
	
    final public void Relation() {
		System.out.println("We are Family....");
	}

	public static void main(String[] args) {
		
		FamilyClass FC = new FamilyClass();
		
		int age=12;
		age=20;
		System.out.println(age);  // o/p : 20
		
		final int Amount=120;
		Amount=240; // here we can't perform any action as this variable is final we can't modify it
		System.out.println(Amount);
		
		System.out.println(name);
		System.out.println(ages);
		
  
	}

}
