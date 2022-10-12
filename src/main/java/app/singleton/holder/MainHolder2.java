package app.singleton.holder;

public class MainHolder2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());

        t1.start();
        t2.start();
    }

    private static class Thread1 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println("Thread1: singleton hashcode = " + singleton.hashCode());
        }
    }

    private static class Thread2 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println("Thread2: singleton hashcode = " + singleton.hashCode());
        }
    }

}
