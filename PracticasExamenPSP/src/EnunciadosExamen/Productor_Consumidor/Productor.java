package EnunciadosExamen.Productor_Consumidor;

import java.util.Scanner;

public class Productor extends Thread {
    Recipiente recipiente;

    public Productor(Recipiente recipiente) {
        this.recipiente = recipiente;
    }

    @Override
    public void run() {
        try(Scanner sc = new Scanner(System.in)){
            while (true){
                System.out.println("Introduce una cadena para cargar");
                String cadena = sc.nextLine();
                if (cadena.equalsIgnoreCase("*")) {
                    recipiente.cargarString(cadena);
                    break;
                }
                recipiente.cargarString(cadena);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}

