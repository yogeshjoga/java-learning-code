public class ThrowUserException extends Exception{
    /**
     * this is we use throw keyword to create our user defined exception
     * 
     * to programm the custom exception in below i will wrote that.
     * 
     * 1st we need to use constructer and use as super call statment to retrive the message of the input
     *  the class must should be extends by Exception
     *  
     * in programm 1st we must add throws exception in method and main method
     *  after where to use custom exception. to create exception object 
     *   like throw new ThrowUserException("not valid");
     *   that it 
     * 
     *  it is very simple right yogi!! .
     * 
     */

     public ThrowUserException(String message){
         super(message);
     }

}



