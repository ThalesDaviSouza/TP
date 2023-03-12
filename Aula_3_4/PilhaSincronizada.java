public class PilhaSincronizada {
    private int index = 0;
    private int [] buffer = new int [10];

    public synchronized int pop () {
        while(index == 0){
            System.out.println("Esperando ter algo para consumir...");
            try {
                this.wait();
            } catch (Exception e) {}
        }
        index--;
        this.notify();
        return buffer[index];
    }

    public synchronized void push (int i) 
    {
        while(index >= buffer.length){
            try{
                System.out.println("Esperando ter espaço para armazenar...");
                this.wait();
            } catch (Exception e) {}
        }
        buffer[index] = i;
        index++;
        this.notify();
    }
}
