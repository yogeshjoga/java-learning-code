import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Throwable.*;

public class BANK {
    private class BankBackEnd implements ATM {
        //private variables
        private double totalAmt = 10_000;
        private double depositAmt;
        private double withdarwalAmt;
        private String userName;
        private int pinCode;
        private String userAddr;

        public double getTotalAmt() {
            return this.totalAmt;
        }

        public void setTotalAmt(double totalAmt) {
            this.totalAmt = totalAmt;
        }

        public double getDepositAmt() {
            return this.depositAmt;
        }

        public void setDepositAmt(double depositAmt) {
            this.depositAmt = depositAmt;
            if (0 >= depositAmt) {
                this.totalAmt = this.totalAmt + depositAmt;
                System.out.println(this.totalAmt);
            }
            
        }

        public double getWithdarwalAmt() {
            return this.withdarwalAmt;
        }

        public void setWithdarwalAmt(double withdarwalAmt) {
            this.withdarwalAmt = withdarwalAmt;
            if(0 >= withdarwalAmt){
                this.totalAmt = this.totalAmt - withdarwalAmt;
                System.out.println(this.totalAmt);
            }
        }

        public String getUserName() {
            return this.userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getPinCode() {
            return this.pinCode;
        }

        public void setPinCode(int pinCode) {
            this.pinCode = pinCode;
        }

        public String getUserAddr() {
            return this.userAddr;
        }

        public void setUserAddr(String userAddr) {
            this.userAddr = userAddr;
        }

        BankBackEnd obj = new BankBackEnd();

       

        //static Scanner    
        static Scanner sc = new Scanner(System.in);



        // constructor 
        //  BankBackEnd(double totalAmt, double depositAmt, double withdarwalAmt){
        //      this.totalAmt = totalAmt;
        //      this.depositAmt = depositAmt;
        //      this.withdarwalAmt = withdarwalAmt; 
        //  }

        @Override
        public void openAccount(){
            System.out.println("Enter Your name");
            String usNam = BankBackEnd.sc.nextLine();
            obj.setUserName(usNam);
            System.out.println("Set the Password to your ATM CARD ");
            int pinC = BankBackEnd.sc.nextInt();
            obj.setPinCode(pinC);
            System.out.println("Enter your Perment address ");
            String addr = BankBackEnd.sc.nextLine();
            obj.setUserAddr(addr);

        }

        @Override
        public void receipt(){
            System.out.println("======OPTIONS=====\n 1) Print Receipt YES \n 2) Print Receipt NO ");
            int selectOption = BankBackEnd.sc.nextInt();
            switch(selectOption){
                case 1 : {
                    try{
                     System.out.println("enter file name with extension");
                     String fileName = BankBackEnd.sc.next();
                     File f = new File("Desktop:\\"+fileName);
                     PrintWriter pw = new PrintWriter(f);
                     pw.println("==============WELCOME TO YOGI BANKING============"); 
                     pw.println("Customer name : " + obj.getUserName());  
                     pw.println("Total Blance Amount in your account--: "+ obj.getTotalAmt());
                     pw.println(obj.getUserAddr());
                     pw.println("THANK YOU...");
                     pw.flush();
                     pw.close();
                    }
                    catch(FileNotFoundException e){
                        System.out.println("check the file and file path it may be not have!");
                    }
                    finally{
                        System.out.println("Success...");
                    }
                }
                case 2 :{
                    System.out.println("WELCOME THE YOGI BANKING SERVICES");
                    System.out.println("Customer Name : "+ obj.getUserName());
                    System.out.println("YOUR TOTAL AMOUTN IS : "+ obj.getTotalAmt());
                    System.out.println(obj.getUserAddr());

                }
            }
           
        }
        
        @Override
        public void depositMoney(){
            System.out.println("Enter your amount");
            double amtDep = BankBackEnd.sc.nextDouble();
            obj.setDepositAmt(amtDep);
            System.out.println("Your Amount is Successfully Deposited \n THANK YOU FOR BANKING \n HAVE A NICE DAY");
        }

        @Override
        public void withDrawalMoney(){
            System.out.println("Enter your amount");
            double amtWith = BankBackEnd.sc.nextDouble();
            obj.setWithdarwalAmt(amtWith);
            System.out.println("TAKE YOUR CASH! \n THANK YOU FOR BANKING \n HAVE A NICE DAY");
        }

        // @Override
        // forgotUserAtmPin()throws Exception{

        // } 

        // @Override
        // updateUserAddr()throws Exception{

        // }

        // @Override
        // blanceChecking(){
        //     System.out.println("========Your current Bank Blance=======");
            
        // }
         
    }
    public ATM getBankMethod(){
        ATM obj1 = new BankBackEnd();
        return obj1;
    }
}
// https://localhost.services.adobe.com:5500/em