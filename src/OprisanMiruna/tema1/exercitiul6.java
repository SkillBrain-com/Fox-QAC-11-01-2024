package OprisanMiruna.tema1;

import java.util.Scanner;

public class exercitiul6 {
    public static void main(String[] args) {
        metoda();
    }
    public static void metoda(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int scannerNumar1 = scanner.nextInt();

        System.out.println("Introduceti al doilea numar: ");
        int scannerNumar2 = scanner.nextInt();
        System.out.println("Numarul 1 este " + scannerNumar1 + ".  " + "Numarul 2 este " + scannerNumar2);
    }
}
