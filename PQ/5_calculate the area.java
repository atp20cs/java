import java.util.Scanner;
class Test{
public void area(int r){
System.out.println("Area of circle = "+ (Math.PI * r * r));
}
public void area(int l,int b){
System.out.println("Area of rectangle = "+ (l*b));
}
public void area(int a,int b,int c){
double s = (a+b+c)/2.0; // half perimeter
double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of triaangle = "+ area);
}
public static void main(String args[]){
Test t = new Test();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius:");
int r = sc.nextInt();
sc.nextLine();
t.area(r);
System.out.println("Enter the length and breadth:");
int l = sc.nextInt();
sc.nextLine();
int b = sc.nextInt();
sc.nextLine();
t.area(l,b);
System.out.println("Enter the sides of a triangle:");
int x = sc.nextInt();
sc.nextLine();
int y = sc.nextInt();
sc.nextLine();
int z = sc.nextInt();
sc.nextLine();
t.area(x,y,z);
}
}