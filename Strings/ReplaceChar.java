public class ReplaceChar {
    // so simple yogi don't think so much use ur brain 
    // okay
    public static void replaceChar(String s) {
        String s1 = "";
        s1 = s.replaceAll("[!@#$%^&*()_123456789]", "-");
        System.out.println(s1);  
    }

    public static void main(String[] args) {
        String s = "hello!kjf@jh#jk$kj%kj^jkjk^kjk&jkjkj*kk(kjk)kjkk)klk";
        replaceChar(s);
    }
    
}
