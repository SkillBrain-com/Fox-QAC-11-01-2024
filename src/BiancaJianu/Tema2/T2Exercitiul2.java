package BiancaJianu.Tema2;

import java.util.Scanner;

public class T2Exercitiul2 {
    public static void main(String[] args) {

/* Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
  -‘a’: adaugare
  -‘s’: scadere
  -‘i’: inmultire
  -‘p’: impartire
  -‘m’: modul
  Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un caracter ('a', 's', 'i', 'p', 'm'): ");
        char caracter = scanner.next().charAt(0);

        System.out.print("Introduceti primul numar: ");
        double numar1 = scanner.nextDouble();

        System.out.print("Introduceti al doilea numar: ");
        double numar2 = scanner.nextDouble();

        double rezultat;

        switch (caracter) {
            case 'a':
                rezultat = numar1 + numar2;
                System.out.println("Rezultatul adunarii este: " + rezultat);
                break;
            case 's':
                rezultat = numar1 - numar2;
                System.out.println("Rezultatul scaderii este: " + rezultat);
                break;
            case 'i':
                rezultat = numar1 * numar2;
                System.out.println("Rezultatul inmultirii este: " + rezultat);
                break;
            case 'p':
                rezultat = numar1 / numar2;
                System.out.println("Rezultatul impartirii este: " + rezultat);
                break;
            case 'm':
                rezultat = numar1 % numar2;
                System.out.println("Rezultatul modular este: " + rezultat);
                break;
            default:
                System.out.println("Caracterul introdus nu este valid. Va rugam introduceti unul dintre caracterele 'a', 's', 'i', 'p', 'm'.");

        }
    }
}
