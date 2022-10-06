package app.singleton.violation.reflection;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("creating instance...");
    }

    public static Singleton getInstance() {
        return instance;
    }

}
