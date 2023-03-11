public class Main {
    public static void main(String[] args) {
        PilhaSincronizada resources = new PilhaSincronizada();

        Producer producer = new Producer(resources); 
        Thread p = new Thread(producer);
        p.start();

        Consumer consumer = new Consumer(resources);
        Thread c = new Thread(consumer);
        c.start();


    }
}
