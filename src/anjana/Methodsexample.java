package anjana;

public class Methodsexample {

	public void sellaproduct1(String s1, int c1, int g1)
	{
		String name = s1;
		int cost = c1;
		int gst = g1;
		
		int sellingprice = cost + gst;
		
		System.out.println(name+" " + "price" +" "+ sellingprice);
	}
	
	public void sellaproduct2(String s1, int c1, int g1)
	{
		String name = s1;
		int cost = c1;
		int gst = g1;
		
		int sellingprice = cost + gst;
		
		System.out.println(name+" " + "price" +" "+ sellingprice);
	}
	
	public void sellaproduct3(String s1, int c1, int g1)
	{
		String name = s1;
		int cost = c1;
		int gst = g1;
		
		int sellingprice = cost + gst;
		
		System.out.println(name+" " + "price" +" "+ sellingprice);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodsexample m1 = new Methodsexample();
		Methodsexample m2 = new Methodsexample();
		
		m1.sellaproduct1("raja",50,6);
		m2.sellaproduct3("raju",54,6);

	}

}
