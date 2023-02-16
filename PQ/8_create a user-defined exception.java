import java.util.Scanner;
class PasswordException extends Exception{
private String message;
public PasswordException(String message){
this.message = message;
}
public String getMessage(){
return message;
}
}
class Test{
public static void main(String args[]){
try{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the username:");
String user = sc.nextLine();
System.out.println("Enter the password:");
String pass = sc.nextLine();
if(user.equals("admin") && pass.equals("test123")){
System.out.println("Login Successfull");
}
else{
throw new PasswordException("Invalid Login
Credentials");
}
}
catch(PasswordException e){
System.out.println(e.getMessage());
}
}
}