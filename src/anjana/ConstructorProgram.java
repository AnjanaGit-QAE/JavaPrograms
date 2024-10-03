package anjana;

public class ConstructorProgram {

	int i;
	int j;
	int k;
	int l;
	int m;
	
	public ConstructorProgram(int a, int b,int c,int d,int e) {
		this.i=a;
		this.j=b;
		this.k=c;
		this.l=d;
		this.m=e;
		
	}
	
	public int Addition() {  // No need of passing again like this if we are using constructor Addition(int i,int j)
		int add = i+j;
		return add;
	}
	
	public int Substraction() {  // No need of passing again like this if we are using constructor Substraction(int k,int j)
		int sub = k-j;
		return sub;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ConstructorProgram cp = new ConstructorProgram(10,12,14,16,18);
		
		ConstructorProgram cp1 = new ConstructorProgram(22,12,44,66,88);
		
		System.out.println(cp.Addition());      // no need of passing values while using constructor like cp.Addition(10,20)
		System.out.println(cp.Substraction());  // no need of passing values while using constructor like cp.Substraction(14,12)
		
		System.out.println(cp1.Addition());      // no need of passing values while using constructor like cp.Addition(10,20)
		System.out.println(cp1.Substraction());
	}

}
