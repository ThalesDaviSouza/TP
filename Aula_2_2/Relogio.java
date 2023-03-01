package Aula_2_2;

public class Relogio implements Runnable{
    private int milisseconds = 0;

    public Relogio(){}
    public Relogio(int milissec){
        milisseconds = milissec;
    }

    public void run(){
        try {
            for(int i = 0; i <= 10; i++){
                Sleep(milisseconds);
                milisseconds++;
                Thread.sleep(1 * 1000);
            }
        } catch (Exception e) {
            System.out.println("Deu ruim" + e.getMessage());
        }
    }

    public void Sleep(int milisseconds) throws InterruptedException{
        System.out.println("Second: " + milisseconds);
    }
}