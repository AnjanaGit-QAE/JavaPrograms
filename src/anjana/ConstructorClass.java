package anjana;

public class ConstructorClass {
    
	String name;
	String colour;
	int number;
	
	public ConstructorClass(String name,String colour,int num) {
		this.name=name;
		this.colour=colour;
		this.number=num;
		//System.out.println("Company name of a Car is "+name +","+"It is in "+ colour + " "+"colour." + " " + "It's number plate is "+number+".");
	}
	
	public ConstructorClass(String name,String colour) {
		this.name=name;
		this.colour=colour;
	}
	
	public void Details() {
		System.out.println("Company name of a Car is "+name +","+"It is in "+ colour +" "+"colour." + " " + "It's number plate is "+number+".");
	}
	
	public void Details1() {
		System.out.println("Company name of a Car is " + name + "," + "It is in " + colour + " "+ "colour.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ConstructorClass cc1 = new ConstructorClass("Benz","Balck",1234);
          ConstructorClass cc2 = new ConstructorClass("Toyoto","White",1205);
          ConstructorClass cc3 = new ConstructorClass("Suzuki","Grey",2212);
          ConstructorClass cc = new ConstructorClass("Suzuki","Grey"); 
          
          cc1.Details();
          cc2.Details();
          cc3.Details();
          cc.Details();
          cc.Details1();
	}

}
