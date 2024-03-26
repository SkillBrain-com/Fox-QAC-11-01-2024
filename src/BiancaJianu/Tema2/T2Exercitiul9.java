package BiancaJianu.Tema2;

import java.util.Arrays;

public class T2Exercitiul9 {
    public static void main(String[] args) {
        // Definiti o metoda care ia un array de numere (intregi sau cu virgula) si sa-l ordoneze crescator sau descrescator.

        double[] sirNumere = {3.5, 2.0, 1.4, 7.8, 5.2};

        sortare(sirNumere, true);
        System.out.println("Array sortat crescator: " + Arrays.toString(sirNumere));

        sortare(sirNumere, false);
        System.out.println("Array sortat descrescator: " + Arrays.toString(sirNumere));

    }

    public static void sortare(double[] array, boolean crescator) {
        if (crescator) {
            Arrays.sort(array);
        } else {
            Arrays.sort(array);
            for (int i = 0; i < array.length / 2; i++) {
                double temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }



    }
}
