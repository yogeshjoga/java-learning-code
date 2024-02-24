package oops;

public interface LooseCouple {

    public int hello(int i);

    public short sum(int i);

    default boolean im(String gender){
        // must have implement's the Default method
        return true;
    }

}
