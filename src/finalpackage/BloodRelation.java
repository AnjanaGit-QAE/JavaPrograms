package finalpackage;

public class BloodRelation extends FamilyClass { // we can't access this "FamilyClass" class as it is declared with final Keyword.

	public void Relation() { // we can't access this method also as we declared final method in the "FamilyClass"
		System.out.println("We are Family");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BloodRelation BR = new BloodRelation();
		BR.Relation(); // output will be the subclass method value only, Although it is having same method name(super/parent class method) as we declared final to method in parent class we cannot access it in subclass.
     
	}

}

