import java.util.Scanner;

public class SandeepTic {

    static String[][] board = {
            { " ", " ", " " },
            { " ", " ", " " },
            { " ", " ", " " }
    };

    static String[][] s = {
            { "1", "2", "3" },
            { "4", "5", "6" },
            { "7", "8", "9" }
    };
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("choose your move : (1-9)");

        playerInput(sc.next());
    }

    public static void playerInput(String playerInput) {

        switch (playerInput) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9": {
                for (int row = 0; row < board.length; row++) {
                    for (int column = 0; column < board.length; column++) {
                        if (s[row][column].equals(playerInput)) {
                            playerMove(playerInput, row, column);
                        }
                    }
                }
                break;
            }

            default:
                System.out.println("invalid entry\nEnter a valid input (1-9)");
                playerInput(sc.next());
        }
    }

    public static void computerInput() {

        String computerInput = "" + (int) ((Math.random() * 9) + 1);
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                if (s[row][column].equals(computerInput))
                    computerMove(computerInput, row, column);
            }
        }
    }

    public static void playerMove(String playerInput, int row, int column) {

        if (board[row][column] == " ") {
            switch (playerInput) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9": {
                    board[row][column] = "×";
                    if (checkWin()) {
                        printBoard();
                        System.out.println("***  You Wins :) ***");
                        break;
                    } else
                        computerInput();
                }
            }
        } else {
            System.out.println(playerInput + " position is not available\nenter a valid move");
            playerInput(sc.next());
        }
    }

    public static void computerMove(String computerInput, int row, int column) {

        if (board[row][column] == " ") {
            switch (computerInput) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9": {
                    System.out.println("Computer chooses : " + computerInput);
                    board[row][column] = "o";
                    printBoard();
                    if (checkWin())
                        System.out.println("** Computer wins :(  ***");
                    else
                        playerInput(sc.next());
                }
            }
        } else {

            try {

                computerInput();
            } catch (StackOverflowError e) {
                win();
            } finally {
                checkWin();
            }
        }
    }

    public static boolean checkWin() {
        if (board[0][0] == "×" && board[0][1] == "×" && board[0][2] == "×"
                || board[1][0] == "×" && board[1][1] == "×" && board[1][2] == "×"
                || board[2][0] == "×" && board[2][1] == "×" && board[2][2] == "×"
                || board[0][0] == "×" && board[1][0] == "×" && board[2][0] == "×"
                || board[0][1] == "×" && board[1][1] == "×" && board[2][1] == "×"
                || board[0][2] == "×" && board[1][2] == "×" && board[2][2] == "×"
                || board[0][0] == "×" && board[1][1] == "×" && board[2][2] == "×"
                || board[0][2] == "×" && board[1][1] == "×" && board[2][0] == "×")
            return true;
        else if (board[0][0] == "o" && board[0][1] == "o" && board[0][2] == "o"
                || board[1][0] == "o" && board[1][1] == "o" && board[1][2] == "o"
                || board[2][0] == "o" && board[2][1] == "o" && board[2][2] == "o"
                || board[0][0] == "o" && board[1][0] == "o" && board[2][0] == "o"
                || board[0][1] == "o" && board[1][1] == "o" && board[2][1] == "o"
                || board[0][2] == "o" && board[1][2] == "o" && board[2][2] == "o"
                || board[0][0] == "o" && board[1][1] == "o" && board[2][2] == "o"
                || board[0][2] == "o" && board[1][1] == "o" && board[2][0] == "o")
            return true;
        else
            return false;
    }





    public static void win() {
        if (checkWin()) {

        } 
        else
            System.out.println("****    ITS A TIE GAME *****");
    }






    public static void printBoard() {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}