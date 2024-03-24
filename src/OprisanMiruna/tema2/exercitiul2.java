package OprisanMiruna.tema2;

import java.util.Scanner;

public class exercitiul2 {
public static void main(String[] args){

    Scanner numar1 = new Scanner(System.in);
    Scanner numar2= new Scanner(System.in);


    switch () {
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
}
