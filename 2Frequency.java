import java.util.Scanner;
class Frequency1
{
   public static void main(String args[])
   {
   	int i;
	Scanner sc=new Scanner(System.in);//object creation

	System.out.println("Enter the string");
	String str=sc.nextLine();//reading the string

	System.out.println("Enter character to search");
	char ch=sc.nextLine().charAt(0);//reading the character to be searched

	int count=0;
	int len=str.length();
	for(i=0;i<len;i++)
	{
		if(str.charAt(i)==ch)
		{
	  	count++;
		}
	}
System.out.println("Count of occurance of "+ch+"="+count);

  }
}

