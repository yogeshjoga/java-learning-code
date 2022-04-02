import java.util.Scanner;
import java.lang.Throwable.*;

public class BankUserLogic extends BANK {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);

        BANK obj2 = new BANK();
        ATM obj4 =  obj2.getBankMethod();
        // BankUserLogic obj3 = new BANk();

        System.out.println("===================================");
        System.out.println("WELCOME TO YOGI BANKING SECTOR");
        System.out.println("======SELECT YOUR SERVICES==========");
        System.out.println("=== 1) open a new Bank Account =====");
        System.out.println("=== 2) Deposit money Bank Account ===");
        System.out.println("=== 3) Withdrawal money Bank Account =");
        System.out.println("=== 4) Print Receipt Bank Account ===");
        System.out.println("=== 4) Print Receipt Bank Account ===");
        int option = sc.nextInt();
        switch(option){
            case 1:{
                obj4.openAccount();
            }
            case 2:{
                obj4.depositMoney();
            }
            case 3:{
                obj4.withDrawalMoney();
            }
            case 4:{
                obj4.receipt();
            }
           // case 5:
        }
    }
    
}
