import java.util.Scanner;

public class sandeep {


static String[][] s = { {"1","2"},
                        {"3","4"} };
                        
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  
 System.out.print("enter your number :  ");
  
 String in =sc.next();
  
 // int row=s.length;int column=s.length;
    
    for(int i=0;i<s.length;i++){
    
      for(int j=0;j<s.length;j++){
      
      if(Test.s[i][j]==in){
      
      System.out.print(i+" "+j);
      
      break;
      }
    }
  }
 }
}