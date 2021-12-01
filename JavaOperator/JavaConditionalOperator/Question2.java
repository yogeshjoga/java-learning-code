public class Question2 {
    static void answers(){
        // question 1 is 
        // 1 To write the programming to eligible for Tech mahe company interview only if 10th and 12th percentage is above 60.0 and btech is 70.0;
        // start the answer=====>1st
        double tp = 65.9, twP=68.4, dP = 85.2;     // ((60.2),(68.3),(82.6));
        if((tp>=60)&&(twP>=60)&&(dP>=70)){
            System.out.println();
            System.out.println("Your are the elegible to the interview");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("Your are not elegible to the interview !!");
            System.out.println();
        }
    }

    static void answers2(){
        // write a programm wether the given number is even or odd number=====>2nd
        // this is the completed
        int a =8;
        if(a%2==0){
            System.out.println();
            System.out.println(a+ " : This is the even number**");
            System.out.println();

        }
        else{
            System.out.println();
            System.out.println(a+ " : This is the odd number** ");
            System.out.println();
        }
    }

    static void answers3(){
        // write a programm given char is vowel are consonent========> 3rd
        char a ='e';
        if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')){
            System.out.println();
            System.out.println(a+ " : it is the vowel char");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println(a+ " : It is a consonent char ");
            System.out.println();
        }
    }

    static void answers4(){
        //write the programm whether the given char is lowercase alphabet or not!  ====> 4
        char cha ='h';
        if((cha>='a')&&(cha<='z')){
            System.out.println();
            System.out.println(cha+" : it is the lowercase letter!");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println(cha+ " : It is the uppercase letter");
            System.out.println();
        }
    }

    static void answers5(){
        //Write a programm To check the UpperCase alphabets ===========> 5
        char cha = 'W';
        if ((cha>='A')&&(cha<='Z')){
            System.out.println();
            System.out.println(cha+ " : It is the Upper case letter!");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println(cha+ " : It is the lowerCase letter!");
            System.out.println();
        }
    }


    static void answers6(){
        //write a programm to check the given char is contins digit or not ==========> 6
        int a =1;
        if((a>=0)&&(a<=9)){
            System.out.println();
            System.out.println(a+ " : This the digit contains!");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println(a+ " : This the non digit");
            System.out.println();
        }
    }

    static void answers7(){
        //write a programm to print multiplication by using while loop?
        int a=2,b=10,c=a*b;
        b++;
           while(b>=10){
               System.out.pritnln()
           }
        
    }

    public static void main(String[] args){
        answers();
        answers2();
        answers3();
        answers4();
        answers5();
        answers6();
        

    }
}
