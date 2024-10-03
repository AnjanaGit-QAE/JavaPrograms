package anjana;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Anjana Sharanya";
		
		// Using Inbuilt Method
		System.out.println(name.contains("Sharanya")); //true
		
		// Using split
		String[] arr = name.split(" ");
		String name1="Sharanya";
		int len=arr.length;
		
		for(int i=0;i<len;i++) {
			
			if(arr[i].equals(name1)) {
				System.out.println(arr[i]);
			}
		}
    
		// Using Boolean with String inBuilt Method
		
		String str="Anjana Sharanya";
		String str1="Sharanya";
		 
		boolean result= str.contains(str1);
		
		if(result==true) {
			System.out.println("Sub String Present : " + result);
		}
		else {
			System.out.println("Sub String Not Present : " +result);
		}
		
		// Using Substring In-Built Method
		
		
		int a=name.indexOf('S');
		int b=name.indexOf('j');
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(name.substring(7));
		System.out.println(name.substring(2));
	}

}
