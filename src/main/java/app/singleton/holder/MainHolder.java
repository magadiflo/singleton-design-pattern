package app.singleton.holder;

/**
 * Como se muestra en la salida, esta forma de crear una instancia de Singleton
 * no infringe el principio de Singleton.
 */

public class MainHolder {
    public static void main(String[] args) throws Exception {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println("s1 = " + s1.hashCode());
        System.out.println("s2 = " + s2.hashCode());
        System.out.println("s3 = " + s3.hashCode());


    }
}
