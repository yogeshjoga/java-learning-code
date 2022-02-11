abstract interface SecondIntreface {
    /**
     * This is the interface i can use to multiple inhertince
     * to achive the multiple inhertince
     * this interface must have abstract methods it means not implement half-of-the compelition of the programm
     * @param front
     * @param back
     * @return
     */
    public abstract int carWheels(int front, int back);
    // this the methods but not impletementd so it contains abstract must
    // we want to override this methods by using method signature
    // when we will use the methods overriding must be same method signatur 
    // and arguments must returm must be same in primitive 
    // co-variant return types in object reference datatypes
    // thats non-primitive members
    public abstract double carMilage(double milage);
    public abstract String carBrand(String bran);
}
