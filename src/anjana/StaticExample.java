package anjana;

public class StaticExample {
  
	public static int  count=0;
	
	public StaticExample() {
		count++;
	}
	
	public static int  displayCount() {
		return count;
	}
	
	public static void main(String[] args) {
		
		StaticExample se1 = new StaticExample();
		StaticExample se2= new StaticExample();
		
		System.out.println("Count is : "+ StaticExample.displayCount());
		
	}

}
