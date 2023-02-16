import java.io.*;
class Test{
 public static void main(String args[]){
 try{
 FileReader fin = new FileReader("test.txt");
 BufferedReader br = new BufferedReader(fin);
 String inp = br.readLine();
 int sum =0;
 for(String element: inp.split()){
 System.out.println(element);
 sum = sum + Integer.parseInt(element);
 }
 System.out.println("Sum="+sum);
 fin.close();
 }
 catch(IOException e){
 System.out.println(e.getMessage());
 }
 }
} 
