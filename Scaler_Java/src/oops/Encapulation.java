package oops;

public class Encapulation {


    int num;
    String name;
    boolean b;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Encapulation{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", b=" + b +
                '}';
    }
}
