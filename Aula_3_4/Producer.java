public class Producer implements Runnable {
    PilhaSincronizada pilha;

    public Producer ( PilhaSincronizada pilha ) {
        this.pilha = pilha;
    }

    public void run () {
        int colorIdx;
        for (int i = 0; i < 30; i ++) {
            colorIdx = (int)(Math.random() * 10);
            pilha.push(colorIdx);
            System.out.println("Criado : " + colorIdx);
            try{
                Thread.sleep((int)(Math.random() * 1000));
            }catch(InterruptedException e){}
        }
    }
}