public class numPattern {
    public static void main(String[] args) {
        int a =5;
        for(int i=a; i>=1; i--){
               for(int j=0;j<=a;j++){
                    if(i<=j){
                        System.out.print(j);
                    }
                    else{
                        System.out.print(" ");
                    }
               }
               System.out.println();
        }
    }
}