# LOOPS
There are 4 types of loops in java
   1) while Loop
   2) do-while Loop
   3) for Loop
   4) for-each loop


## while Loop
   The while loop runs many number of times based upon the condition output

```java
    Syntax
        while(condition){
        (Statment)
        }

    Example
        int i = 1;
        while(i<=100){
            System.out.println(i);
            i++;
        }
        //Questions and answers in qjspider dir
```
## for loop
 
  ```java

        Syntax
             for(int i=0; i<=10; i++){
                 System.out.println(i);
             }





public class Questions_07_12_2021{


    static void sqr3_3(){
        System.out.println();
        System.out.println("========= WELCOME TO PATTERNS =========");
        System.out.println();
        System.out.println("==== fist question ==== \n");
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
    


     public static void main(String[] args) {
        sqr3_3();
        second2();
        th3rd();
        fourth4();
        fifth5();
        sixth6();
    }
}
  ```




  

<br>

<br>

<p align="center">Made with ❤️ By <a href="https://www.google.com/search?q=yogesh+joga&oq=yogesh+joga&aqs=chrome.0.69i59j0i512j0i10i22i30j69i60l3j69i65.2825j0j7&sourceid=chrome&ie=UTF-8">YOGESH JOGA</a></p>
<p align="center" style="font-size: 8px">Learning<b> &#x1F49D; JAVA &#x1F49D; </b> Starting Day 21/11/2021</p>

## Social meda

[Instagram]( https://www.instagram.com/_yogi_joga/ ) &#x1F4F7;

[Facebook]( https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2Fprofile.php%3Fid%3D100014890958322 ) &#x1F4D6;

[Whatsapp]( https://chatwith.io/s/617ab3d1a9ef6 ) &#x1F4DE; 


<p align="center" style="font-size: 8px"></p>

   
<img src="https://github.com/yogeshjoga/c-learning-30-days/blob/master/my_photo_git.jpg">