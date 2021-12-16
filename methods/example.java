public class example {
    class faceBook{
        public static void login(){
            System.out.println("this is the login method : ");

        }
        public static void main(String[] args){
            login();
        }
    }




 class faceBook1{
        public static void login(String userName,String passWord){
            System.out.println("this is the login method : ");
            userName = "yogesh Joga";  //reinit
            System.out.println("login of" + userName + " ready to ur account ");
            
        }
        public static void main(String[] args){

            login("yogi"," ********** "); // method calling statment
        }
    }
    

 class faceBook2{
     
       public static void login(String userName, String passWord){
           System.out.print("login of " + userName + " your account is ready to use ");
       }

       public static void main(String[] args){
           String userName="yogi";
           String passWord = " ************ " ;
            login(userName,passWord); // method calling statment
        }

    }
}
