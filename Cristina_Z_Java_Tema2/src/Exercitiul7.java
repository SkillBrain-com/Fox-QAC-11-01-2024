// Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.

import java.util.ArrayList;
public class Exercitiul7 {
    private static ArrayList<Integer> listaDeNumere = new ArrayList<>();
    public static void setListaDeNumere(ArrayList<Integer> listDeNumere) {
        Exercitiul7.listaDeNumere = listDeNumere;}
    public static void sumaNumerelor(){
        int suma = 0;
        for(int i=0; i<listaDeNumere.size(); i++){
            suma = suma + listaDeNumere.get(i);
        }
        System.out.println(suma);
    }
}
