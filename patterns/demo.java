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
    /*
    static int Add(int x, int y)
{
  if (y == 0)
    return x;
  else
    return Add(x ^ y, (x & y) << 1);
} */
 
    public static void main(String[] args){
    System.out.println("patterns");
    stars();
    System.out.println();
    }
}












