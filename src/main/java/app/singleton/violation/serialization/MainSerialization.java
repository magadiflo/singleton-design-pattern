package app.singleton.violation.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * NOTA:
 * - Se debe crear el directorio /tmp en el disco sino lanzará un error, o agregar una ruta existente
 * - La extensión .ser usada en la ruta, está referido a archivos que están asociados principalmente con
 *   Java Development Kit.
 *
 *   ¿Qué es un archivo SER? (Solo para saber)
 *   Los archivos SER pertenecen principalmente a Java Development Kit de Oracle.
 *   Los archivos SER se utilizan principalmente para almacenar objetos serializados de un programa Java.
 *   Los objetos serializados almacenados en archivos SER se guardan como flujos de bytes.
 *   Estos archivos pueden abrirse con herramientas de desarrollo de software como Eclipse y Netbeans.
 */

public class MainSerialization {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1 = " + s1.hashCode());
        System.out.println("s2 = " + s2.hashCode());

        //Serializar
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/tmp/s2.ser"));
        oos.writeObject(s2);

        //Deserializar
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/tmp/s2.ser"));
        Singleton s3 = (Singleton) ois.readObject();
        System.out.println("s3 = " + s3.hashCode());
    }
}
