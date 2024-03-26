package BiancaJianu.Tema2;

public class T2Exercitiul3 {
    public static void main(String[] args) {

        // Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente. Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.

        int[][] arrayCuDouaDimensiuni = new int[2][5];
        arrayCuDouaDimensiuni[0][0] = 1;
        arrayCuDouaDimensiuni[0][1] = 2;
        arrayCuDouaDimensiuni[0][2] = 3;
        arrayCuDouaDimensiuni[1][0] = 4;
        arrayCuDouaDimensiuni[1][1] = 5;
        arrayCuDouaDimensiuni[1][2] = 6;
        arrayCuDouaDimensiuni[1][3] = 7;
        arrayCuDouaDimensiuni[1][4] = 8;

        System.out.println("Primele elemente din fiecare dimensiune:");
        System.out.println("Prima dimensiune: " + arrayCuDouaDimensiuni[0][0]);
        System.out.println("A doua dimensiune: " + arrayCuDouaDimensiuni[1][0]);

        System.out.println("Ultimele elemente din fiecare dimensiune:");
        System.out.println("Prima dimensiune: " + arrayCuDouaDimensiuni[0][2]);
        System.out.println("A doua dimensiune: " + arrayCuDouaDimensiuni[1][4]);



    }
}
