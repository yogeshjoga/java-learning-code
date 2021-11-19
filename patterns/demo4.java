public class demo4{
   //method or function starting to create the square pattern
    public static void square(){
        int c=6; //local variables
     //square stare shape in star pattern printing
       for(int a=0;a<c;a++){
          for(int b=0;b<c;b++){    // a=1 a<=c or a=0 a<c anything it will print values
             System.out.print("@  ");
             }
             for(int d=0;d<c;d++){ //printing horizontal spaces
                 System.out.print(" ");
             }
          System.out.println();
        }
    
    }
                  // 2nd method or function starting to create the Right triangle pattern
    public static void incTriangle(){
        int c=6; // local variables
        for(int a=1;a<=c;a++){
            for(int b=1;b<=a;b++){
               System.out.print("@  ");
              }
            System.out.println();
          }
      
    }

    public static void rightTriangle(){
        int c=6; // local variables
        for(int a=1;a<=c;a++){
            for(int b=a;b<=c;b++){
               System.out.print("@  ");
              }
              for(int b=1; b<=a; b++){
                  System.out.print("  $");
              }
            System.out.println();
          }
      
    }
    


    public static void main(String[] args){
        System.out.println();
        System.out.println("============square symbol================");
        square();
        System.out.println();
        System.out.println("============Left Triangle================");
        incTriangle();
        System.out.println();
        System.out.println("============Right Triangle===============");
        rightTriangle();
        System.out.println();
        System.out.println("=======The end of the programming=========");
    }
}