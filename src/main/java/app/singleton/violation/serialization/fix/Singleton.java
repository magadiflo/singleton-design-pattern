package app.singleton.violation.serialization.fix;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("creating instance...");
    }

    public static Singleton getInstance() {
        return instance;
    }

    /**
     * El readResolve() es llamado después del readObject() (Ver MainFix).
     * El objeto que devuelve el readResolve() reemplaza al objeto
     * que el ObjectInputStream.readObject() devuelve
     *
     * De esta manera, cuando JVM "ensambla" un nuevo objeto desde la memoria,
     * llamará automáticamente a este método readResolve() para devolver los
     * objetos que especificamos, y las reglas de un solo caso están garantizadas.
     */
    private Object readResolve() {
        System.out.println("Applying readResolve()...");
        return Singleton.getInstance();
    }

}
