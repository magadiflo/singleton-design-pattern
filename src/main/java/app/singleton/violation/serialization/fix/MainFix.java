package app.singleton.violation.serialization.fix;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class MainFix {
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
