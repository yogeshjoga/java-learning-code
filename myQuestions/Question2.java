public class Question2 {
    // write a programm to find the cube of given numbers by crating a method?
    // write a programm to create to print the prime numbers from given range of value from the main method?
    static int primeNumber(int a , int b){
        int c=0;
        for(int i=a; i<=b; i++){
            for(int j=1; j<=a;j++){
                if(a%j==0){
                    c++;
                }
            }
          if(c==2){
                System.out.println(a + " : it is the prime number");
            }
          else{
              System.out.println(a + " : it is the not a prime number");
            }
        }
        return 0;

    }







    static void primeNumber1(){

        int a=10, b=100, c=0;

        for(int i=a; i<=b; i++){

            for(int j=1; j<=a;j++){
                if(i%j==0){
                    c++;
                }
               if(c==2){
                    System.out.println(a+ " : it is the prime number");
                }
              else{
                  System.out.println(a +" : it is the not a prime number");
                  //  break;
                } 
            }
            
        }

    }

    public static void main(String[] args) {
       // System.out.println(primeNumber(10,100));
       primeNumber1();
    }
}
