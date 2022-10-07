package app.singleton.holder;

/**
 * A Bill Pugh se le ocurrió un enfoque diferente para crear la clase Singleton
 * utilizando una clase auxiliar estática interna como se muestra a continuación.
 */

public class Singleton {

    private Singleton() {
        System.out.println("Creating...");
    }

    static class Holder {
        static final Singleton INSTANCE = new Singleton(); //lazy
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

}
