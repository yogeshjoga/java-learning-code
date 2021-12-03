class IfElse{
    static void ifElse(){
        //02/12/2021
        // write a programm to given char is digit, alphabet or special char?
        // ladder else if statment 
        int a = 9;
        if((a>='a')&&(a<='z')){
            System.out.println(a+ " : it is the alphabet");
        }
        else if((a>=0) && (a<=9)){
            System.out.println(a+ " : it is the number");
        }
        else{
            System.out.println(a+ " : it is the special char");
        }
    }


    void newIfElse(){
        //02/12/2021
        /* write a programm to 3 & 4 divisible into a number  then print "GOOD MORNING" print "GOOD AFTERNOON" if 
        a number is divisible by 3,  print "GOOD EVENING" if numet is fivisible by ony 4, other wise print "GOOD NIGHT" */
        // soulution is ===>
        int a = 10;
        if((a%3==0)&&(a%4==0)){
            System.out.println(a+ " : GOOD MORNING! ");
        }
        else if(a%3==0){
            System.out.println(a+ " : GOOD AFTERNOON ! ");
        }
        else if (a%4==0){
            System.out.println(a+ " : GOOD EVENING! ");
        }
        else{
            System.out.println(a+ " : GOOD NIGHT! ");
        }


    }


    public static void main(String[] yogi){
        ifElse();
        IfElse ladderElse = new IfElse();
      ladderElse.newIfElse();
     // System.out.println(ladderElse);
    }

}
