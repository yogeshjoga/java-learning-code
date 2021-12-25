public class SwapNumWithOut3rdVar {
    public static void main(String[] args) {
        int a=50,b=100,c=a,d=b;
        a=a+b;
        b=a-b;
        a=a-b;
      //  System.out.println(a + "  "+ b);
        System.out.println("\n A is : "+c+", is swaped into "+a +" &&  B is : "+d+", is swaped into  "+ b+"\n");
    }
    
}
