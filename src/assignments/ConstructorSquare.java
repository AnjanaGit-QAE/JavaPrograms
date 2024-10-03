package assignments;

public class ConstructorSquare {

	  int side;
	  
	  public ConstructorSquare(int s) {
		  this.side=s;

	  }
	  
	  public int area() {
		 int  a=side*side;
		  return a;
	  }
	  
	  public int peremeter() {
		  int p= 4*side;
		  return p;
	  }
	  
	  public int DiagnoalofSquare() {
		  int d=side*sqrt(2);
		  return d;
	  }
	  
	  
	private int sqrt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorSquare cs=new ConstructorSquare(12);
		System.out.println("Area of a given Square is : "+ cs.area());
		System.out.println("Peremeter of a given Square is : "+ cs.peremeter());
		System.out.println("Diagnoal of a given Square is : "+ cs.DiagnoalofSquare());
		
	}

}
