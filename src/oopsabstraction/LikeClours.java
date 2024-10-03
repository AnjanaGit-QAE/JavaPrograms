package oopsabstraction;

//Abstract Class will have both  "abstract methods" and "normal methods" .

abstract class Colours {

	abstract void black(); // abstract methods dosen't have body (or) body definition.

	abstract void white();

	public void lavender() { // Normal methods will have body definition
		System.out.println("I like lavender colour Most");
	}

}
