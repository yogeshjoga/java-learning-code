public class FirstProgram {
    int calu(int a , int b){
        System.out.println("calu method called");
        System.out.println(100);
        return (a+b)+10+(a-b);
    }
    int calu2(){
        System.out.println("Calu2 method called");
        return this.calu3()+8;
    }
    FirstProgram(){
        this("JAVA is my lover");
        System.out.println(50);
    } 
    int calu3(){
        System.out.println("calu3 method called");
        return 10;
    }
    String calu4(int a, String s){
        System.out.println("Calu4 method called");
        a=a+4;
        System.out.println("a Value ====> " +a);
        System.out.println("S Value =====> "+s);
        return "JAVA IS MY LOVER";
    }
    FirstProgram(String s){
        String result = this.calu4(this.calu1(this.calu2(),5),"JAVA");
        System.out.println(result);
        System.out.println(s);
    }
    public static void main(String[] args) {
        new FirstProgram();
    }
    
}
