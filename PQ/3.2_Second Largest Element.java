import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the limit");
int n = sc.nextInt();
sc.nextLine();
int A[] = new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++){
A[i] = sc.nextInt();
sc.nextLine();
}
int first = Integer.MIN_VALUE; // smallest
int second = Integer.MIN_VALUE; // second largest
for(int i=0;i<n;i++){
if(A[i] > first) {
second = first;
first = A[i];
}
// first = 7 second = 20 A[i] = 10
else if(A[i] < first && A[i] > second){
second = A[i];
}
}
System.out.println("Largest Element = "+ first);
System.out.println("Second Largest Element = "+second);
}
}
