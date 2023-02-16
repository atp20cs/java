import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the order of matrix");
int m = sc.nextInt();
sc.nextLine();
int n = sc.nextInt();
sc.nextLine();
int A[][] = new int[m][n];
System.out.println("Enter the elements");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
A[i][j] = sc.nextInt();
sc.nextLine();
}
}
System.out.println("matrix - A");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
System.out.print(A[i][j]+"\t");
}
System.out.println();
}
System.out.println("transpose matrix - A");
for(int j=0;j<n;j++){
for(int i=0;i<m;i++){ 
System.out.print(A[i][j]+"\t");
}
System.out.println();
}
}
}