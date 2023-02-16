import java.io.*;
public class File{
  public static void main(String args[]) throws Exception{
    FileInputStream fin = new FileInputStream("/home/user/Desktop/Source.txt");
    FileOutputStream fout = new FileOutputStream("Copy.txt");

    int i;
    while((i =fin.read()) != -1){
      System.out.print((char)i);
      fout.write(i);
    }

    fin.close();
    fout.close();
  }
}
