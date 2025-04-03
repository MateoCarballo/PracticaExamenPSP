package EjercicioChatGPT;

public class Productor implements Runnable {
    private Recipiente recipiente;

    public Productor(Recipiente recipiente) {
        this.recipiente = recipiente;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            recipiente.llenar(i);
            synchronized (System.out) { // Evita que los mensajes se mezclen
                System.out.println("🟢 Productor llenó con: " + i);
            }
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
