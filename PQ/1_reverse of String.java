import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the String:");
String org = sc.nextLine();
String rev = "";
for(int i = org.length() - 1; i>=0;i--){
rev = rev + org.charAt(i);
}
System.out.println("Reverse String = "+rev);
}
}