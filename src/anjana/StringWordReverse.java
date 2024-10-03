package anjana;

public class StringWordReverse {

	public static void main(String[] args) {
		
		
		String s = "I am Happy" ;
	    String[] word = s.split(" ");
	    String res = "";
	    
	    int length = word.length;
	    
	    for(int i=length-1;i>=0;i--) {
	    	res = res + word[i] + " ";
	    }
	    
	    System.out.println(res); //Happy am I 
	    System.out.println();
	    
		String str = "I am Happy" ;
		String result = "";
		
		String[] words = str.split(" ");
		
		for(String wrd : words) {
			
			char[] wordarray= wrd.toCharArray();
			int len = wordarray.length;
			
			String revword = "";
			
			for( int i=len-1 ;i>=0 ;i--) {
			     revword = revword + wordarray[i];
			}
			
			result = result + revword + " ";
		}
		
	   System.out.println(result); //I ma yppaH
	   
	   System.out.println();
	   String[] resultArr =result.split(" ");
	   
	   for(int i=resultArr.length-1;i>=0;i--) {
		   System.out.print(resultArr[i]+" "); //yppaH ma I 
	   }
	    
	   

	    System.out.println();
	    String name = "I am Happy" ;
	    String[] namearr = name.split(" ");
	    String reslt = "";
	    
	    int length1 = namearr.length;
	    
	    for(int i=length1-1;i>=0;i--) {
	    	reslt = reslt + namearr[i].toUpperCase()+" ";
	    }
	    
	    System.out.println(reslt);
	}

}
