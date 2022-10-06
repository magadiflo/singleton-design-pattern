package app.singleton.eager;

/**
 * Singleton seguro para subprocesos (inicialización ansiosa)
 * **********************************************************
 * En la inicialización ansiosa, se crea una instancia en el momento de la carga de la clase.
 * No tendremos ningún problema de seguridad de subprocesos si elegimos ir con una inicialización ansiosa.
 * Si su aplicación siempre crea y usa una instancia de Singleton o los aspectos generales de creación y tiempo
 * de ejecución de Singleton no son una carga, es posible que desee crear su Singleton con entusiasmo,
 * así:
 */

public class Singleton {

    //Inicialización ansiosa (Eager)
    //Se garantiza que la siguiente instancia es segura para subprocesos.
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        //Ya tenemos una instancia, así que devuélvela
        return uniqueInstance;
    }

}
