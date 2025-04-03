package EnunciadosExamen.Productor_Consumidor;

import java.util.Scanner;

public class Main {
    /**
     * Usando el modelo productor-consumidor,crea un
     * programa cuyo productor lea cadenas de teclado
     * y su consumidor obtenga dichas cadenas,cuente
     * los caracteres recibidos y muestre el resultado
     * por pantalla.Cuando el usuario introduzca"*"
     * el programa debera finalizar
     */
    public static void main(String[] args) {
        Recipiente recipiente = new Recipiente();
        Productor productor = new Productor(recipiente);
        Consumidor consumidor = new Consumidor(recipiente);
        productor.start();
        consumidor.start();
    }
}
