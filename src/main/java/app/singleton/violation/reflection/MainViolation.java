package app.singleton.violation.reflection;

import java.lang.reflect.Constructor;

/**
 * Violación de singleton en el uso de la reflexión
 * *******************************************************************
 * Usando la reflexión, podemos configurar el constructor privado para
 * que sea accesible en tiempo de ejecución como se muestra en el
 * ejemplo a continuación.
 * */

public class MainViolation {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1 = " + s1.hashCode());
        System.out.println("s2 = " + s2.hashCode());

        //Usando reflexion
        Class clazz = Class.forName("app.singleton.violation.reflection.Singleton");
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        //En tiempo de ejecución creamos una nueva instancia de la clase Singleton ¡Ups!
        Singleton s3 = constructor.newInstance();
        System.out.println("s3 = " + s3.hashCode());

        /**
         * Conclusión
         * ***********
         * De la salida anterior está claro que el uso de la violación
         * de singleton de reflexión puede ocurrir.
         * */
    }
}
