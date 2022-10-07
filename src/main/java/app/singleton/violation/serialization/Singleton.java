package app.singleton.violation.serialization;

import java.io.Serializable;

/**
 * Cuando serializamos un objeto y lo deserializamos de nuevo,
 * se generan diferentes valores de código hash como se muestra en
 * el ejemplo a continuación (ejecutar el MainSerialization).
 * Por lo tanto, nuestro principio singleton
 * también se rompe en caso de serialización/ deserialización de objetos.
 */

public class Singleton implements Serializable {

    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("creating instance...");
    }

    public static Singleton getInstance() {
        return instance;
    }

}
