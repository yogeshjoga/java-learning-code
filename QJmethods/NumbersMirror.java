class NumbersMirror{

    //mirror the numbers and print line by line
    static int numMirror(int num){
        System.out.println("\n =========  Reverse order numbers  =============== \n ");
        int a;// b=0;
        System.out.println();
        while(num!=0){
            a=num%10;
            System.out.println(a);
            num=num/=10;

        }
        System.out.println();
        return num;
    }

    // mirror the numbers 
    static int numMirror2(int num){
        System.out.println("\n =========  Reverse numbers  =============== \n ");
        int a,b=0;
        while(num!=0){
            a=num%10;
            b=b*10+a;
            num=num/=10;
        }
      System.out.println(b+ " \n");
      return num;
    }

 // mirror and check the paldrome number or not 
    static long numMirror3(long num){
        System.out.println("\n =========  Paldrome numbers  =============== \n ");
        long a,b=0,c=num;
        while(num!=0){
            a=num%10;
            b=b*10+a;
            num=num/=10;
        }
        if(b==c){
            System.out.println(c +" ===> "+b+  " : it is a paldrome number \n");
        }
        else{
            System.out.println(c + " ===> "+b+ " : it is not paldrome number \n");
        }
      return num;
    }




    //fabnocci series
    static void fabNum(){
        System.out.println("\n ========= fabnocci series =============== \n ");
        int a=0,b=1,c;
        while(true){
            c=a+b;
            if(c<=1000){
            System.out.println("fabNum : "+c);
            }
            else{
                break;
            }
            a=b;
            b=c;
        }
        System.out.println("\n");
    }

    // prime numbers
    static int primeNumber(int num){
         int b=0;
         System.out.println("\n =========  Prime numbers  =============== \n ");
         for(int c=1; c<=num; c++){
                if (num%c==0){
                 b++;
                }
            }
        if(b==2){
          System.out.println("it is prime number " + num);
             }
         else{
          System.out.println("it is not a prime number " + num);
             
            }
        return num;
    }


    // range of prime numbers to create the programming
    static int primeNumbers(int a,int b ){
        int c=0;
        System.out.println("\n ========= Range of Prime numbers series =============== \n ");
        for(int d=a; d<=b; d++){
            for(int y=1;y<=a;y++){
                if(y%a==0){
                    c++;
                }

            }
            if(c==2){
                System.out.println("it a prime number : "+a );
            }
            else{
                System.out.println("it not a prime number : "+a );
            }
        }
        return a;
    }
   
    // Strong number checking 
    static int strongNumber(int num){
        int a;
        for(int y=1;y<=num; y++){
          a=y*num;
          

          System.out.println(a);
        }
       // System.out.println(a);
      return 0;
    }
    

    // demo fact 

    static void fact(){
        System.out.println("\n ========= factroial Number =============== \n ");
        int a=1,num=5;
        for(int i=1;i<=num; i++){
            a=a*i;
           // System.out.println(a);
        }
        System.out.println( num+" : factroial is : "+ a +"\n");
    }


    public static void main(String[] args) {
        numMirror(12345);
        numMirror2(564738);
        numMirror3(122221);
        primeNumber(23);
        primeNumbers(10 , 200);
        fabNum();
        strongNumber(5);
        fact();
    }
}


