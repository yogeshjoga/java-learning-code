import java.util.Scanner;

public class GameLogic {
    char square[]= {'0','1','2','3','4','5','6','7','8','9' };
    public static Scanner sc = new Scanner(System.in);
    int player = 1;
    int player22 = 2;
    int i;
    int choice;
    char mark;
    String playerComputer = "Computer";


   public int player(){
       return 0;

   }


   public int computer(){
       return 0;
   }

    public int eassy(){  

        System.out.println("Enter your name!");
        String name = GameLogic.sc.next();
         do {
            gameBoard();
         //  player = (player % player22 == 1) ? 1 : 2;
            // if(player = player % player22 == 1){
            //     System.out.println(name);
            // }
            // else{
            //     System.out.println(playerComputer);
            // }

            System.out.println("======= Player " + player + " Enter your choice ==========");
            choice = GameLogic.sc.nextInt();
            mark = (player == 1) ? 'X' : 'O';

            if (choice == 1 && square[1] == '1')
                square[1] = mark;
            else if (choice == 2 && square[2] == '2')
                square[2] = mark;
            else if (choice == 3 && square[3] == '3')
                square[3] = mark;
            else if (choice == 4 && square[4] == '4')
                square[4] = mark;
            else if (choice == 5 && square[5] == '5')
                square[5] = mark;
            else if (choice == 6 && square[6] == '6')
                square[6] = mark;
            else if (choice == 7 && square[7] == '7')
                square[7] = mark;
            else if (choice == 8 && square[8] == '8')
                square[8] = mark;
            else if (choice == 9 && square[9] == '9')
                square[9] = mark;
            else {
                System.out.println("Invalid option !");
                player--;
            }
            i = checkWinner();
            player++;
        } while (i == -1);
        gameBoard();

        if (i == 1) {
            System.out.printf("==>Playr " + --player + " won you got star ");

        } else {
            System.out.println("==>Game is Draw");
        }
        return 0;
    }





    public void medium(){

    }

    public void hard(){

    }


    /**
     * fun with your friends
     * Happy coding 
     * 
     * @return
     */

    public int friendGame(){
        do {
            gameBoard();
            player = (player % player22 == 1) ? 1 : 2;

            System.out.println("======= Player " + player + " Enter your choice ==========");
            choice = GameLogic.sc.nextInt();
            mark = (player == 1) ? 'X' : 'O';

            if (choice == 1 && square[1] == '1')
                square[1] = mark;
            else if (choice == 2 && square[2] == '2')
                square[2] = mark;
            else if (choice == 3 && square[3] == '3')
                square[3] = mark;
            else if (choice == 4 && square[4] == '4')
                square[4] = mark;
            else if (choice == 5 && square[5] == '5')
                square[5] = mark;
            else if (choice == 6 && square[6] == '6')
                square[6] = mark;
            else if (choice == 7 && square[7] == '7')
                square[7] = mark;
            else if (choice == 8 && square[8] == '8')
                square[8] = mark;
            else if (choice == 9 && square[9] == '9')
                square[9] = mark;
            else {
                System.out.println("Invalid option !");
                player--;
            }
            i = checkWinner();
            player++;
        } while (i == -1);
        gameBoard();

        if (i == 1) {
            System.out.printf("==>Playr " + --player + " won you got star ");

        } else {
            System.out.println("==>Game is Draw");
        }
        return 0;
    }


    
    public int checkWinner(){
        if (square[1] == square[2] && square[2] == square[3])
            return 1;
        else if (square[4] == square[5] && square[5] == square[6])
            return 1;
        else if (square[7] == square[8] && square[8] == square[9])
            return 1;
        else if (square[1] == square[4] && square[4] == square[7])
            return 1;
        else if (square[2] == square[5] && square[5] == square[8])
            return 1;
        else if (square[3] == square[6] && square[6] == square[9])
            return 1;
        else if (square[3] == square[5] && square[5] == square[7])
            return 1;
        else if (square[1] == square[5] && square[5] == square[9])
            return 1;
        else if (square[1] != '1' && square[2] != '2' && square[3] != '3' && square[4] != '4' && square[5] != '5'
                && square[6] != '6' && square[7] != '7' && square[8] != '8' && square[9] != '9')
            return 0;
        else
            return -1;

    }

   
   
    

    

    public void gameBoard(){
        clearScreen();
         System.out.println("\n\n\t\t =========Tic Tac Toe by YOGESH JOGA=========\n");
         System.out.println("Player1 (X) - Player2 (0) \n");
         System.out.println("        |       |       ");
         System.out.println("    " + square[1] + "   |  " + square[2] + "    |   " + square[3] + "  ");
         System.out.println("________|_______|_______");
         System.out.println("        |       |         ");
         System.out.println("    " + square[4] + "   |  " + square[5] + "    |   " + square[6] + "  ");
         System.out.println("________|_______|_______");
         System.out.println("        |       |        ");
         System.out.println("    " + square[7] + "   |  " + square[8] + "    |   " + square[9] + "  ");
         System.out.println("        |       |        ");
    }
    
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    public void outputLogic(){
        GameLogic obj = new GameLogic();
        obj.clearScreen();
        System.out.println("\n\n===================***************================\n");
        System.out.println("======= WELCOME TO YOGESH TIC TOC TOE GAME =======\n");
        System.out.println("== YOU HAVE SOME OPTIONS PLEASE SELECT GAME MODE ==\n");
        System.out.println(" ===> 1) Eassy Game mode \n ===> 2) Medium Game Mode \n ===> 3) Hard Game Mode \n ===> 4) Play With your Friend \n ===> 5) Retrun to Main Menu");
        int option = GameLogic.sc.nextInt();
        switch(option){
            case 1 : obj.eassy();
            case 2 : obj.medium();
            case 3 : obj.hard();
            case 4 : obj.friendGame();
            case 5 : obj.outputLogic();
        }
    }
    
    
}
