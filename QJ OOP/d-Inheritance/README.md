# inheritance
  these are two typs 
  1 has a relationship
  2 is a relationship




  Is-A-Relationship:
        It is similar to parent child realtionship where in the properties ad behaviours of one class( super Class) is inherted to another class object (subclass oject ) with the help of extends keyword. Only non static members get inherited.
    ``java

     ex :
        classs Vehicle {
            double topSpeed = 660.33

        }
        class Bike extends Vehicle{
            public static void main(String[] args){
                Bike bike = new Bike
            }
        }




     example2:

        class A{
            public static void main (String[] args){

            }
        }

        class B extends A{
            int j=20;
            public void fromB(){
                System.out.println("From b()...);
            }
              public static void main(String[] args){
               System.out.println("From B mian ");
               A obj = new A();
               //super class object consits of 
               // only the superclass member but not the subclass members
               //obj is claled as superclass object reference
               B obj1 = new B(); //subclass consists of 
               //both super classs non static members and subclass non static members
               //obj1 is called as subclass object reference.

            }
        }
    ```

    ###  NTOE : Every class extends automatically object class if a developer do not extends the class to another class, hence Object class is called as supermost class fo all the classes in java.


    HENCE : Every progam in java exhibit inheritance which is mandatory eventhough the ddeveloper forgets to add extends keyword