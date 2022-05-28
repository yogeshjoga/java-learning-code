public class StringsMethods {
    String s = new String("\nhello this the my frist programming in Strings classs  Happy Programming");
    String yogi = "\nhello this is the yogesh billa darlinig";
    int yogi1 = yogi.length();
    int aa =2_9;// it is accept the intialize
    void newMethod (){
        System.out.println(this.s);
        int s1 = this.s.length();
        System.out.println(s1+" \n"+this.yogi+"\n"+this.yogi1);
    }
    void concatnationStrings(){
        String con = this.s+this.s;
        int len =con.length();
        System.out.println(len+" "+con);
    }
    public static void main(String[] args) {
        StringsMethods obj = new StringsMethods();
        obj.newMethod();
        obj.concatnationStrings();
        System.out.println(obj.aa);
    }
}
