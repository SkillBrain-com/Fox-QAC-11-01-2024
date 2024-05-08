//Definiti un array si o lista. Determinati daca ele sunt goale sau nu.

import java.util.ArrayList;
import java.util.List;
public class Exercitiul8 {
    public static void Ex8(){

        String[] array = new String[10];
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

