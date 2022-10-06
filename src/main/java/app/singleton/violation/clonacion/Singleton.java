package app.singleton.violation.clonacion;

/**
 * Violación de Singleton en la clonación de objetos
 * **************************************************
 * Si intentamos crear una instancia clonándola, el código hash generado
 * de la copia clonada no coincide con el objeto real, por lo que también
 * viola el principio de Singleton.
 */

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
        return super.clone();
    }
}
