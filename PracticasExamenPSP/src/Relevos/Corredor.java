package Relevos;

public class Corredor extends Thread{
    Carrera carrera;
    int idCorredor;

    public Corredor(Carrera carrera, int idCorredor) {
        this.carrera = carrera;
        this.idCorredor = idCorredor;
    }

    public void run(){
        carrera.correr(idCorredor);
    }
}
