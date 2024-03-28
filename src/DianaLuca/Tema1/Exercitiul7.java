package DianaLuca.Tema1;

import java.util.Scanner;

public class Exercitiul7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul:");
        int numar = scanner.nextInt();

        int adunare = numar +5;
        double scadere = numar - 12.3;
        double inmultire = numar * -3.2;
        int impartire = numar / 4;
        int modul = numar % 6;

        System.out.println(adunare);
        System.out.println(scadere);
        System.out.println(inmultire);
        System.out.println(impartire);
        System.out.println(modul);

    }
}
