import java.util.Random;

public class Exercitiul1 {

/* a) Cititi un numar de la tastatura si stocati valoarea lui intr-o variabila.
b) Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
c) Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
afisati mesajul “Numarul introdus este mai mic decat <numar_random>”
(inserati valoarea numarului random generat in textul afisat).   */


    private static int numarDeLaTastatura;
    private static int numarRandom;

    public static void comparareaDatelor(){
        Random random = new Random();
        numarRandom = random.nextInt(0, 101);

        if(numarDeLaTastatura < numarRandom){
            System.out.println("Numarul introdus este mai mic decat" + numarRandom);
        }
    }

    public static void setNumarDeLaTastatura(int numarDeLaTastatura) {
        Exercitiul1.numarDeLaTastatura = numarDeLaTastatura;
    }
}