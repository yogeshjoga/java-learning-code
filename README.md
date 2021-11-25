# Intro of software
	Type's of softwares
	   1 Applicaton Software
	   2 Operating Software

# Image map

<img src="https://github.com/yogeshjoga/java-learning-code/blob/notes/Software1.jpgf">


# The elements of the java programming is known as TOKENS.
	There are four type of tokens in java programming language
	1 keywords
	2 Identifiers
	3 Literals
	4 Separtors

# Keywords :
         keywords mean predefined words it's started from lowercase letters.
		ex: class void public static.

# Identifiers:
	It is user defined keywords 
		ex:variables
     whenever we provided identifiers we should follow these rules and convenctions.
         
## Rules:
		1 Not allow to use predefined keywords
		2 NOt allow to use as a starting character is numbers it's taken syntax error.
		3 Not allow to use as special characters either to use $ and _ dollar and underscore.


## Conventions:
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


#				DATA TYPES OF THE JAVA

## There are two types of data types
	1 primitive data type
	2 Non-primitive data type

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

  1 When we use varibales the value will be used in the program
  2 we need for declar and initilazaion a variable before we are them
  3 two or more variables cannot be declare with the same name
  4 once we declare the variable we can reintilatize the variable number of times

```java

	double d = 250.999;
	d = 23898.0000; //Reinitilation
	d = 34567.56789; //again reintilation
	string d= "yogesh"; // it is compile time error why because already variable is decleard 
	// re intilation is n no.of times
	// re declaration is not possible



  ex code:
	public class D3mo{
		public static void main (String[] yogi){
			double d = 2345.6789; // valid statment
			double d = 456789.67890; //invalid statment
			d= 2345678.56789; // valid it is the reinsilation
			d=34567754.5785; // valid it is the reinstailiton
			System.out.println(d);
		}
	}

  =====output== is == 34567754.5785 == latest update r latest reinstation====

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

				





   


















<br>

<br>

<p align="center">Made with ❤️ By <a href="https://www.google.com/search?q=yogesh+joga&oq=yogesh+joga&aqs=chrome.0.69i59j0i512j0i10i22i30j69i60l3j69i65.2825j0j7&sourceid=chrome&ie=UTF-8">YOGESH JOGA</a></p>
<p align="center" style="font-size: 8px">CODE <b>C</b> Starting Day 21/11/2021</p>

## Social meda

[Instagram]( https://www.instagram.com/_yogi_joga/ )

[Facebook]( https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2Fprofile.php%3Fid%3D100014890958322 )

[Whatsapp]( https://chatwith.io/s/617ab3d1a9ef6 )

<p align="center" style="font-size: 8px"></p>

   
<img src="https://github.com/yogeshjoga/c-learning-30-days/blob/master/my_photo_git.jpg">
