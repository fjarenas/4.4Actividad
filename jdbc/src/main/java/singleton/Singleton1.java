package singleton;

public class Singleton1 {
    private static Singleton1 singleton1;
    public Singleton1() {
    }
    public static Singleton1 getInstance() {
        if(singleton1 == null)
            singleton1 = new Singleton1();
        return singleton1;
    }
}
