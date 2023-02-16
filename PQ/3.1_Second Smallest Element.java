import java.util.Scanner;
class Test{
public static void main(String args[]){
System.out.println("Enter the limit");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.nextLine();
System.out.println("Enter the elements");
int A[] = new int[n];
for(int i=0;i<n;i++){
A[i] = sc.nextInt();
sc.nextLine();
}
int first = Integer.MAX_VALUE;
int second= Integer.MAX_VALUE;
for(int i=0;i<n;i++){
if(A[i] < first){
second = first;
first = A[i];
}
else if(A[i] > first & A[i] < second){
second = A[i];
}
}
System.out.println("Smallest Element ="+first);
System.out.println("Second Smallest Element ="+second);
}
}