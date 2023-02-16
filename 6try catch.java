import java.util.*;
class Main {
	public static void divide(int a, int b) throws ArithmeticException {
	
if(b==0)	{
	throw new ArithmeticException("Divide by 0 is not possible");
}
   else{
   System.out.println(" Result is :" +a/b);
   }
	}
   public static void main (String args[]){
	   int x,y;
	   Scanner sc= new Scanner(System.in);
	   try {
	         System.out.println(" Enter the value of X & Y");
		     x=sc.nextInt();
		     sc.nextLine();
		     y=sc.nextInt();
		     sc.nextLine();
			 divide(x,y);
	        }
     catch(ArithmeticException e)
	 {
		  System.out.println(e.getMessage());
	 }
	 finally {
		 System.out.println("End of Prgm" );
	 }
   }
}