public class ExampleToMindMap{
    int i =10;
    public static void main(String[] args) {
        //1st object creation
        ExampleToMindMap object = new ExampleToMindMap();
        System.out.println(object.i); // object invoking
        // 2nd object creation
        ExampleToMindMap object2 = new ExampleToMindMap();
        System.out.println(object2.i); // 2nd object invoking
        // printing the object references
        System.out.println(" This is the second object "+object2);
        System.out.println(" This is the first object "+object);
        // anonamous object creation and invoking by using sopln method
        System.out.println(new ExampleToMindMap().i);   
    }
}