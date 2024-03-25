package OprisanMiruna.tema2;

import java.util.Scanner;

public class exercitiul2 {

    private static char operatia;

    public static void setOperatia(char operatia) {
        exercitiul2.operatia = operatia;
    }
public static void main(String[] args){

    Scanner scanner= new Scanner(System.in);
    int numar1 = scanner.nextInt();
    int numar2 = scanner.nextInt();




    switch (operatia) {
        case 'a':
            System.out.println(numar1 + numar2);
            break;
        case 's':
            System.out.println(numar1 - numar2);
            break;
        case 'i':
            System.out.println(numar1 * numar2);
            break;
        case 'p':
            System.out.println(numar1 / numar2);
            break;
        case 'm':
            System.out.println(numar1 % numar2);
            break;
        default:
            System.out.println("caracter gresit");
    }


    }
}

