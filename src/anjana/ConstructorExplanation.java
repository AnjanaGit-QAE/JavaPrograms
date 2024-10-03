package anjana;

public class ConstructorExplanation {
    
	String product_name;
	int price;
	int discount;
	
	//***  Constructor ***
	
	//special type method
	// name of the constructor should be same as the class name
	// constructor does not have any return data type
	// no need to call the constructor like normal methods to execute (it will be called automatically when create an object)
	
    // ***  Use ***
	//constructor is used for initializing/intantiating of  the class variables
	
	
	//"this" key word refers current object of the class (or) It represents instance of the class
	
	public ConstructorExplanation(String ProductName, int price, int discount)
	{
		this.product_name = ProductName;
		this.price = price;
		this.discount = discount;
		
		//System.out.println("Hi " + product_name +" "+ price+" " + discount);
		//We can print here directly or else we can use methods to print details.
	}

	public void sellproduct()
	{
		System.out.println(product_name +" "+ price+" " + discount);
	}

	public void giveback()
	{
		System.out.println(product_name +" "+ price+" " + discount);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ConstructorExplanation ce1 = new ConstructorExplanation("soap",50,10);
            //ce1.product_name = "soap";
     		//ce1.price = 50;
     		//ce1.discount = 10;
     		
       ConstructorExplanation ce2 = new ConstructorExplanation("shampoo",10,2);
     		//ce2.product_name= "shampoo";
     		//ce2.price=10;
     		//ce2.discount=2;
     	
       ConstructorExplanation ce3 = new ConstructorExplanation("veggies",100,25);
     		//ce3.product_name = "veggies";
     		//ce3.price = 100;
     		//ce3.discount = 25;
     		

     		//ce1.sellproduct();
     		//ce2.sellproduct();
     		//ce3.sellproduct();
     		ce3.giveback();
	}

}
