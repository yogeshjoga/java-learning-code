class NumbersMirror{
    static int numMirror(int num){
        int a;// b=0;
        System.out.println();
        while(num!=0){
            a=num%10;
            System.out.println(a);
            num=num/=10;

        }
        System.out.println();
        return num;
    }


    static int numMirror2(int num){
        int a,b=0;
        while(num!=0){
            a=num%10;
            b=b*10+a;
            num=num/=10;
        }
      System.out.println(b+ " \n");
      return num;
    }


    static long numMirror3(long num){
        long a,b=0,c=num;
        while(num!=0){
            a=num%10;
            b=b*10+a;
            num=num/=10;
        }
        if(b==c){
            System.out.println(c +" ===> "+b+  " : it is a paldrome number \n");
        }
        else{
            System.out.println(c + " ===> "+b+ " : it is not paldrome number \n");
        }
      return num;
    }


    public static void main(String[] args) {
        numMirror(12345);
        numMirror2(564738);
        numMirror3(122221);
    }
}


