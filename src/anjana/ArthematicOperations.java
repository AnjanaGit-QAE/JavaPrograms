package anjana;

public class ArthematicOperations {
	
	int a=22;
	int b=44;
    float c= 55.55f;
    float d=66.99f;
    String fname= "Anjana Sharanya";
    String lname= "Raja";
    char initial='R';
    
    // for every methods will have only one return type.
    
    public int Addition() {
    	int add = a+b;
    	//System.out.println(add); if we mention void as return type it wont return anything.
    	return add;
    }
    
    public int Subraction() {
    	int sub = a-b ;
    	return sub;
    	   
    }
    
    public float Multiplication () {
    	float Mul = c*d;
    	return Mul;
    }
    
    public float Division() {
    	float div = c/d ;
    	return div ;
    }
    
    public char[] myArray() {
    	char [] name = new char[] {'R', 'A','B','S'};
    	System.out.println("My own Array");
    	System.out.println(name);
    	return name;
    }
    

	public static void main(String[] args) {
		//object creation
        ArthematicOperations A = new ArthematicOperations();
        
        System.out.println(A.Addition());
        System.out.println(A.Subraction());
        System.out.println(A.Multiplication());
        System.out.println(A.Division());
        A.myArray();
        System.out.println(A.lname);
        
	}

}
