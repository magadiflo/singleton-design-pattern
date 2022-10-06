package app.singleton.violation.clonacion.fix;

public class Singleton implements Cloneable {

    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("creating instance.....");
    }

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        if(instance != null) {
            throw new CloneNotSupportedException("Can't create instance. Please use getInstance() to create it.");
        }
        return super.clone();
    }
}
