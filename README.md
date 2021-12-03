
# &#x1F618; Learn JAVA language  &#x1F4BB;
 This is for complete beginners and non-it background peoples only.
 why because im a MECHANICAL ENGINEER &#x1F602;



```java

	┌────────────────────────────────────────────────────────────┐
	│             java int a =10; /* welcome to JAVA   */        │
	│▄▄▄    ▄▄▄                                         ▄▄       │
	│ ██▄  ▄██                                          ██       │
	│  ██▄▄██    ▄████▄    ▄███▄██   ▄████▄   ▄▄█████▄  ██▄████▄ │
	│   ▀██▀    ██▀  ▀██  ██▀  ▀██  ██▄▄▄▄██  ██▄▄▄▄ ▀  ██▀   ██ │
	│    ██     ██    ██  ██    ██  ██▀▀▀▀▀▀   ▀▀▀▀██▄  ██    ██ │
	│    ██     ▀██▄▄██▀  ▀██▄▄███  ▀██▄▄▄▄█  █▄▄▄▄▄██  ██    ██ │
	│    ▀▀       ▀▀▀▀     ▄▀▀▀ ██    ▀▀▀▀▀    ▀▀▀▀▀▀   ▀▀    ▀▀ │
	│                      ▀████▀▀                               │
	│                                                            │
	└────────────────────────────────────────────────────────────┘
```

 My self i am [__JOGA YOGESH__](https://www.google.com/search?q=yogesh+joga&oq=yogesh+joga&aqs=chrome.0.69i59j0i512j0i10i22i30l2j69i61j69i60l2.3277j0j7&sourceid=chrome&ie=UTF-8) &#x1F60D;



# Intro of software &#x1F4BB; 
	Type's of softwares
	   1 Applicaton Software
	   2 Operating Software_


# Image Mind-map &#x1F47B;

<br>

<img src="https://github.com/yogeshjoga/java-learning-code/blob/master/notes/Software1.jpg">


# JAVA INTRO  &#x1F47B;
	WHY JAVA, SEE THE BELOW MIND-MAP

<img src="https://github.com/yogeshjoga/java-learning-code/blob/master/notes/JAVA.jpg">

# The elements of the java programming is known as TOKENS.
	There are four type of tokens in java programming language
	1 keywords
	2 Identifiers
	3 Literals
	4 Separtors

## Keywords :
         keywords mean predefined words it's started from lowercase letters.
		ex: class void public static.

## Identifiers:
	It is user defined keywords 
		ex:variables
     whenever we provided identifiers we should follow these rules and convenctions.
         
**Rules:**

		1 Not allow to use predefined keywords
		2 NOt allow to use as a starting character is numbers it's taken syntax error.
		3 Not allow to use as special characters either to use $ and _ dollar and underscore.


**Conventions:**

		These are the standard pratices follwed while providing the identifiers.

			1 The class name msut start with Uppercase letter, it contains multi words then 
			  each word must start with uppercase.

			  ex: SampleName,Demo,         

			2 the method name should be in lowercase, but it consisting of multiwords first word
			   is will be in lowercase and remaining words must start with uppercase letter's.

			 Ex: sampleName,demo

			3 class name is similar to the source file name 
				source file mean .java file


## Literals:
		 These are the actual facts or raw facts whic discribe the attributes of a particular type of 
		  the object.
		 Attributs are the common factes of the objects.

## seprators:
```java
		these are speical symbols (){}[]"':;,.
```


---------------------------------------------------------


#				DATA TYPES In JAVA

## There are two types of data types
> 1 primitive data type


> 2 Non-primitive data type

## primitive data type these are eight types and Non-primitive datatype:

```java
			Integers 
				1 Byte = 1 Byte
				2 Short = 2 Bytes
				3 Int = 4 Bytes
				4 Long = 8 Bytes
			Floating type
				5 float = 4 Bytes
				6 double = 8 Bytes
			Single char
				7 Char = 2 Bytes
			Booleans
				8 boolean = 1 Bit
				
   Non-primitive data type
			Strings
				Strings = not defined;
```


## Integers:

```java
	Byte = 1 byte
			-128 to +127 printing
          	int a = 120; // valid 
	 		int b = 140; // not valid compile time error
	
	short = 2 byts
			-32768 to +32767 printing
	 		int c = 23500; // It is valid 
	  		int d = 33000; // it is not valid compile time error
        
	int = 4 byts
			-2^32 to +2^31
			int e = 1237530349823048; // it is valid
			int f = 5^40; // it is the error compile time error

	long = 8 byts
			-2^64 to + 2^63
             long g = 133456789023456789L;// it is valid
			long h = 2^100; //it is not valid compile time error

   Single char 
			char = 2 byts
			char i = 'y'; // it is valid but must containg the single quots
			char j = 'yo'; // not valid  multi char's not allow to this data type

	

   Boolean  
			boolean = 1 bit memory
			boolean = true;
			boolean = false;

   Strings
			String = not defined in this data type
			String k = "yogesh"; // it is valid if without double quotes it's not valid
			String l = "1j#5% any thing it will accepted"; // but must containg the double quotes

```


# variables
	variables are used to store teh data to store the data we need follow the instructions.
		1 variable declaration
		2 variable initialization
variable declaration and initialization
## variable  declaration

```java
	datatype variableName
	ex: int a     // int (is the datatype) a (is the variable user defined keyword)
```

## variable initialization 
	variableName = 12; // variableName is a,  = (= it's mean assignment operator to assign 
	the value to variable) ; (semiclone is end of the statmeant)

  
```java
 ex: statment 
	int a; //variable  declaration 
	a=1243; // variable initialization
 

simple statment
		int a = 1234; // it is also valid statment 
  //statment is not enough content is importent


below screenshot input/output memory allocation process is explained 


As same integer 
		char q='y';
		String d="yogesh";
```

# Classifications fo variables
	We have two classifications of variables
		1 Based on datatype
		2 Based on visibility/ Scope
    Based on datatype
	    primitive Variables
	    Non-primitive Varibles
    Based on Scope
	    Global Varibles
	    Local Varibles

## primitive Variables
	Any variable the primitive datatype is known as primitive variable.
```java
		ex: int a = 10; // a is the primitive variable
```
## Non-primitive Variable
	Any variable the non-premitve datatype is known  as non primitive variable.
```java
	 ex: 
	 String b = "yogesh"; // b is the Non-primitive variable.
```

	Global Variables
		It's contain the outside of the methods is called Global Variables
      

	Local Variables
		If the varible is declear the inside the method is called local variables
           like for loop, while loop.

```java
 example :
  class yogesh{
	     static int a = 10;  //primitive Global variables 
	     static String b = "yogesh"; //Non-primitive Global variable

	public static void main(String[] yogi){
		int a =20; //primitive local variable
		String b = "billa"; // Non-primitive local variable
		System.out.print(a);
		System.out.print(b)
		}
	}

```

# ---------------ASCII VALUES----------------

ASCII
Updated: 17/11/2021 by Computer Hope

ASCII may refer to any of the following:

 Short for American Standard Code for Information Interexchange, ASCII is a standard that assigns 
 letters, numbers, and other characters in the 256 slots available in the 8-bit code. The ASCII decimal 
 (Dec) number is created from binary, which is the language of 
 all computers. As shown in the table below, the lowercase "h" character (Char) has a decimal value of 104, 
 which is "01101000" in binary.

ASCII was first developed and published in 1963 by the X3 committee, a part of the ASA 
(American Standards Association). The ASCII standard was first published as ASA X3.4-1963, 
with ten revisions of the standard being published between 1967 and 1986.

ASCII sections.
How do you pronounce ASCII?
Convert text into ASCII.
ASCII sections
The ASCII table is divided into three different sections.

Non-printable, system codes between 0 and 31.
Lower ASCII, between 32 and 127. This table originates from the older, American systems,
 which worked on 7-bit character tables.Higher ASCII, between 128 and 255. This portion 
 is programmable; characters are based on the language
 of your operating system or program you are using. Foreign letters are also placed in this section.
Standard or lower ASCII characters and codes.
Extended ASCII characters and codes.
Convert text into ASCII.
Standard or lower ASCII characters and codes


```java
Char	Dec	Binary	       Char	Dec	Binary	       Char	Dec	Binary

!	033	00100001	A	065	01000001	a	097	01100001
"	034	00100010	B	066	01000010	b	098	01100010
#	035	00100011	C	067	01000011	c	099	01100011
$	036	00100100	D	068	01000100	d	100	01100100
%	037	00100101	E	069	01000101	e	101	01100101
&	038	00100110	F	070	01000110	f	102	01100110
'	039	00100111	G	071	01000111	g	103	01100111
(	040	00101000	H	072	01001000	h	104	01101000
)	041	00101001	I	073	01001001	i	105	01101001
*	042	00101010	J	074	01001010	j	106	01101010
+	043	00101011	K	075	01001011	k	107	01101011
,	044	00101100	L	076	01001100	l	108	01101100
-	045	00101101	M	077	01001101	m	109	01101101
.	046	00101110	N	078	01001110	n	110	01101110
/	047	00101111	O	079	01001111	o	111	01101111
0	048	00110000	P	080	01010000	p	112	01110000
1	049	00110001	Q	081	01010001	q	113	01110001
2	050	00110010	R	082	01010010	r	114	01110010
3	051	00110011	S	083	01010011	s	115	01110011
4	052	00110100	T	084	01010100	t	116	01110100
5	053	00110101	U	085	01010101	u	117	01110101
6	054	00110110	V	086	01010110	v	118	01110110
7	055	00110111	W	087	01010111	w	119	01110111
8	056	00111000	X	088	01011000	x	120	01111000
9	057	00111001	Y	089	01011001	y	121	01111001
:	058	00111010	Z	090	01011010	z	122	01111010
;	059	00111011	[	091	01011011	{	123	01111011
<	060	00111100	\	092	01011100	|	124	01111100
=	061	00111101	]	093	01011101	}	125	01111101
>	062	00111110	^	094	01011110	~	126	01111110
?	063	00111111	_	095	01011111	_	127	01111111
@	064	01000000	`	096	01100000	 	


```





--------------------------------------------------------------------------------------------



Installation of jdk (in JDK contains jre jvm jit)
   www.oraclejava.com/downloads/jdk-2.6
 go to the link and download the latest version of jdk installer
  Double click it and run the file accept the terms and conditions
after next next done

open the c:programes/java-jdk/select bin file location path
 copy it

 set path go to the run (windows key + r) type the variable enviromental hit enter
open new tab containing the variable goto the advance and add the path 
select the new path and past the java jdk bin path 




check the java is perfectly installed or not
  go to the cmd and type the  java -version it will show 
 

the name of screen is cmd, console,

console courser is started from left side end point or starting point
if want go you can print some thing

```java

System.out.print("yogesh");   //it is valid 
System.out.print();    // it is not valid syntax

the second statement is not valid why because if you pass the print statment you must given to value
output given the blow screenshot

System.out.println(); // it is valid why because it's print new fresh line that's why
 
The output given the below screenshot
```
 

-------------------------------------------------


#		CMD TRICKS
```java

GOTO RUN by using ==  windows key + r 
Type the CMD and hit enter
the default location is C:users/yogesh/desktop: 
if you make folder command is mkdir NameOfTheFolder  like mkdir yogesh
if you want to go yogesh folder command is cd yogesh
thats it 

To excute the java programming
   create source file 
		by using for beginners notepad, notepad++, editplus
               for intermedite learners IDE's integrated developement enivormental
To complie
	source file sent to ==> compiler  ===> javac SourceFile.java ===> return the .class file ===> 
	sent jvm interpeter ====> it converted into binary language ===> result your instructions what you written.

```

# RULES FOR LOCAL VARIABLES

  1 When we use varibales the value will be used in the program.

  2 we need for declar and initilazaion a variable before we are them.

  3 two or more variables cannot be declare with the same name.

  4 once we declar the variable we can reinitialization the variable number of times.


```java

	double d = 250.999;
	d = 23898.0000; //reinitialization
	d = 34567.56789; //again reinitialization
	string d= "yogesh"; // it is compile time error why because already variable is decleard 
	// reinitialization is n no.of times
	// redeclaration is not possible



  ex code:
	public class D3mo{
		public static void main (String[] yogi){
			double d = 2345.6789; // valid statment
			double d = 456789.67890; //invalid statment
			d= 2345678.56789; // valid it is the reinitialization
			d=34567754.5785; // valid it is the reinitialization
			System.out.println(d);
		}
	}

  =====output== is == 34567754.5785 == latest update r latest reinitialization====

```



#					Intro of the Type casting

 The Type castings are two types 
	primitive type casting is deals with data converting datatype value to another datatype

 		1 Implecit auto-widining.
		2 Explcit narrowing.

	
	Implecit auto-widining
		byte ==> Short === (char) ===> int ===> long ===> float ===> double
			below pic see

       Explcit narrowing
		double ==> float ==> long ===> int ===> int ===> char ===> short ===> byte


	   auto widining
```java
	ex: 
	    int i = 10.00;
	    int is a datatype   i is variable   10.00 double value

		automatical take the casting type smaller datatype value to bigger datatype value converting 
		 is called Implecit auto-widining
 		ex:
			int i = (int) 10.000; //it is valid 
			output: 10 //we lost the values

			int j = 10.009; //it is also valid but we are not given the type cast
			output: 10 //we lost the values
Explcit narrowing
		
      ex: 
	    int i = 10.00;
	    int is a datatype   i is variable   10.00 double value

		it is not taken automatically the casting type bigger datatype value to smaller datatype 
		value converting is called Explcit-narrowing.

 		ex:
			int i = (int) 10.000; //it is valid 
				output: 10 // we lost the values
			int j = 10.009;   //it is the complie time error! we must add the type casting 
				output: error!

```


# OPERATORS 
	operators are used to perform opeartions and we have many operators in JAVA such as 
	  1 Arithmetic Operator
	  	 + - * / %
	Pluse (+);
		pluse it as two behaviors 
					==> Addition
					==> Concatnation
			Pluse behaviors like concatnation only if any one of oparant is String
			and the output of the concatnation is always the String

```java
	Example 
		//pluse + oprator
		class Oprator{
			public static void main(String[] yogi){
				int a = 1+2; //output is 3
				int b = 2+2.0; //auto widining
				System.out.println(a);
				System.out.println(b);
				//concatnation
				System.out.println(2+4+"bikes"+34); //output is  2+4=6;, 6+bikes=6bikes;,  6bikes+34 = 6bikes34;

			}
		}

```

# Aadhar card deatils printing in java institute task
```java
		class AadharCard{
			public static void main(String[] yogi){
				String nameOfTheAccountHolder = "JOGA YOGESH";
				String fatherName = "JOGA PAPARAO";
				String dateOfBirth = "May-06-1998";
				long phoneNumber = 9110566354l;
				long aadharNumber = 15242698822365l;
				String addrs = "Palasa/kasibugga/pundi";
				int postalCode = 532218;

				System.out.println();
  			  	System.out.println("=============Aadhar Card===========");
   				System.out.println();
   				System.out.println("Name of the card holder is : " +nameOfTheAccountHolder);
  				System.out.println("Father name is : " +fatherName);
  				System.out.println("Date of birth is : "+dateOfBirth);
  				System.out.println("Phone number is : "+phoneNumber);
  				System.out.println("Aadhar number is : "+aadharNumber);
  				System.out.println("Addrs is : "+addrs);
  				System.out.println("Postal code is : "+postalCode);
  				System.out.println();
  				System.out.println("Thankyou bye bye!");
   				System.out.println();
			}
		}

	Output of the aadhar task:	
=============Aadhar Card===========

Name of the card holder is : JOGA YOGESH
Father name is : JOGA PAPRAO
Date of birth is : May-06-1998
Phone number is : 9110566354
Aadhar number is : 15242698822365
Addrs is : Palasa/kasibugga/pundi
Postal code is : 532218

Thankyou bye bye!

```

## Comparison Operators

```java
 The output is boolean values

  == Is equal to 

  > Grather then

  >= Grather then is equal to

  < Lessthen 

  <= Lessthen is equal to 

  != Not equal to 

  EXamples 
			5==5; // true
			5==6; // Is false

			5>3; //Is true 5 is bigger then the 3
			5>7; //Is false 5 is less then the 7

			5>=4;//true it mean gratherthan or equlto
			5>=9; //false 

			5<9; //true
			5<2; //false

			5<=6;// true
			5<=2;//false

			5!=2; // true
			5!=5; //false


```
## Assignment Operators
```java
		(=, +=, -=, *=, /=, %=)
		 Assigning the oparands to variables
		 
		 Examples
		 		int a = 10; // a is variable and = is the assign the value of 10
				 //these are written into types
				 
				 //1st type is
				 a = a+20; // now a is containing the value is 10, + 20 = 30; //a containing 10 is deleted and update to 30
				 //2nd type is 
				 a+=20; //same a containing the 10, it update to add 10+20=30;


				 a=a-10; //a is 30 -10 =20
				 a-=10; //same answer

				 a=a*2; //40
				 a*=2; 

				 a=a/2; //20
				 a/=2;

				 a%=2; //0

```
## Java Conditional Operators

```java

	java conditional operator syntax is 
			oparand1? operand2:operand3;
		example 	(a%b==0)?"Even Number" : "Odd Number";


	//1st question : Write a program to print wheter the given number is even or odd 17.
	//2nd question : Write a program to check the given number is divisable into 3 and if its then print good morining orther wise good night.
	//3rd question : Write a program to chek the largest of given two numbers and print which is largest.
	//4th question : Write a proagam to check the largest value of the 3 given values by using conditonal operator only.

	class Questions{

    	static int a=2;
    	static int b=8;
    	static int c=3;
    	static int d=100;
    	static String out1st;
    	static String out2nd;
    	static String out3rd;
    	static String out4th;

    static void conditionalOperators(){
        //1st question
        System.out.println();
        out1st = (a%b==0)?"Even Number" : "Odd Number"; // Conditional operator statment 
        System.out.println("It is Even or Odd = " +out1st); // 1st answer is done
        System.out.println();

        //2nd question
        out2nd = (c%b==0)? "Good Morning":"Good Night";  // Conditional opertor statment
        System.out.println("It is divisable into 3 = " +out2nd); //2nd answer is done
        System.out.println();
        
        //3rd question
        out3rd = (a<d)? "D(100) is the bigger!" : "a is the Bigger!";
        System.out.println("Which is the Bigger value =  " +out3rd);
        System.out.println();

        //4th question
		
        
        int large = (a>b)? a: b;
        String bigger = (large<d)? d +" is larger": large+ " is larger";
        System.out.println(bigger);
        System.out.println();


        //4th answer is in 2nd type we will write
        int largerValue = (a>b)? ((a>d)? a:d): ((b>d)? b :d);
        System.out.println("the larger value is : "+largerValue);

        

   		 }

  		  public static void main(String[] yogi){
     		   conditionalOperators();
   		 }

	}

```

# How to convert the INT to ASCII to Binary Code Values

```java
		// int to ASCII printing in java 


		public class IntToAscii {
    public static void main(String[] args){

       for(int i=0;i<=256;i++){
           // System.out.println((char)i);
           System.out.println( i + " integer value ==> ASCII Value " + (char)i);  
			// the int i value is casted into char.
			// char is internally taken as a integer values.
			// that integers values known as a ASCII Values.
        }
    }
 }


out put is like in your console

0 integer value ==> ASCII Value 
1 integer value ==> ASCII Value ☺
2 integer value ==> ASCII Value ☻
3 integer value ==> ASCII Value ♥
4 integer value ==> ASCII Value ♦
5 integer value ==> ASCII Value ♣
6 integer value ==> ASCII Value ♠
7 integer value ==> ASCII Value
8 integer value ==> ASCII Value
9 integer value ==> ASCII Value
10 integer value ==> ASCII Value
---------------------------------
65 integer value ==> ASCII Value A
66 integer value ==> ASCII Value B
67 integer value ==> ASCII Value C
---------------------------------
86 integer value ==> ASCII Value V
87 integer value ==> ASCII Value W
88 integer value ==> ASCII Value X
89 integer value ==> ASCII Value Y
90 integer value ==> ASCII Value Z

----------------------------------

upto 256 printed


```

## ASCII to Binary Code 

```java
		TYPE ONE IS TO CONVERT THE INTERGER VALUE TO BINARY CODE
		Using the LCM method 

		2|8----------------1
		 |___________
		2|4 ----------------0
		 |________                   this is the 1000 is the binary code conversion 
		2|2  ---------------0
		 |____________
		 |0 ----------------0
		 
			Bit wise calculate 
			starting the 2 power 0 to start 

			0    0   0     1     0   0    0 ====> value is 8

			2^6, 2^5, 2^4, 2^3, 2^2, 2^1, 2^0
			64   32   16    8    4    2    1




		It is the the 8-bit code 0001000

		
		 | 128 | 64 | 32 | 16 | 8 | 4 | 2 | 1 | =====> Bits 
		 |_____|____|____|____|___|___|___|___|
		 |     |  1 |  1 |  0 | 0 | 0 | 0 | 1 | =======> 97 Integer Value Is Vonverted Into Binary Code (a);
		 |_____|____|____|____|___|___|___|___|
		 |     |  1 |  0 |  0 | 0 | 0 | 0 | 1 | =======> 65 Integer Value Is Vonverted Into Binary Code (A);
		 |_____|____|____|____|___|___|___|___|

		
		97 is converted into a Binary Code:

				64 + 32 + 1 = 97; 
				Which how many numbers is adding till the end of we reach the 97 result:
				 we taken 64, in 64 place we will put 1
				 we taken 32, in 32 place we will put 1
				 we are not teken 16 so put 0
				 we are not teken 8 so put 0
				 we are not teken 4 so put 0
				 we are not teken 2 so put 0
				 we taken 1, in 1 place we will put 1

				 see the 97 Binary Code above the table 


```
# Bit Wise Operator
   
   This operators to used as a Pesudo codes
   and bacend of computer performance.
  
  There are some Types of BitWise Opertors 

  1 BitWise AND Operator.

  2 BitWise OR Operator.

  3 BitWise XOR Operator.

  4 BitWise LEFT-SHIFT Operator.

  5 BitWise RIGHT-SHIFR Operator.


  > BitWise AND Operator  ( & )
```java
	  Condition 1       Condition 2                         OutPut 

	  True  1    		False 	1			False 0

	  False	0		True	1			False 0

	  False	0		False	0			False 0

	  True	1		True	1			True  1   =====> only both conditions are true it's true.
```

  > BitWise OR Operator  ( | )
```java
     
	Condition 1           Condition 2       	       OutPut 

	  True    1  		False 	0			True   1

	  False	  0		True	1			True   1

	  False	  0		False	0			False  0  ===> only both contitions are false is false.

	  True	  1		True	1			True   1
```

 > BitWise XOR Operator  ( ^ )

```java
	  Condition 1       Condition 2                        OutPut 

	  True  1     		False   0			True  1

	  False	0		True	1			True  1

	  False	0		False	0			False 0    ===> both fals or true it's taken false

	  True	1		True	1			False 0

```

> BitWise LEFT-SHIFT Operator
```java
		It is the operation, we can perform
		for example:
		  		int a = 2;
				int b = 4;
				a<<b; //operation is bind the computer 
				// 2*2^4 = 10 is output 


```



> BitWise RIGHT-SHIFR Operator
	
```java
		It is the operation, we can perform
		for example:
		  		int a = 2;
				int b = 4;
				a<<b; //operation is bind the computer 
				// 2/2^4 = 4 quotient is output 


```

# Logical Operators

 Logical Operators are used mainly to verify the conditions so that later we can perform the operations.

	There are the 3 types of Logical Operators
	  
	   1 Logical AND ( && )
	   2 Logical OR ( || )
	   3 Logical NOT ( ! )

> Logical AND ( && )

       Logical AND ( && ) is used to check for the multiple conditions to be satisfied or to be True.
	   The behaviour of AND opertator can be obatined by it's TURTH TABLE.

```java

	Condition    (&&)		Condition           OutPut 

	  True      			False 				False 

	  False				True				False 

	  False				False				False 

	  True				True				True     =====> only both conditions are true it's true.

	  example:
	  		(a<=199)&&(b<=200)&&(c<=300); ==>condtions, if one condition is fail total statment not executed


```

> Logical OR ( || )

       Logical OR ( || ) operator it is use to check fo rany one of the conditionis satisfied or not 
	   based upon the output of the condition to perform opertaion later.

	   The behaviour of AND opertator can be obatined by it's TURTH TABLE.

```java

	Condition ( || )	   Condition                           OutPut 

	  True      			False 				True

	  False				True				True

	  False				False				False     ===> if all statment is false it not excuted

	  True				True				True    

	      example:
	  		    (a<=199)||(b<=200)||(c<=300); ==>condtions, if ALL condition is fail total statment not executed


```

 > Logical NOT ( ! )

 ```java

       Condition           Output

	   !True             False

	   !False            True

	   // ! not    not True  mean false
```

# INCREMETN AND DECREMENT OPERATORS
 > There are two types of operators
     1 Post 

	 2 pre
```java
    post 
	 	 a++; // this is the post oparator
		++a; // this is the pre oparator
		  // these two sis the increment oparators
		--a; // this is the post oparator
		a--; // this is the pre oparator
		// these are the decrement oparators 
		example: code 
		      

```


# Class assignment 


```java
	Date 01/12/2021; 

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
        //write a programm to print multiplication by using  loops?
        int a=2;
           for(int b=0;b<=10;b++){

            //this is the another statment in java print statments 
             //  System.out.printf("%d * %d = %d \n", a, b , a*b);
              System.out.println(a + "*" + b + "=" + (a*b));
           }
        
    }



    public static void main(String[] args){
        answers();
        answers2();
        answers3();
        answers4();
        answers5();
        answers6();
        answers7();
        

    }
}


OUTPUT

	Your are the elegible to the interview


	8 : This is the even number**


	e : it is the vowel char


	h : it is the lowercase letter!


	1 : This the digit contains!

	2*0=0
	2*2=4
	2*3=6
	2*4=8
	2*5=10
	2*6=12
	2*7=14
	2*8=16
	2*9=18
	2*10=20

```

  
# if else LADER
	
	if else ladder we choose if else ladder when we need to 
	perform any one set fo opertaion many set's of opertation based 
	upon different conditons for each operations.

```java
		03/12/2021:
	Syntax of the if else ladder
	   if block
	   else if block
	   else block not mandatory

			//if else condtion
			// minimum output is 0
			// maximum output is 1
			// write a number if-else blocks 
			// else is not mandatory
			// if ( condition passing)
			// if-else (condition passing)
			// else ( there is no codtiton to write in else block )
			// the if if-else else blocks and syntax is below down


 Example is :
			
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

			       
```

# SWITCH CASE OPERATIONS 
    
	Switch is the performs the equations check between outpart of the expression
	and the case values

	according to syntax output of the expression should not be boolean float or double

	in switch if expression output is similar to any one of the case values then 
	along with the case block all the below the block can excuted

	swith beahave like if-else ladder only if we use brake statment with in the case block

	breake is JVM control to transfer out of the swictch block
	
	if we write any statment after the breake is then it result in 
	unreachable statment compile time error.

```java
		Example is the above code
		see it

```
   


# LOOPS









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
