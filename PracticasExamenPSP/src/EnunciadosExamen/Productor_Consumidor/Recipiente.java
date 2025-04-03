package EnunciadosExamen.Productor_Consumidor;

public class Recipiente {
    private boolean datoCargado;
    private String contenidoCadena;
    public Recipiente() {
        datoCargado = false;
        contenidoCadena = "";
    }

    public synchronized String getContenidoCadena() {
        return contenidoCadena;
    }

    public synchronized void setContenidoCadena(String contenidoCadena) {
        this.contenidoCadena = contenidoCadena;
    }

    public synchronized void cargarString(String lecturaTeclado) {
        while (datoCargado) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        contenidoCadena = lecturaTeclado;
        datoCargado = true;
        notifyAll();
    }

    public synchronized String obtenerLongitudCadena() {
        while (!datoCargado) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String resultado = contenidoCadena;
        datoCargado = false;
        notifyAll();
        return resultado;
    }
}
