package assignments;

public class ConditionalStatements {
   public void cndstmt() {
	   int num=12;
	   for(int i=0;i<=15;i++) {
		   if(num==i) {
			   System.out.println("Number is :" + i);
			   break;
		   }
		   else {
			   System.out.println("Number is not Avialable");
		   }
	   }
   }
   
   public void cndstmt1() {
	   char[] ch=new char[] {'R','A','J','A' };
	   int len =ch.length;
	   for(int i=0;i<len;i++) {
		   System.out.println("Charecters in an given Array is : "+ ch[i]);
	   }
   }
   
   public void cndstmt2() {
	   int number=12;
	   while(number>=5) {
		   System.out.println("Loop is Working ");
		   number--;
	   } 
   }
   
   public void cndstmt3() {
	   String[] str=new String[] {"raja","anjana","sharanya"};
	   int len=str.length;
	   for(int i=0;i<len;i++) {
		   if(str[i].equals("anjana")) {
			   System.out.println("String Matched : "+str[i]);
			   break;
		   }
	   }
   }
   public void cndstmt4() {
	   
   }
   
   public void loop() {
	   while(true) {
		   System.out.println("Loop is Working");
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionalStatements cs=new ConditionalStatements();
		cs.cndstmt();
		cs.cndstmt1();
		cs.cndstmt2();
		cs.cndstmt3();
		cs.loop();
	}

}
