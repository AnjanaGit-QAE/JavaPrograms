package anjana;

public class MutableImmutableConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Mutable --> Primitive Datatypes (int, float)
		 int A=10;
		 A+=10;
		 System.out.println("The value of A is " + A);
		 
		 float F=12.02f;
		 F+=10;
		 System.out.println("The value of F is " + F);
		 
		 // Immutable --> Strings
		 System.out.println();
		 
		 String name="Raja";
		 name.replace('a', 'b');
		 System.out.println(name);  // It won't replace as String is immutable and we are not storing it in anywhere.
		 System.out.println(name.replace('a', 'b')); // It will replace in a  String as we are storing it again.
		 
		 System.out.println();
		 String Name = name+"Anjana"; // this will also work --> name+="Anjana", means --> name=name+"Anjana" 
		 System.out.println(Name); // It will replace in a  String as we are storing it in Name variable again.
		 
	}

}
