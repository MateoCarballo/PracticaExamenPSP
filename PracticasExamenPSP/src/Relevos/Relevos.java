package Relevos;

public class Relevos {
    /**
     * 1. Escribe una clase llamada Relevos que simule una carrera de relevos de la siguiente
     * forma:
     * •
     * Cree 4 threads, que se quedarán a la espera de recibir alguna señal para comenzar a
     * correr. Una vez creados los threads, se indicará que comience la carrera, con lo que
     * uno de los threads deberá empezar a correr.
     * •
     * Cuando un thread termina de correr pone algún mensaje en pantalla y espera un par
     * de segundos, pasando el testigo a otro de los hilos para que comience a correr, y
     * terminando su ejecución (la suya propia).
     * •
     * Cuando el último thread termine de correr, el programa principal mostrará un mensaje
     * indicando que todos los hijos han terminado.
     */
    public static void main(String[] args) {
        Carrera testigo = new Carrera();
        Corredor[] equipoRelevos = new Corredor[4];
        for (int i = 0; i < equipoRelevos.length ; i++) {
            equipoRelevos[i] = new Corredor(testigo,i+1);
        }
        System.out.println("Todos los hilos han sido arrancados \nDoy la salida!");
        for (int i = 0; i < equipoRelevos.length ; i++) {
            equipoRelevos[i].start();
        }
    }
}
