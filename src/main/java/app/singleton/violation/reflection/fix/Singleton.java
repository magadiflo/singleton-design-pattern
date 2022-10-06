package app.singleton.violation.reflection.fix;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("creating instance...");
        if (instance != null) {
            throw new RuntimeException("Can't create instance. Please use getInstance() to create it.");
        }
    }

    public static Singleton getInstance() {
        return instance;
    }

}
