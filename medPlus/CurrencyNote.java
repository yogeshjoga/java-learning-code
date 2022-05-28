import java.util.Scanner;
/**
 * 
 */
public class CurrencyNote {
    public static void currencyChange(int amount){
            int notes[] ={2000,500,200,100,50,20,10,5,2,1};
            for (int i = 0; i < notes.length; i++) {
                  if(amount >= notes[i] ){
                    int numberOfNotes =+ amount/notes[i];
                    System.out.println(notes[i]+" : "+numberOfNotes);
                    amount = amount % notes[i];
                  }
                
            }
               
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your amout");
        int amount = sc.nextInt();
        currencyChange(amount);
    }
    
}
