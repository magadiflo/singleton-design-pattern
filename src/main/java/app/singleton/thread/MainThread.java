package app.singleton.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * Inicialización perezosa
 * ************************
 * El siguiente código muestra el comportamiento de la instancia de Singleton,
 * cuando se ejecutan dos subprocesos comparando sus valores de código hash.
 * Tenga cuidado al ejecutar el siguiente código, ya que solo funcionará en Java 8
 * y versiones posteriores. Además, hemos utilizado Method Reference en el código.
 */

public class MainThread {
    public static void main(String[] args) {

         //Al ejecutar los dos hilos se obtienen códigos Hash distintos... ¡Ups! tenemos que solucionarlo.
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(Singleton::useSingleton);
        service.submit(Singleton::useSingleton);
        service.shutdown();;

    }
}
