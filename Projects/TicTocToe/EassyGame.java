import java.util.Random;
import java.util.Scanner;
public class EassyGame {
    int arr[] ={0,1,2,3,4,5,6,7,8,9};
    int choice;
    Scanner sc = new Scanner(System.in);

    public void gameMode(){
     Random num = new Random();
     int num1 = num.nextInt(1,9);
     System.out.println(num1);
    
    }

    public void userMove(){
       if(choice == 1 && arr[1] == '1')


    }

    public void computerMove(){

    }
   public int checkwinner(){
        if(arr[1] == arr[2] && arr[2] == arr[3])
        return 1;
        else if (arr[4] == arr[5] && arr[5] == arr[6])
        return 1;
        else if (arr[1] == arr[2] && arr[2] == arr[3])
        return 1;
        else if (arr[1] == arr[2] && arr[2] == arr[3])
        return 1;
        else if (arr[1] == arr[2] && arr[2] == arr[3])
        return 1;
        else if (arr[1] == arr[2] && arr[2] == arr[3])
        return 1;
        else if (arr[1] == arr[2] && arr[2] == arr[3])
        return 1;
        else if (arr[1] == arr[2] && arr[2] == arr[3])
        return 1;
        else if (arr[1] == arr[2] && arr[2] == arr[3])
        return 1;
        else if (arr[1] == arr[2] && arr[2] == arr[3])
        return 1;
        else if (arr[1] == arr[2] && arr[2] == arr[3])
        return 1;
    }



    public static void main(String[] args) {
        EassyGame obj = new EassyGame();
        obj.gameMode();
    }
}
