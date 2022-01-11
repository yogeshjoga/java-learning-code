# methods
    Static method
    Instance method
    Method is a block of code when it called to excuted
    methods are ued to perform operations by writing the instructions
    whith in its a block, We can create any number of methods in jav afor each an 
    every operation in the app's

    Method consisting of two parts:
      1) Method declaration 
      2) Method implementation/Method context

```java
    Method Syntax 

     public static void main (String[] args){
         //statments
         // statments
     }


    Parts of method
       public it is the Access Specifiers
       static it is the Access Modifiers 
       void it is the Return Type
       Method calling Signature ( it contains the method name and Formal Arguments )
       After the Method name containing the () ====> in inner values is known as the Formal Args
       Sqare braces indicats the Array 
       We can Write any number of methods apart from the amin method to exctes other methods we need to call 
       those methods by using method Signature

       Method Signature Example Is :
           main(String[] args){
               // statmetns
           }

           myMethod(){
               //statments
           }



```


## Different wasys to create the methods
    => Method wtih formal args
    => formal agrs are the variable declaration in the methoddeclaration 
    => formal args are use to receive the inputs from method calling statment
    => formal args can be later reinitialization and they will be initialization very first time
       though method calling statment
    => the value will pass though the method calling statment to the method with formal args
       are known as the actual args

```java
      // creating the method 
      // a method is non-return type using 
      class faceBook{
          public static void login(String uN,String pWd){  // method declar
              uN="BournVita"; // userName initialization
              System.out.println("Login of the "+uN+"login succesfully........");
          }
          public staic void main(String[] args){ // Main method declar
              System.out.println("From the main Method statmetn......");
              login("Lits","Senorita"); // method calling statment
          }
      }

    // 2nd programm
    // faceBook2 
    class faceBook2{
          public static void login(String uN,String pWd){  // method declar
             
              System.out.println("Login of the "+uN+"login succesfully........");
          }
          public staic void main(String[] args){ // Main method declar
              System.out.println("From the main Method statmetn......");
              String uN="yogi"; // we are initilazing the values from main method and calling
                      // main method
              String pWd = "yogi@123";
              login(uN,pWd); // method calling statment
          }

    }


```
## Method by using Return Type
        A method can return the a value wtih the help of return keyword
        By keeping the return type which is the datatype of the output return
        we can print the method calling statment only if the return type of the method calling statment
    
```java
      class faceBook2{
          public static String login(String uN,String pWd){  // method declar
             // in place of void String 
             // void the keyword it's doesn't rturn values
              System.out.println("Login of the "+uN+"login succesfully........");
              return 0; //we must take the return values
          }
          public staic void main(String[] args){ // Main method declar
              System.out.println("From the main Method statmetn......");
              String uN="yogi"; // we are initilazing the values from main method and calling
                      // main method
              String pWd = "yogi@123";
              login(uN,pWd); // method calling statment
          }

    }

```

# CLASS members below see the mind mapping 





# Global Members    
        we have two types of global members
        1) Static global members
        2) Non-Static global members
    Static global members:
        => Any global members declar with a staic keyword are known as the static global member
        => All the static members are loaded into an area called class staic area by class loader
        => the advantags of class loader members is to use there through out the java progarmm
    Note:
        All the golbal variables are assiend with defautl values by the compiler the default values all are the 
        interger type varibles is assigned with  0
        float type varibles is assigned with 0.0
        char type is assigned with EMPTY CHAR
        boolean type is assigned with FALSE
        String type is assigned with NULL values


        There are mainly threee static members in java
        1) Static varibale / class variables
        2) Static initilizer block (SIB)
        3) Static Methods


# Variables and method calling statments and conventions 
```java
 -----------------------------------------------------------------------------------------------------------------
                                            static context                ||                  non-static context
                                                                          ||
static                                      (SIB / METHOD)                ||                  (IIB / METHOD)
Members                                     ClassName                     ||                      Direct
(varibles/methods)                          Direct                                              ClassName
                                            Object Reference                                    this Keyword


===================>


Nonstatic                               Object Refernce                                         Direct
Members                                                                                         this Keyword
(varibles/methods)

        
        Rules to calling static and Non static Members
        ==> In static context static Members we can access by using  ClassName only
        ==> In static context NonStatic Members can access by using Object Reference only
        ==> IN Non static context  static Members we can access by using ClassName only.
        ==> In Non static context  Non static Members we can access by using this Keyword only.
        
        All the Above the rules is the Java Conventions
```
## Differnt b/w the static and non static members

```java
            static Members                          |                        Non static Members
                                                    |
 ---------------------------------------------------|----------------------------------------------------
           Single copy                              |     Multi copys
           They are loaded during the loading       |     Loading process of the Object
                 processof a class.                 |
                                                    |
                                                    |
                                            
                                            

```
   