import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Math;
import java.text.Format;
public class DmartBillingApp {
    void comnyNam(){
        System.out.println("\n                       Dmart Shoppping                  ");
        System.out.println("----------------------------------------------------------");
        System.out.println("                     AVENUE SUPERMARTS Ltd.               ");
        System.out.println("----------------------------------------------------------");
        System.out.println("                CIN :- L589632535984TYUOG559R00R          ");
        System.out.println("                    GSTIN :- 36AACCA8432H1ZR              ");
        System.out.println("                    FSSAI NO :-13619011001065             ");
        System.out.println("----------------------------------------------------------");
        System.out.println("                        DMART SANATH NAGAR                ");
        System.out.println("         Plot No-A5, Survey No-59, ward No-7, Block-2,    ");
        System.out.println("              Besid RAdha Krishana Toyato Showroom,       ");
        System.out.println("                 Industrial estate, Sanath nagar,         ");
        System.out.println("                         Hyderabad, 500018.               ");
        System.out.println("________________________Phone : 040-69014700______________");
        System.out.println("----------------------------------------------------------");

        
    }
   
    void invoice(){
        int str =50;
        long min=100000;
        long max = 999999;
        int minChar = 65;
        int maxChar = 67;
        int minChar1 = 65;
        int maxChar1 = 97;
        long random_int = (long)Math.floor(Math.random()*(max-min+1)+min);
        long random_int2 = (long)Math.floor(Math.random()*(max-min+1)+min);
        // date creating and formate changing
        LocalDateTime now = LocalDateTime.now();  // create time 
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy (HH:mm:ss)"); //set the formate
        String timeNow = now.format(format);  
        // completed date and time 
        int random_char =(int)Math.floor(Math.random()*(maxChar-minChar+1)+minChar);
        int random_char1 =(int)Math.floor(Math.random()*(maxChar1-minChar1+1)+minChar1);
        System.out.println("                         TAX INVOICE                     ");
        System.out.println("Bill No :"+str+""+random_int+""+(char)random_char+"-"+random_int2+"       "+"Bill Dt : "+timeNow);
        System.out.println("Vou.No : "+random_char1+""+random_int2+"-"+random_int+"        "+"Cashier : SBA/143143");
        System.out.println("----------------------------------------------------------");
        System.out.println(" HSN     Particulars     Qty/kgs      N/Rate       Value  ");
        System.out.println("----------------------------------------------------------");

       
    }

    void products(){
        System.out.println("SELECT THE YOUR PRODUCTS \n");
        String aa = "U.S.Polo";
        String bb = "PUMA";
        System.out.println(aa+"   "+bb+"\n");
    }

    void shirts(){
      //  System.out.println("====================== Types of Shirts ==================="); 
        String brand1 = "U.S.Polo";
        String brand2 = "PUMA";
        String brand3 = "Highlander";
        String brand4 = "Roadstar";
        String brand5 = "Nike";
        // product price Tag's
        int priceTag1 =1999;
        int priceTag2 =2999;
        int priceTag3 =999;
        int priceTag4 =1299;
        int priceTag5 =4999;
        // product ID's
        int id1 = 102033;
        int id2 = 400025;
        int id3 = 710195;
        int id4 = 669988;
        int id5 = 002030;
        // total price of prodcts
        Scanner quantity = new Scanner(System.in);
        int a = quantity.nextInt();
        int totalPrice = a*priceTag1;
        // now printing the values
	 System.out.println("----------------------------------------------------------");

        System.out.println(id1+"   "+brand1+"          "+a+"           "+priceTag1+"         "+totalPrice);

        

        
    }
    void pants(){
       // System.out.println("================== Types of Jens Pants ===================");
        String brand1 = "U.S.Polo jeans";
        String brand2 = "PUMA jeans";
        String brand3 = "Highlander jeans";
        String brand4 = "Roadstar jeans";
        String brand5 = "Nike jeans";
        int priceTag1 =3999;
        int priceTag2 =1999;
        int priceTag3 =1999;
        int priceTag4 =1399;
        int priceTag5 =2399;
        
    }
    void shopping(){
        Scanner shop = new Scanner(System.in);

        // shirtShopping = shop.next(), pantShopping =shop.next(),shirtQuantity = shop.next(), pantQuantity = shop.next();


    }
    public static void main(String[] args) {
        DmartBillingApp bill = new DmartBillingApp();
        bill.comnyNam();
        bill.invoice();
	 // bill.products();
        bill.shirts();
        bill.pants();
     // bill.invoice();


    }
}
