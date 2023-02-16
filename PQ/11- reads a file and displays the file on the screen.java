t reads a file and displays the file on the screenimport java.io.*;
class Test{
public static void main(String args[]){
try{
FileReader f1 = new FileReader("test.txt");
BufferedReader br = new BufferedReader(f1);
int lc=0;
String str = null;
while((str = br.readLine()) != null){
lc++;
System.out.println(lc +": "+ str);
}
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
}