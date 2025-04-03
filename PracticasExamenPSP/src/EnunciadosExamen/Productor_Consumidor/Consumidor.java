package EnunciadosExamen.Productor_Consumidor;

public class Consumidor extends Thread {
    Recipiente recipiente;

    public Consumidor(Recipiente recipiente) {
        this.recipiente = recipiente;
    }

    @Override
    public void run() {
        while (true) {
            String cadenaRecibida = recipiente.obtenerLongitudCadena();
            if (cadenaRecibida.equalsIgnoreCase("*")) {
                System.out.println("Programa finalizado");
                break;
            }
            System.out.println("La longitud de la cadena es " + cadenaRecibida.length());

        }
    }
}
