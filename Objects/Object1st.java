public class Object1st{
    static Object1st obj = new Object1st();
    static boolean b= true;
    int j = 20;
    public static (){
        Object1st obj1 = new Object1st();
        System.out.println(obj.obj1.j);
        System.out.println(obj.j);
        System.out.println(Object1st.obj.j);

    }

    public static void main(String[] args) {
        Object1st obj = new Object1st();
        System.out.println(obj.j);


    }
}