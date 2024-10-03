package anjana;

public class Rectangle {

	int length;
	int width;

	public Rectangle (int l,int w) {
		this.length = l;
		this.width = w;
	}
	
	public int area() {
		return length*width;
	}
	
	public int perimeter() {
		return 2*(length+width);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle R1 = new Rectangle(12,12);
        Rectangle R2 = new Rectangle(16,22);
        
        int Area = R1.area();
        int Peremeter = R2.perimeter();
        
       // System.out.println(" Area of a given Rectangle is : " + R1.area());
        System.out.println(" Area of a given Rectangle is : " + Area);
        System.out.println(" Perimeter of a given Rectangle is : " + Peremeter);
	}

}
