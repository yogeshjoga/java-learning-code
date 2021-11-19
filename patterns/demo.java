//pattern printing demo 
class demo{
    //int a, b, c;
    static void stars(){
        int a, b, c=6;
          for(a=0; a<=c; a++)
          {
              for(b=0; b<=a; b++){    
                System.out.print("* ");
              }
              System.out.println();
          }
    }
    public static void main(String[] args){
    System.out.println("patterns");
    stars();
    System.out.println();
    }
}












