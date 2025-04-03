package EnunciadosExamen.Colecta;

import java.util.Random;

public class Main {
    /**
     * Diseña un programa que simule una colecta, que
     * se realizara en 5 participantes. Cada uno de los
     * participantes aportará, cada tiempo aleatorio entre
     * 0 y 5 segundos una cantidad aleatoria entre 1€ y
     * 20€. La colecta termina cuando se llegue a una
     * cantidad de 2000€. La gestion de los fondos de
     * la colecta se realizará en un objeto compartido
     * por todos los participantes, donde se irá incrementando
     * su valor
     */

    public static void main(String[] args) {
        Colecta colecta = new Colecta(2000);
        Participante[] participantes = new Participante[5];

        for (int i = 0; i < participantes.length; i++) {
            participantes[i] = new Participante(colecta,i);
        }

        for (int i = 0; i < participantes.length; i++) {
            participantes[i].start();
        }
    }
}
