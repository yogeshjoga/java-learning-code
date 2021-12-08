public class Questions_08_12_2021{
    static void pattern1(){
        System.out.println("\n === this is the first pattern === \n");
        for ( int i=0; i<=5; i++){
            for( int j=0; j<=i; j++){
                System.out.print("*     ");
            }
            System.out.println("\n");

        }
    }

    static void pattern2(){
        System.out.println("=== this is the second pattern === \n");
        for(int i=0; i<=5; i++){
            for(int j=i; j<=5; j++){
                System.out.print("*    ");
            }
            System.out.println("\n");
        }
    }
    static void pattern3(){
        System.out.println("=== this is the third pattern === \n");
        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                if(i==4 && j==2) System.out.print("@    ");
                else System.out.print("*    ");
            }
            System.out.println(" \n");
        }
    }

    static void pattern4(){
        System.out.println("=== this is the fourth pattern === \n");
       // int b;
        for(int a=1; a<=5; a++){
            for(int b=a; b<=5; b++){
                System.out.print(" ");
                for(int c=1; c<=a; c++){
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        
    }

}


