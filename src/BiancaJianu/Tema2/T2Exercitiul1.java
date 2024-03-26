package BiancaJianu.Tema2;

import java.util.Random;
import java.util.Scanner;

public class T2Exercitiul1 {
    public static void main(String[] args) {
// Citit un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila. Daca numarul introdus de la tastatura este mai mic decat numarul random generat, afisati mesajul “Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random generat in textul afisat).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar:");

        int numar1 = scanner.nextInt();
        System.out.println("Numarul introdus este: " + numar1);

        Random random = new Random();


        int randomNumber = random.nextInt(101);
        System.out.println("Numarul random generat este: " + randomNumber);

        if (numar1 < randomNumber){
            System.out.println("Numarul introdus " + numar1 + " este mai mic decat numarul random generat " + randomNumber);
        }

    }
}
