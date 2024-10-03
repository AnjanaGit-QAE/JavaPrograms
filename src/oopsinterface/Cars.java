package oopsinterface;

public class Cars implements CarsActions {
	
    public void Driving() {  // Class Method
    	System.out.println("Person is Driving a Car");
    }
    
    public void breaks() {
    	System.out.println("Car having Breaks");
    }
    
      public void mirrors() {
    	System.out.println("Car having Mirrors");
    }
    
    public void handles() {
    	System.out.println("Car having Handles");
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars C = new Cars();
		
		C.Driving();
		C.breaks();
		C.mirrors();
		C.handles();
		
		System.out.println();
		
		System.out.println(C.name);
		System.out.println(C.num);
		
		System.out.println();
		
		System.out.println(name);
		System.out.println(num);
 
	}

}
