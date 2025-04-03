package EjercicioChatGPT;

public class Consumidor implements Runnable {
    private Recipiente recipiente;

    public Consumidor(Recipiente recipiente) {
        this.recipiente = recipiente;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int valor = recipiente.vaciar();
            synchronized (System.out) { // Evita que los mensajes se mezclen
                System.out.println("🔵 Consumidor vació: " + valor);
            }
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}


