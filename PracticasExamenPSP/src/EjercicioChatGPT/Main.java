package EjercicioChatGPT;

public class Main {
    public static void main(String[] args) {
        Recipiente recipiente = new Recipiente();

        Thread productor = new Thread(new Productor(recipiente));
        Thread consumidor = new Thread(new Consumidor(recipiente));

        productor.start();
        consumidor.start();
    }
}

