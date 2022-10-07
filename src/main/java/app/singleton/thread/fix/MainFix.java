package app.singleton.thread.fix;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MainFix {
    public static void main(String[] args) {


        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(Singleton::useSingleton);
        service.submit(Singleton::useSingleton);
        service.shutdown();;

    }
}
