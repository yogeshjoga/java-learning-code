package Strings_Rev;


/**
 *
 * <p>
 *     Just learn one by one string preDefined methods.. lets look into those methods
 *     okay let's go....
 *     <br>
 *     <b>String methods are very important to DSA, just focus on it...</b>
 *
 *     <ol>
 *         <li>chatAt(int) return single char </li>
 *         <li>campareTo() example s1.compareTo(s2)</li>
 *         <li>concat()  adding to string objects</li>
 *         <li>contains() </li>
 *         <li>endWith()</li>
 *         <li>equalsIgnorase()</li>
 *         <li>format()</li>
 *         <li>getBytes()</li>
 *         <li>getChars()</li>
 *         <li>indexOf()</li>
 *         <li>intern()</li>
 *         <li>isEmpty()</li>
 *         <li>join()</li>
 *         <li>lastIndexOf()</li>
 *         <li>length()</li>
 *         <li>replace()</li>
 *         <li>replaceAll()</li>
 *         <li>split()</li>
 *         <li>startsWith()</li>
 *         <li>subString()</li>
 *         <li>toCharArray()</li>
 *         <li>toLowerCase()</li>
 *         <li>toUpperCase()</li>
 *         <li>time()</li>
 *         <li>valueOf()</li>
 *     </ol>
 * </p>
 * @author <b>Yogesh Joga</b>
 */
public class StringMethods {



    public static void main(String[] args) {



        // here i'm taken strings
        String s = "yogesh joga";
        String s1 = "yogesh joga";
        String s2 = new String("yogesh joga");

        String s3 = new String("yogesh joga");

        String s4 = "yogi";
        String s5 = "balu";



        // charAt() method usages, s string object

        // for loop for iterating the string object
        for(int i=0; i<=s.length()-1; i++){
            if('h' == s.charAt(i)) {
                System.out.println("this is from if condition is true : " + s.charAt(i));
            }
        }

        // compareTo() --> returns the int value
        System.out.println(s1.compareTo(s5));

        


        // contains() method

    }


}
