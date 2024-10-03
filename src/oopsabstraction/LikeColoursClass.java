package oopsabstraction;

class LikeColoursClass extends Colours {
	
	 public void Eyes() { // class Method
			System.out.println("I am able to see objects Properily. Class Method ");
		}
	
	 public void black() {  // as we are extends this method from abstract class i.e "Colours.java class" we can use public or w/o public keyword also fine.
		System.out.println("I like black colour Most");
	}
	
	  void white() {  // as we are extends this method from abstract class i.e "Colours.java class" we can use public or w/o public keyword also fine.
		System.out.println("I like white colour Most");
	}
	 
	
	public static void main(String[] args) {
	
		LikeColoursClass lc = new LikeColoursClass();
		  
		  lc.Eyes(); // Class Method
		  
		  // Abstract Class methods
		  lc.black(); 
		  lc.white(); 
		  lc.lavender();

		 
	}


}

