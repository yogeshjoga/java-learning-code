import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Math;
import java.text.Format;
public class DmartBillingApp {
    static DmartBillingApp obj = new DmartBillingApp(); // static object
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
        //Brands for shirts
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
        int id1 = 102051;
        int id2 = 400052;
        int id3 = 710153;
        int id4 = 669954;
        int id5 = 102055;
        // jeans pants brands
        String brandP1 = "U.S.Polo jeans";
        String brandP2 = "PUMA jeans";
        String brandP3 = "Highlander jeans";
        String brandP4 = "Roadstar jeans";
        String brandP5 = "Nike jeans";
        // product price tag for pants
        int priceTagP1 =3999;
        int priceTagP2 =1999;
        int priceTagP3 =1999;
        int priceTagP4 =1399;
        int priceTagP5 =2399; 
        // product ID's
        int idP1 = 902061;
        int idP2 = 600062;
        int idP3 = 710163;
        int idP4 = 369964;
        int idP5 = 502065;
        System.out.println("\n----------------------------------------------------------");
        System.out.println("                   WELCOME TO DMART                         ");
        System.out.println("               SELECT THE YOUR PRODUCTS                     ");
        System.out.println("----------------------------------------------------------");
        String aa = "U.S.Polo";
        String bb = "PUMA";
        String cc = "Highlander";
        String dd ="Roadstar";
        String ee = "Nike";
        String ff ="U.S.Polo jeans";
        String gg = "PUMA jeans";
        String hh = "Highlander jeans";
        String ii = "Roadstar jeans";
        String jj = "Nike jeans";
        System.out.println("1 : U.S.Polo          6 : U.S.Polo jeans  ");
        System.out.println("2 : PUMA              7 : PUMA jeans      ");
        System.out.println("3 : Highlander        8 : Highlander jeans");
        System.out.println("4 : Roadstar          9 : Roadstar jeans  ");
        System.out.println("5 : Nike             10 : Nike jeans      ");
         Scanner option = new Scanner(System.in);
            int shoppingProduct = option.nextInt();
        switch(shoppingProduct){
            case 1:
                System.out.println(aa+" How many shirts you want?");
                break;
            case 2:
                System.out.println(bb+" How many shirts you want?");
                break;
            case 3:
                System.out.println(cc+" How many shirts you want?");
                break;
            case 4:
                System.out.println(dd+" How many shirts you want?");
                break;
            case 5:
                System.out.println(ee+" How many shirts you want?");
                break;
            case 6:
                System.out.println(ff+" How many shirts you want?");
                break;
            case 7:
                System.out.println(gg+" How many shirts you want?");
                break;
            case 8:
                System.out.println(hh+" How many shirts you want?");
                break;
            case 9:
                System.out.println(ii+" How many shirts you want?");
                break;
            case 10:
                System.out.println(jj+" How many shirts you want?");
                break;
        }
        // total price of prodcts
        Scanner quantity = new Scanner(System.in);
        int a = quantity.nextInt();
        long totalPrice = a*priceTag1;
        // now printing the values
	    //System.out.println("----------------------------------------------------------");
        

        System.out.println(id1+"   "+brand1+"                "+a+"           "+priceTag1+"         "+totalPrice);
        System.out.println(id2+"   "+brand2+"                    "+a+"           "+priceTag2+"         "+totalPrice);
        System.out.println(id3+"   "+brand3+"              "+a+"           "+priceTag3+"          "+totalPrice);
        System.out.println(id4+"   "+brand4+"                "+a+"           "+priceTag4+"         "+totalPrice);
        System.out.println(id5+"   "+brand5+"                    "+a+"           "+priceTag5+"         "+totalPrice);
        System.out.println(idP1+"   "+brandP1+"          "+a+"           "+priceTagP1+"         "+totalPrice);
        System.out.println(idP2+"   "+brandP2+"              "+a+"           "+priceTagP2+"         "+totalPrice);
        System.out.println(idP3+"   "+brandP3+"        "+a+"           "+priceTagP3+"         "+totalPrice);
        System.out.println(idP4+"   "+brandP4+"          "+a+"           "+priceTagP4+"         "+totalPrice);
        System.out.println(idP5+"   "+brandP5+"              "+a+"           "+priceTagP5+"         "+totalPrice);


    }

    void shopping(){
        Scanner shop = new Scanner(System.in);
        // shirtShopping = shop.next(), pantShopping =shop.next(),shirtQuantity = shop.next(), pantQuantity = shop.next();
    }
    public static void main(String[] args) {
        DmartBillingApp bill = new DmartBillingApp();
        bill.products();
        bill.comnyNam();
        bill.invoice();
     // bill.shoppingItems();
	 // bill.products();
     // bill.shirts();
     // bill.pants();
     // bill.invoice();
    }
}