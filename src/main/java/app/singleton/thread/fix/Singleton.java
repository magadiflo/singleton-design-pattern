package app.singleton.thread.fix;

public class Singleton {

    private static Singleton instance = null; //lazy initialization

    private Singleton() {
        System.out.println("Creating...");
    }

    //Usando synchronized, sincronizamos este método, de tal forma que al estar en
    //un entorno multiproceso, cuando un hilo cree esta instancia, el siguiente ya
    //no podrá crear porque están sincronizados, solo recibirá la instancia ya creada
    //por el primer hilo
    public static synchronized Singleton getInstance() {
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
