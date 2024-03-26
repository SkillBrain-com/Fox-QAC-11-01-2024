package BiancaJianu.Tema2;

import java.util.ArrayList;
import java.util.List;

public class T2Exercitiul7 {
    public static void main(String[] args) {

        // Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.

        List<Integer> listaDeArray = new ArrayList<>();

        listaDeArray.add(1);
        listaDeArray.add(2);
        listaDeArray.add(3);
        listaDeArray.add(4);
        listaDeArray.add(5);

        int suma = 0;

        for(Integer numar : listaDeArray) {
            suma += numar;
        }

        System.out.println("Suma tuturor elementelor este: " + suma);

    }
}
