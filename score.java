import java.util.Scanner;
class Test{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the score:");
 int score = sc.nextInt();
 sc.nextLine();
 
 if(score < 50){
	  System.out.print("Fail");
 }
 
 else if (score>=50 && score <60){
	  System.out.print("Average");
 }
 else if (score>=60 && score <70){
	  System.out.print("Second class");
 }
 else if (score>=70 && score <80){
	  System.out.print("First class");
 }
 else if (score>=80 && score <90){
	  System.out.print("Distinction");
 }
 else if (score>=90 && score <100){
	  System.out.print("Excellent");
 }
 
 }
}