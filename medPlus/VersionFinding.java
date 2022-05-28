public class VersionFinding {
    /**
     * my friends medPlus exam questions and answers for coding section
     * happy coding with yogideeplearn and njoy guys 
     */
    public static void versions(){
        String ver1 = "1.1.0";
        String ver2 ="1.1.1";
        /**
         * we can't use the split method it will not work to split or remove the full stop
         * so we can use the replace method.
         * replace with the string obj not a string empty obj 
         * use just double quots that is it will done 
         */
        String sp1 = ver1.replace(".","");
        int version1 = Integer.parseInt(sp1);
        String sp2 = ver2.replace(".", "");
        int version2 =Integer.parseInt(sp2);
        if(version1 > version2){
            System.out.println("version A is the latest version :" + ver1);
        }
        else{
            System.out.println("version B is the latest version :" + ver2);
        }
       
    }
     public static void main(String[] args) {
         versions();
     }
}
