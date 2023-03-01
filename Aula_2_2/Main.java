package Aula_2_2;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        Thread thread = new Thread(relogio);
        thread.start();
        
        Relogio relogio2 = new Relogio(10);
        Thread thread2 = new Thread(relogio2);
        thread2.start();
    }    
}
