import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

public class FirstFile {
 public static void main(String[] args) throws Exception{
//      System.out.println("This is the file io Streams intro");
//      FileOutputStream fileWrie = new FileOutputStream("C:/Desktop/file.txt");
//      System.out.println("To create the files by using this FileOutputStream class");
//      String s = "Hello yogesh billa how are you man are you okay now we will do everything for you";
//    //  fileWrie.write(s);
//      fileWrie.close();
        System.out.println("Enter the file name : ");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\"+fileName);    
             String s = "Hello yogesh this is the billa darling";
             byte b[] = s.getBytes();
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }
            
           catch(Exception e){
                System.out.println(e);
            }    
         
    }    
}
