public class Main {
    public static void main(String[] args) {
        PilhaSincronizada resources = new PilhaSincronizada();
        
        Consumer consumer = new Consumer(resources);
        Thread c = new Thread(consumer);
        c.start();

        Producer producer = new Producer(resources); 
        Thread p = new Thread(producer);
        p.start();

    }
}
