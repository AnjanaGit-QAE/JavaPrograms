package anjana;

public class StringSplit {

	public static void main(String[] args) {
		
		
		   String s = "Checkbox 3 (+$36.00)";
		   String[] split= s.split(" ");
		   
		   int count=0;
		   String str="";
		  
		   for(int i=0;i<split.length;i++)  {
			  // System.out.print(split[i]+" ");
			   str=str+split[i];
			   count++;
			   if(count == 2) {
				   break;
			   }
		   }
		   System.out.println(str);
	}

}
