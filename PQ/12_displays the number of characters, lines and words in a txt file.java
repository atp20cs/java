import java.io.*;
class Test{
public static void main(String args[]){
try{
FileReader f = new FileReader("test.txt");
BufferedReader br = new BufferedReader(f);
int lc = 0;
int wc = 0;
int cc = 0;
String str = null;
while((str = br.readLine()) != null){
lc++;
cc = cc + str.length();
wc = wc + str.split("\\s+").length;
}
System.out.println("Line Count ="+lc);
System.out.println("Word Count ="+wc);
System.out.println("Character Count ="+cc);
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
}