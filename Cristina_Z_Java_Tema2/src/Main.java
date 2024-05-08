import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Ex. 1
        Exercitiul1 exercitiul1 = new Exercitiul1();
        exercitiul1.setNumarDeLaTastatura(scanner.nextInt());
        exercitiul1.comparareaDatelor();

// Ex. 2
        Exercitiul2 exercitiul2 = new Exercitiul2();
        exercitiul2.setOperatia(scanner.next().charAt(0));
        exercitiul2.setNumarul1(scanner.nextDouble());
        exercitiul2.setNumarul2(scanner.nextDouble());
        exercitiul2.operatii();

// Ex. 3
        Exercitiul3 exercitiul3 = new Exercitiul3();
        int[][] numere = new int[3][5];
        Random random = new Random();
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                numere[i][j] = random.nextInt(1000);
            }
        }
        exercitiul3.setSir(numere);
        exercitiul3.afisareElemente();


// Ex. 4
        Exercitiul4 exercitiul4 = new Exercitiul4();
        char[] sir = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        exercitiul4.setSirDeCaractere(sir);
        exercitiul4.iteratia();


// Ex. 5
        Exercitiul5 exercitiul5 = new Exercitiul5();
        double[] sir = {4.5, 10.0, 16.2, 25.3, 2.4, 4.63, 4.51, 1, 80.123, 101.23};
        exercitiul5.setSirDeNumere(sir);
        exercitiul5.comparareNumere();

// Ex. 6
        Exercitiul6 exercitiul6 = new Exercitiul6();
        char[] sir = {'a','b','c','d','e','f','g','h','i'};
        exercitiul6.iterareIndexi();

// Ex. 7
        Exercitiul7 exercitiul7 = new Exercitiul7();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(35);
        lista.add(123);
        lista.add(156);
        lista.add(4);
        exercitiul7.setListaDeNumere(lista);
        Exercitiul7.sumaNumerelor();



// Ex. 8
        String[] array = new String[10];
        ArrayList<String> lista = new ArrayList<>();
        Exercitiul8 exercitiul8 = new Exercitiul8();
        exercitiul8.Ex8();

    }
}