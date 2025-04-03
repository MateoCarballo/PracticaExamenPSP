package EnunciadosExamen.Colecta;

import java.util.Random;

public class Participante extends Thread{
    int idHilo;
    int aporte;
    Colecta colecta;
    Random random ;


    public Participante(Colecta colecta,int id) {
        this.idHilo = id;
        this.colecta = colecta;
        random = new Random();
    }

    public void run(){
        while(!colecta.isObjetivoAlcanzado()){
            aporte = random.nextInt(50) + 10;
            colecta.aumentarFondos(aporte,idHilo);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
