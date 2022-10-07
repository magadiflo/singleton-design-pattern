package app.singleton.thread;

/**
 * Inicialización perezosa
 * ***********************
 * Singleton funcionará correctamente en un entorno de subprocesos múltiples solo
 * si se ha realizado una instancia ansiosa porque, en este caso, la creación de
 * instancias solo se realizará en el momento de la carga de clases. Pero para la
 * instanciación perezosa tendremos que ocuparnos de múltiples cosas.
 * Si queremos retrasar la instanciación por coste, tendremos que ir con perezosos.
 * <p>
 * La inicialización perezosa será beneficiosa cuando queramos retrasar
 * la inicialización hasta que se no sea necesaria.
 * <p>
 * En la inicialización perezosa no obtendremos la instancia hasta que llamemos al
 * método getInstance, mientras que en la inicialización ansiosa, crea la instancia
 * en el momento de la carga de la clase.
 */

public class Singleton {

    private static Singleton instance = null; //lazy initialization

    private Singleton() {
        System.out.println("Creating...");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    static void useSingleton() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Hashcode of singleton object: " + singleton.hashCode());
    }


}
