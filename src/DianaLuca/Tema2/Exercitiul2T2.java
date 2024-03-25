package DianaLuca.Tema2;
import java.util.Scanner;

public class Exercitiul2T2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar: " );
        int numar1 = scanner.nextInt();
        System.out.println("Introduceti al doilea numar: " );
        int numar2 = scanner.nextInt();

        System.out.println("Introduceti caracterul: " );
        char caracter = scanner.next().charAt(0) ;

        switch (caracter){
            case 'a':
                int adaugare = numar1 + numar2 ;
                System.out.println(adaugare);
                break;
            case 's':
                int scadere = numar1 - numar2;
                System.out.println(scadere);
                break;
            case 'i':
                int inmultire = numar1 * numar2;
                System.out.println(inmultire);
                break;
            case 'p':
                double impartire = (double) numar1 / numar2;
                System.out.println( impartire);
                break;
            case 'm':
                int modul = numar1 % numar2;
                System.out.println(modul);
                break;
            default:
                System.out.println("Caracterul introdus este invalid");
        }
    }
}
