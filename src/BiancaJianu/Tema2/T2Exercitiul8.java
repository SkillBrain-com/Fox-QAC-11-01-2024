package BiancaJianu.Tema2;

import java.util.ArrayList;

public class T2Exercitiul8 {
    public static void main(String[] args) {

        // Definiti un array si o lista. Determinati daca ele sunt goale sau nu

        String[] array = new String[5];

        ArrayList<String> lista = new ArrayList<>();

        if(array.length == 0) {
            System.out.println("Array-ul este gol");
        } else {
            System.out.println("Array-ul nu este gol");
        }

        if(lista.isEmpty()) {
            System.out.println("Lista este goală");
        } else {
            System.out.println("Lista nu este goală");
        }
    }
}
