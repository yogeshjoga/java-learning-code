public class StarAndAt {
    public static void main(String[] args) {
        int a=0, b=5;
        for(int i=1;i<=5;i++){
          b--;
          a++;
          for(int j=1; j<=b;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=a; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}
