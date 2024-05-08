/*  ex6. Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le
stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.  */

import java.util.Scanner;

public class Java1_ex6 {
    public static void main(String[] args) {
        metoda();
    }

    public static void metoda(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar");
        int numar1 = scanner.nextInt();
        System.out.println("Introduceti al doilea numar");
        int numar2 = scanner.nextInt();

        System.out.println(numar1);
        System.out.println(numar2);
    }
}
