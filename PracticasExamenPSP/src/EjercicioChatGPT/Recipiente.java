package EjercicioChatGPT;

public class Recipiente {
    private int contenido;
    private boolean lleno = false; // No necesita `volatile`, ya está dentro de synchronized

    public synchronized int vaciar() {
        while (!lleno) { // Espera si está vacío
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        int valor = contenido; // Guardamos el contenido antes de modificarlo
        lleno = false;
        notifyAll(); // Despierta al productor
        return valor;
    }

    public synchronized void llenar(int valor) {
        while (lleno) { // Espera si está lleno
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        contenido = valor;
        lleno = true;
        notifyAll(); // Despierta al consumidor
    }
}

