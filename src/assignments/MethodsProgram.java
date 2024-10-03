package assignments;

public class MethodsProgram {

	int n1=12, n2=22;
	float f1=12.22f,f2=22.22f;
	public int Addition() {
		return n1+n2;
	}
	
	public int Subraction() {
		return n1-n2;
	}

	public float Multiplication() {
		return f1*f2;
	}

	public float Division() {
		return f1/f2;
	}
	
	public String[] names() {
		String[] str=new String[] {"Anjana","Sharanya","Raja"};
		System.out.println("Given String Array is :");
	    System.out.println(str);
		return str;
	    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsProgram mp=new MethodsProgram();
		System.out.println(mp.Addition());
		System.out.println(mp.Subraction());
		System.out.println(mp.Multiplication());
		System.out.println(mp.Division());
		System.out.println(mp.names());
	}

}
