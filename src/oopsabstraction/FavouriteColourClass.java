package oopsabstraction;

public class FavouriteColourClass extends FavouriteColour{
	
	public void Legs() { // class Method
		System.out.println("I am able to Walk Properily ");
	}
	
	 public void green() {  // as we are extends this method from abstract class i.e "FavouriteColour.java class" we can use public or w/o public keyword also fine.
		System.out.println("I like Green colour Most");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		FavouriteColourClass fc = new FavouriteColourClass();
		
		fc.Legs(); // Class Method.
		fc.green();
		fc.Orange();
		
		
		
	
	}

}
