class Question3{

    // Questions and solutions

    // 0 to 10 number print
    // a to z print
    // 10 to 0 print
    // z to a print
    // 1000 to 1050 print
    // A to Z with righ side a char
    // a to z with num 1
    // aA to zZ printing
    // LowerCase a to z, upperCase A to Z with number count of letters
    // 26 * printing


    static void num1To10(){
        int num =1;
        System.out.println("\n======This is the 1 to 10 print========= \n");
        while (num<=10){
            System.out.println(num);
            num++;
        }
    }

    static void aToz(){
        char ch = 'a';
        System.out.println("\n======This is the a to z print========= \n");
        while(ch<='z'){
            System.out.println(ch);
            ch++;
        }
    }

    static void num10To1(){
        int num =10;
        System.out.println("\n======This is the num 10 to 1 print========= \n");
        while(num>=1){
            System.out.println(num);
            num--;
        }
    }

    static void zToa(){
        char ch = 'z';
        System.out.println("\n======This is the z to a print========= \n");
        while(ch>='a'){
            System.out.println(ch);
            ch--;
        }
    }


    static void thusndTo50(){
        int num = 1000;
        System.out.println("\n======This is the 1000 to 1050 print========= \n");
        while(num<=1050){
            System.out.println(num);
            num++;
        }
    }


    static void aToZWithA(){
        char ch = 'A';
        System.out.println("\n======This is the aToZ print========= \n");
        while(ch<='Z'){
            System.out.println(ch+"a");
            ch++;
        }
    }


    static void aToZWith1(){
        char ch = 'a';
        System.out.println("\n======This is the aToZ1 print========= \n");
        while(ch<='z'){
            System.out.println(ch + "1");
            ch++;
        }
    }

    static void lowerUpper(){
        char ch ='A';
        char ch1 = 'a';
        System.out.println("\n======This is the lowerUpperCount print========= \n");
        while(ch<='Z'){
            while(ch1<='z'){  //nested loop
                System.out.println(ch + " " + ch1);
                ch++;
                ch1++;
            }
        }
    }

    // 2nd methond lower + upper alphabets printing

    static void lowerUpper1(){
        char ch = 'a';
        System.out.println("\n======This is the lowerUpper1 print========= \n");
        while(ch<='z'){
            System.out.println((char)(ch-32)+ " " + ch);
            ch++;
        }
    }

    static void lowerUpperCount(){
        char ch ='a';
        int num = 1;
        System.out.println("\n======This is the lowerUpperCount print========= \n");
        while(ch<='a'){
            System.out.println((char)(ch-32)+ " " + num + ch);
            ch++;
            num++;
        }
    }

    // 2nd mothod to print lowerUpperCount
    static void lowerUpperCount1(){
        char ch = 'a';
        char ch1 = 'A';
        int num = 1;
        System.out.println("\n======This is the lowerUpperCount2 print========= \n");
        while(ch<='z'){
            while(ch1<='Z'){
                while(num<=26){
                    System.out.println(ch+ " " + ch1 + " " + num);
                    ch++;
                    ch1++;
                    num++;
                }
            }
        }
    }


    static void star(){
        int num =1;
        System.out.println("\n======This is the star print========= \n");
        while(num<=26){
            System.out.println('*');
            num++;
        }
    }
  


    public static void main(String[] yogi){
        // methods calling or invoking
        num1To10(); // ==> 1
        aToz();     // ===> 2
        num10To1(); // ===> 3
        zToa();     // ===> 4
        thusndTo50(); // ===> 5
        aToZWithA(); // ====> 6
        aToZWith1(); // ====> 7
        lowerUpper(); // ====> 8
        lowerUpper1(); // ===> 9
        lowerUpperCount(); // ===> 10
        lowerUpperCount1(); // ===> 11
        star(); // =============> 12
        // completed ho noooo!


    }

}