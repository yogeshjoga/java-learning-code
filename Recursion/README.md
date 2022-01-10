# Recursion
   The process of performance same operation again and again is knwon as RECURSION.
   A method calling itself agai and again to perform the operationis known as Recursive method calling recurion.
   A condition whre stops creation of intilization number of frams created during the Rescrsive method call is known as base case condition.


### Write a programm to find the factroial of number using Recursion.
```java
// RECURSION method using
// its create frams going on  
import java.util.Scanner;
public class Fact {
    static int fact(int num){
        if(num==0){ return 1;}
        else{return (num*fact(num-1));}   // it is the again again frames created 
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to find the fact by using the recursion....");
        Scanner numB =new Scanner(System.in);
        int num1 = numB.nextInt();
        long factNUm = fact(num1);
        System.out.println(num1+" : factroial is : "+factNUm);
        numB.close();
    }
    
}

```

### Write a program to find fibnocci series upto 100 usign Recursion.