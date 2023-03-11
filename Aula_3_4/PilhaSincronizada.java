public class PilhaSincronizada {
    private int index = 0;
    private int [] buffer = new int [10];

    public synchronized int pop () {
        try{
            this.wait();
            index--;
            this.notify();
        }catch(Exception e){}
        return buffer[index];
    }

    public synchronized void push (int i) 
    {
        try {
            this.wait();
            buffer[index] = i;
            index++;
            this.notify();
        } catch (Exception e) {
        }
    }
}
