# REGULAR EXPRESSIONS
   ```JAVA
           ADVANTAGES
    It is used for validations
    pattern matching application 
        ex: like google search
    while desigining transalors in compilers
    digital circuts
    protocals TCP / IP / UDP

    import java.util.regex.*;
    // we can must import the regex package as expilcitly
    class RegexDemo{
        public static void main(String[] args){
            int count=0;
            Pattern p = Pattern.compile("ab");
            Matcher m = p.matcher("aabbaabababababffabababarbagafba");
            while(m.find()){
                count++;
                System.out.println(m.start()+"------"+m.end()+"-------"+m.group());
            }
        }
        System.out.println(count)
    }

    Pattern 
        compiled version of regular Expression.
        Equivalent java Object of regular experssion.
    Syntax
        public staic pattern compile(String req)

        Pattern p = Pattern.compil("ab");

      -----------------------------------


      Matcher
        we can use mathcer object to dmatch the given pattern in the target string
        we can create Matcher object by using matcher() method of pattern Class

    Syntax: 
        public Matcher mather (String target);

  // This keyword must and should i want to learn very very imp ******
    Importent matcher methods in pattern class
        1 boolean find()    
        2 int start()
        3 int end()
        4 String group()




    CHARACTER CLASS'S
    [ABC] -----> EITHER A OR B OR C
    [^ABC]------> EXCEPT A B AND C
    [a-z]---------> ANY LOWERCASE ALPHABETS
    [A-Z]--------> ANY UPPERCASE ALPABETS
    [a-zA-Z]------> ANY UPPER AND LOWERCASE ALPHABETS
    [0-9]--------> ANY DIGITS
    [^A-Z] -------> EXCEPT A TO Z 

    // RANGE VALUES ARE COUNTING AND TAKE ACTION OF THE 
    // GIVEN TO SOME CHARS IT WILL TAKE THAT ONLY LIKE ABCD THESE 4 CHAR'S ONLY MATCH CHECKING
    // CAP SYMOBL IS USED TO, EXCEPT THE VALUES FROM THESE
    // FOR EXAMPLE CODE WILL BE DEMONSTARATION
    Pattern p = Pattern.compil("x");
    Matcher m = p.matcher("a2@%jkdjfklj%866622"); // target
    while(m.find()){
        System.out.println(m.start()+"..."+m.group());
    }

    // inputs taken from 
      x=[abc] 
      x=[a-z]
      x=[0-9]


    Predefined Char Class
    \s -----------> space chars
    \S------------> except space chars
    \d-----------> any digit from [0-9]
    \D----------> except digit from [0-9]
    \w-----------> any word char [a-z A-Z 0-9]
    \W-----------> except word char [a-z A-Z 0-9]
    .----------> dot is the any char
    \. -----------> indicates the only . dot will find.




   Quantifiers
    // we must use the \\ double backward slashs why becoz  single \ slash is the meaning of the escape chars..
   we can use to specify no of occurrence to match 
   a------> exactly one a
   a+ --------> at least one a or more
   a* ---------> any of a including zero also
   a? ------------> atmost one a 

example is the 
  Pattern p = Pattern.compile("\\s");
  ["abaabaaab"]
  
  index number        x=a       x=a+      x=a*          x=a?
  -----------------------------------------------------------
     0                 a        a       a               a
     1                 
     2                 a        aa      aa              a
     3                 a                                a
     4
     5                 a        aaa     aaa             a
     6                 a                                a
     7                 a                                a
     8
     9

     // undrstand the table yogi and remeber it okay  index positions are the  ["abaabaaab"]  finding the places 
     // pattern matching

     Pattern class split class method ()


        Pattern p = Pattern.compile("\\s");
        String[] s = p.spilt("yogesh joga bike rider");
          for(String s1 : s){
            System.out.println(s);
          }
        System.out.println(s1);
        }

      Answers
        input \\s  // input as the taken spaces only so we can remove the spaces
         answer like
            yogesh
            joga
            bike
            rider
        if target is www.google.com
        input \\. // we can removing the at the place of . positions 
        answer is
            www
            google
            com // dot . are removed and taken to next ling y becoz we will take the println 


    String class spilt method is also work 


    String s = "yogesh joga bike rider";
    String [] s1 = s.fpilt();
    for(String s2:s1){
        System.out.println(s2);
    }
    // answers  \\s
    yogesh
    joga
    bike
    rider
        


 StringTokenizer
    Specialy desgned class for tokenization activity
     java util pack
     ex :
        StringTokenizer st = new  StringTokenizer("9-2-2022","-")  // date formate is the Target value and ifine is the Regular expression or pattern 


   ```