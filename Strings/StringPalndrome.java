public class StringPalndrome {
    public static void palandrome(String s) {
        String s1 = "";
      //  System.out.println(s);
        for(int i=s.length()-1;i>=0;i--){
            s1 =s1+ s.charAt(i);
          //  System.out.println(s1);
        }
        if(s.equalsIgnoreCase(s1)){
            System.out.println("yes palandrome");
        }
        else{
            System.out.println("no");
        }
    }



    public static void stringPal(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder s1 = sb.append(s);
        sb.reverse();
        if(sb.equals(s1)){
            System.out.println("pal string in string builder");
        }
        else{
            System.out.println("not a pal string in string builder");
        }
        
    }

    // int pal num check

    public  static void intPal(int num) {
        String s1 ="";
        String s = String.valueOf(num);
        for(int i=s.length()-1; i>=0; i--){
            s1 = s1+s.charAt(i);
        }
            if(s1.equals(s)){
                System.out.println("pal num");
            }
            else{
                System.out.println("no");
            }
        

        
    }





    public static void main(String[] args) {
        String s = "amma";
        palandrome(s);
        int num = 121;
        intPal(num);
        stringPal(s);
    }
}
