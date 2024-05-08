public class Exercitiul3 {
    /* Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente. Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran. */

    private static int[][] sir = new int[3][5];
    public static void setSir(int[][] sir){
        Exercitiul3.sir = sir;
    }

    public static void afisareElemente(){
        System.out.println(sir[0][0]);
        System.out.println(sir[0][1]);
        System.out.println(sir[0][2]);
        System.out.println(sir[0][3]);
        System.out.println(sir[0][4]);

        System.out.println(sir[1][0]);
        System.out.println(sir[1][1]);
        System.out.println(sir[1][2]);
        System.out.println(sir[1][3]);
        System.out.println(sir[1][4]);

        System.out.println(sir[2][0]);
        System.out.println(sir[2][1]);
        System.out.println(sir[2][2]);
        System.out.println(sir[2][3]);
        System.out.println(sir[2][4]);

    }
}