public class Questions_07_12_2021{


    static void sqr3_3(){
        System.out.println();
        System.out.println("========= WELCOME TO PATTERNS =========");
        System.out.println();
        System.out.println("==== first question ==== \n");
        for(int a=1; a<=3; a++){ //outer for loop 
            for(int b=1; b<=3; b++){   // inner for loop or nested loop
                System.out.print("$    "); // inner for loop statment 
            }
            System.out.println(" ");  // outer for loop statment for printing spaces 
            System.out.println(); // this is for new line to go courser
        }
    }


    static void second2(){
        System.out.println("==== second answer ==== \n");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5;j++){
                if(i==3 && j==3){
                    System.out.print("@  ");
                }
                else{
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
     System.out.println();
    }



    static void th3rd(){
        System.out.println("==== third answer ==== \n");
        for(int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(a==1 && b==1){
                    System.out.print("#  ");
                }
                else if (a==1 && b==5){
                    System.out.print("@  ");
                }
                else if( a==5 && b==1){
                    System.out.print("~  ");
                }
                else if( a==5 && b==5){
                    System.out.print("$  ");
                }
                else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }

    static void fourth42(){
        System.out.println("==== fourth2 answer ==== \n");
        for(int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(a==1 || a==5 || b==1 || b==5){
                    System.out.print("*   ");
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println("\n");
        }

    }



    static void fourth4(){
        System.out.println();
        System.out.println("==== fourth answer ==== \n");
        for(int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(a==2 && b==2 || a==2 && b==3 || a==2 && b==4){
                    System.out.print("   ");
                }
              else if(a==3 && b==2 || a==3 && b==3 || a==3 && b==4){
                  System.out.print("   ");
               }
              else if(a==4 && b==2 || a==4 && b==3 || a==4 && b==4){
                System.out.print("   ");
                }
             else {
                System.out.print("*  ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    static void fifth52(){
        System.out.println("==== fifth2 answer ==== \n");
        for (int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(a==b){
                    System.out.print("*   ");
                }
                else{
                        System.out.print("    ");
                    }
                
            }
            System.out.println("\n");
        }
    }





    static void fifth5(){
        System.out.println("==== fifth answer ==== \n");
        for(int a=1; a<=5; a++){
            for (int b=1; b<=5; b++){
                if(a==1 && b==1 || a==2 && b==2 || a==3 && b==3 || a==4 && b==4 || a==5 && b==5){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
          System.out.println();
        }
    }


    static void sixth6(){
        System.out.println("==== sixth answer ==== \n");
        for(int a=1; a<=5; a++){
            for (int b=1; b<=5; b++){
                if(a==1 && b==1 || a==1 && b==5 || a==2 && b==4 || a==2 && b==2 || a==3 && b==3 || a==4 && b==2 || a==4 && b==4 ||  a==5 && b==1 ||a==5 && b==5){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
          System.out.println();
        }
    }
        

    static void pattern1(){
        System.out.println("\n ==== Right angle triangle pattern ==== \n");
        for(int a=1;a<=6; a++){
            for(int b=1;b<=a; b++){
            System.out.print("*  ");
             }
           System.out.println();
        }
        System.out.println();
    }
    
    static void pattern2(){
        for(int a=1;a<=6;a++){
            for(int b=a;b<=6;b++){
                System.out.print("h  ");
            }
            System.out.println();
        }
    }

    static void ifnumbers(){
        int a=1;
       // int b=10;
        if (a==1){
            a++;
            System.out.println('a'); 
        }
    }
     public static void main(String[] args) {
        sqr3_3();
        second2();
        th3rd();
        fourth4();
        fourth42();
        fifth5();
        fifth52();
        sixth6();
        pattern1();
        pattern2();
 
    }
}



