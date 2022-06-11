public class RemoveOvelsSTring {
    /**
     * how to remove Vowels from given string 
     * lets do this 
     * spelling mistake in calss name 
     */
    public static void removeVowels( String s) {
        String s1 = "";
         s1 = s.replaceAll("[AEIOUaeiou]", "");
        System.out.println(s1);
        } 
    public static void main(String[] args) {
        String s = "helloYogeshJoga";
        removeVowels(s);
    }
    
}
