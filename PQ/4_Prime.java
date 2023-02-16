import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the element:");
int n = sc.nextInt();
sc.nextLine();
int flag = 0;
for(int i=2;i<=n/2;i++){
if(n% i == 0){
flag = 1;
break;
}
}
if(flag == 0){
System.out.println(n + " is a prime number");
}
else{
System.out.println(n + " is not a prime number");
}
}
}
