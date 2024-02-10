package Other;

public class AccessModi {
    int marks = 60; //default not accessible outside the package
    public int per = 70; // public accessible from anywhere
    private int age =20; // priavte accessible whithin the class only
    protected int count = 50; // protected accessible within package and outside package with subclass only

}
