package DianaLuca.Tema2;

import java.util.Arrays;

public class Exercitiul9 {
    public static void main(String[] args) {

        int[] sirDeNumere = {1, 58, 10, 26, 17, 125, 46, 99};
        sortareCrescator(sirDeNumere);
        System.out.println("\n");
        sortareDescrescator(sirDeNumere);

    }

    public static void sortareCrescator(int[] sirDeNumere){
        Arrays.sort(sirDeNumere);
        for(int i = 0; i < sirDeNumere.length; i++){
            System.out.println(sirDeNumere[i]);
        }
    }

    public static void sortareDescrescator(int[] sirDeNumere){
        Arrays.sort(sirDeNumere);
        for(int i = sirDeNumere.length-1; i >= 0; i--){
            System.out.println(sirDeNumere[i]);
        }
    }
}
