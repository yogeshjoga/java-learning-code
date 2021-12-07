public class gopal {
    static void sum(){
        // sum of digits
        int a = 0;
        for(int b=1;b<=10;b++){
            a = a+b;
           //System.out.println(a);
        }
        System.out.println(a);
    }

    static void squars(){
        int a=0;
        for (int b=1;b<=10; b++){
            a=a+b*b;
        }
        System.out.println(a);
    }

    static void primeNumber(){

        int a,b=90,c=0;
        for(a=1;a<=b; a++){
            if(b%a==0){
                c++;
            }
        }
        if(c==2){
            System.out.println(b+ " : is the PRIME Number ");
        }
        else{
            System.out.println(b+ " : it is not a PRIME Number ");
        }
    }



    public static void main(String[] args) {
        sum();
        squars();
        primeNumber();
    }
    
    
}
