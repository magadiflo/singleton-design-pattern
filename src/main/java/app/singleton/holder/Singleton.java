package app.singleton.holder;

/**
 * Implementación de Bill Pugh Singleton
 * *************************************
 * Antes de Java 5, el modelo de memoria java tenía muchos problemas y los enfoques anteriores
 * solían fallar en ciertos escenarios donde demasiados subprocesos intentan obtener la instancia
 * de la clase Singleton simultáneamente. Así que a Bill Pugh se le ocurrió un enfoque diferente
 * para crear la clase Singleton utilizando una clase auxiliar estática interna.
 *
 * Observe la clase estática interna privada que contiene la instancia de la clase singleton.
 * Cuando se carga la clase singleton, la clase no se carga en la memoria y solo cuando alguien
 * llama al método getInstance, esta clase se carga y crea la instancia de clase Singleton.
 * Este es el enfoque más utilizado para la clase Singleton, ya que no requiere sincronización.
 *
 * Estoy usando este enfoque en muchos de mis proyectos y también es fácil de entender e implementar.
 */

public class Singleton {

    private Singleton() {
        System.out.println("Creating...");
    }

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton(); //lazy
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

}
