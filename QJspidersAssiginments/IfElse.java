class IfElse{
    static void ifElse(){
        //02/12/2021
        // write a programm to given char is digit, alphabet or special char?
        // ladder else if statment 
        int a = 9;
        if((a>='a')&&(a<='z')){
            System.out.println("\n"+a+ " : it is the alphabet \n");
        }
        else if((a>=0) && (a<=9)){
            System.out.println("\n"+a+ " : it is the number \n");
        }
        else{
            System.out.println("\n" +a+ " : it is the special char \n");
        }
    }


    void newIfElse(){
        //02/12/2021
        /* write a programm to 3 & 4 divisible into a number  then print "GOOD MORNING" print "GOOD AFTERNOON" if 
        a number is divisible by 3,  print "GOOD EVENING" if numet is fivisible by ony 4, other wise print "GOOD NIGHT" */
        // soulution is ===>
        int a = 10;
        if((a%3==0)&&(a%4==0)){
            System.out.println("\n" + a+ " : GOOD MORNING! \n");
        }
        else if(a%3==0){
            System.out.println("\n" +a+ " : GOOD AFTERNOON !\n");
        }
        else if (a%4==0){
            System.out.println("\n" +a+ " : GOOD EVENING! \n");
        }
        else{
            System.out.println("\n" +a+ " : GOOD NIGHT! \n");
        }


    }


    void switchCase(){
        char lett = '#';
      if((lett>='a')&&(lett<='z')||(lett>='A')&&(lett<='Z')){
          switch(lett){
              case ('a'):
              case ('e'):
              case ('i'):
              case ('o'):
              case ('u'):
              case ('A'):
              case ('E'):
              case ('I'):
              case ('O'):
              case ('U'):
                System.out.println("\n" + lett + " : it is ovewl \n");
                break;
            
             default:{
                   System.out.println("\n" + lett + " : it is consonents ! \n");
                }
            }
        }  


        else if ((lett>=0) && (lett<=9)){
             System.out.println(lett+ " : this is the number ! \n");

        }

        else{
            System.out.println(lett+ " : this is the special char \n");
        }
           
    }


    public static void main(String[] yogi){

        // static method

        ifElse(); // static method invoke by using method name 

              /* Static methods are the methods in Java that can be called without creating an
             object of class. They are referenced by the class name itself or reference to the Object of that class. */
          
          // Instance method 
          /*methods which require an object of its class to be created before it 
          can be called. To invoke a instance method, we have to create an Object
         of the class in within which it defined.*/

        IfElse ladderElse = new IfElse();
        ladderElse.newIfElse();
        ladderElse.switchCase();
     
    }

}
