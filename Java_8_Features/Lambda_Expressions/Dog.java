public class Dog /*implements Animal */ {
    /*
     * implement the Animal interface as per Dog animal
     */
    String animal = dog;
    int legs = 4;
    @Override
    public String food(){
        // age, declare the age as a months
        int puppie = 9;
        int dog = 14;
        if (dog >=12){
            return  "I am a Dog"+ dog+"Any thing it will okay for dog";
        }
        return "I am a Puppie"+ puppie+"Any thing it will okay for dog";
    }
    @Override
    public String walk(){
        String walk = fast;
        String walk2 = slow;
        if(animal == dog){
            return "i am the dog so im so "+walk+"running";
        }
        return "i am the puppie so im so "+walk2+"running";
    }

    @Override
    public int legs(){
        return "i am animal so i have "+legs;
    }

    @Override
    public String animalType(){
        String type1 = "Damostic Animal";
        String type2 = "wild animal";
        if(animal == dog){
            return " im a "+animal+"so "+type1;
        }
        return "im a "+type2;
    }


    
}
 