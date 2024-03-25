package OprisanMiruna.tema2;

import java.util.Random;
import java.util.Scanner;

public class exercitiul1 {
    private static int numarDeLaTastatura;

    public static void main(String[] args) {

        int numarRandom;
    }



        public static void setNumarDeLaTastatura ( int numarDeLaTastatura){
            exercitiul1.numarDeLaTastatura = numarDeLaTastatura;
            Scanner scanner = new Scanner(System.in);
        }

        public static void setNumarRandom () {
        int numarRandom;

            Random random = new Random();
            numarRandom = random.nextInt(0, 101);

            if (numarDeLaTastatura < numarRandom) {
                System.out.println(" Numarul introdus este mai mic decat " + numarRandom);
            }


        }
    }
