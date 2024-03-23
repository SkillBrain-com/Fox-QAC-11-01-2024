package OprisanMiruna.tema1;

import java.util.Scanner;

public class exercitiul7 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int x = myScanner.nextInt();
        int suma = x + 5;
        System.out.println("Adunati cu 5, adunarea este: " + suma);
        double scadere = (double) x - 12.3;
        System.out.println("Scadeti cu 12.3, rezultat dupa scadere este: " + scadere);
        double inmultire = (double) x * -3.2;
        System.out.println("Inmultiti cu -3.2, rezultat dupa inmultire este " + inmultire);
        int impartire = x / 4;
        System.out.println("Impartiti la 4, rezultatul impartirii este " + impartire);
        int restImpartire = x % 6;
        System.out.println("Restul impartirii la 6 este " + restImpartire);
    }
}


