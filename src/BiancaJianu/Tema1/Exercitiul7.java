package BiancaJianu.Tema1;

import java.util.Scanner;

public class Exercitiul7 {
    public static void main(String[] args) {

/*Scrieti un program incare cititi de la tastatura un numar, si
    calculati:
            - rezultatul sumei cu 5
            - rezultatul scaderii cu 12.3
            - rezultatul inmultirii cu -3.2
            - rezultatul impartirii cu 4
            - rezultatul modulului cu 6*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti un numar:");
        int numar1 = scanner.nextInt();

        System.out.println("rezultatul sumei cu 5 este:" + (numar1 + 5));
        System.out.println("rezultatul scaderii cu 12.5 este:" + (numar1 - 12.5));
        System.out.println("rezultatul inmultirii cu -3.2 este:" + (numar1 * -3.2));
        System.out.println("rezultatul impartirii cu 4 este:" + (numar1 / 4));
        System.out.println("rezultatul modulului cu 6 este:" + (numar1 % 6));



    }
}
