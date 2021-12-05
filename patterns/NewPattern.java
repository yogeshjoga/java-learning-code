public class NewPattern {
 public static void main(String[] args) {

        int a=5,b,c;

        for(b=1;b<=a;b++){

            for(c=1;c<=b;c++){
                System.out.print(" ");

                for(c=b;c<=a;c++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }



    }
     
}
