package app.singleton.violation;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("creating instance...");
    }

    public static Singleton getInstance() {
        return instance;
    }

}
