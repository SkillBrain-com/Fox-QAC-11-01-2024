package DianaLuca.Tema2;

import java.util.ArrayList;

public class Exercitiul7 {
    public static void main(String[] args) {
        ArrayList<Integer> listaElemente = new ArrayList();
        listaElemente.add(15);
        listaElemente.add(6);
        listaElemente.add(11);
        listaElemente.add(28);
        listaElemente.add(34);
        System.out.println(listaElemente);

        int suma = 0;
        for(int i = 0; i < listaElemente.size(); i++){
            suma = suma + listaElemente.get(i);
        }

        System.out.println("Suma elementelor este: " + suma);
    }
}
