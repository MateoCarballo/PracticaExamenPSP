package Relevos;

import java.util.Random;

public class Carrera {
    int turnoEnEjecucion;
    Random random = new Random();

    public Carrera() {
        turnoEnEjecucion = 1;
    }

    public synchronized void correr(int idCorredor){
        while(idCorredor != turnoEnEjecucion){
            try {
                wait();
            } catch (Exception ignored) {}
        }
        System.out.println("Soy el thread "+ idCorredor +" , corriendo ...");
        try {
            Thread.sleep((random.nextInt(3) * 1000 )+ 1000);
        } catch (Exception e) {}

        if (turnoEnEjecucion<=3){
            turnoEnEjecucion ++;
            System.out.println("Terminé. Paso el testigo al corredor " + turnoEnEjecucion);
            notifyAll();
        }else{
            System.out.println("Terminé!");
            System.out.println("Todos los hilos terminaron");
        }
    }
}
