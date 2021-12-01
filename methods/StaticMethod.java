class StaticMethod{

    //static method type double is the return type
    static double sum(double a, double b){
        return a+b;

    }
    //instance method type float is return type
    float num(float a, float b){
        return a+b;


    }

    public static void main (String[] args){
        //create object to instance method it's not invocation to directly 
        StaticMethod integer1 = new StaticMethod();
            integer1.num();
       System.out.println(num);
       sum();
       




    }
}