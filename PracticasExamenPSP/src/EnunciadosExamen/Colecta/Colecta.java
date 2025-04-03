package EnunciadosExamen.Colecta;

public class Colecta {
    private int fondos;
    private int objetivo;
    private boolean objetivoAlcanzado;

    public Colecta(int objetivo) {
        this.objetivo = objetivo;
        fondos =0;
        objetivoAlcanzado = false;
    }

    public boolean isObjetivoAlcanzado() {
        return objetivoAlcanzado;
    }

    public synchronized void aumentarFondos(int aportacion, int idHilo){
        if (!objetivoAlcanzado){
            System.out.println("El hilo " + idHilo + " aporta " + aportacion);
            System.out.println("Los fondos pasan de " + fondos + " -> " + (fondos + aportacion) );
            fondos = fondos + aportacion;
        }
        if (objetivo<= fondos) {
            System.out.println("Hemos alcanzados los fondos solicitados y sobran " + (fondos - objetivo));
            fondos = 2000;
            objetivoAlcanzado = true;
        }
    }
}
