public class arrow {
 /* arrow pattern print 
     *
    **
   *************
  **************
   *************
    **
     *
 */


 
        // spilt into two parts of this pattern 1st  a
        // 1st one is the spaces decrement star printing b
        // 2nd increment star printing
        // 3rd 3 rows continous printing

   static void arrow2(){
        int star = 0, space = 4;
       for(int a=1; a<=7;a++){
         if(a<=4){
             star++;
             space--;
         }
         else{
             star--;
             space++;
            }
         for(int b=1; b<=space; b++){
             System.out.print(" ");
            }
            for (int c=1; c<=star; c++){
                System.out.print("*");
            } // part a is completed 1st part is completed 
            if(a>=3 && a<=5){ 
                for(int b=1;b<=10;b++){
                System.out.print("*");
                }
           }
           else{
               for(int b=1; b<=10; b++){
                System.out.print(" ");
                }
            }
         System.out.println();
       }
       System.out.println(" \n \n The END the right arrow \n \n");
    } 



     /* arrow pattern print 
     *          *
    **          **
   ****************
  ******************
   ****************
    **          **
     *          *
 */

    static void doubleArrow(){
        int star = 0, space = 4;
       for(int a=1; a<=7;a++){
         if(a<=4){
             star++;
             space--;
         }
         else{
             star--;
             space++;
            }
         for(int b=1; b<=space; b++){
             System.out.print(" ");
            }
            for (int c=1; c<=star; c++){
                System.out.print("*");
            }
            if(a>=3 && a<=5){ 
                for(int b=1;b<=10;b++){
                System.out.print("*");
                }
           }
           else{
               for(int b=1; b<=10; b++){
                System.out.print(" ");
                }
            }
         for(int b=1;b<=star; b++){ // last arrow priting 
             System.out.print("*");
            }
         System.out.println();
       }
       System.out.println(" \n \n The END the double arrow \n \n");
    }




    static void dimond(){
        int star =5, space = 0;
        for(int a=1; a<=7; a++){
            if(a<=4){
                star--;
                ++space;
            }
            else{
                star++;
                --space;
            }
            for(int b=1;b<=star; b++){
                System.out.print("*");
            }
            for(int b=1; b<=space; b++){
                System.out.print(" ");
            }
          /*  if(a<=4){
                ++space;
                star--;
            }
            else{
                star++;
                --space;
            }
            for(int b=1;b<=space; b++){
                System.out.print(" ");
            }
            for(int b=1; b<=star; b++){
                System.out.print("*");
            }
           */


         
            
         System.out.println();
        }
    }
   
    static void dimond2(){
      //  int star=0,space=1;
        for(int a=1;a<=7;a++){
          for(int b=1;b<=7;b++){
              System.out.print("*");
          }  
          System.out.println(); 
        }
        System.out.println(" \n \n The END the dimond \n \n");
    }



    static void numbers(){
        int n=0,n1=0;
        for(int a=1;a<=4;a++){
             n++;
            for(int b=1; b<=n; b++){

                n1++;
                System.out.print(n1);
            }
            System.out.println();
        }
        System.out.println(" \n \n The END the numbers \n \n");
    }



    static void numbers2(){
        for(int a=1;a<=5;a++){
            for(int b=1;b<=a; b++){
                System.out.print(b);
            }
            System.out.println();
        }
        System.out.println(" \n \n The END the nubmers2 \n \n");
    }


 public static void main(String[] args) {
     arrow2();
     doubleArrow();
     dimond();
     dimond2();
     numbers();
     numbers2();
     
    }
}
