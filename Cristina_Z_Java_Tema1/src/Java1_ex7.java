/* ex7. Scrieti un program incare cititi de la tastatura un numar, si
        calculati:

        - rezultatul sumei cu 5

        - rezultatul scaderii cu 12.3

        - rezultatul inmultirii cu -3.2

        - rezultatul impartirii cu 4

        - rezultatul modulului cu 6  */

import java.util.Scanner;

public class Java1_ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numar = scanner.nextDouble();
        System.out.println(numar + 5);
        System.out.println(numar - 12.3);
        System.out.println(numar * -3.2);
        System.out.println(numar / 4);
        System.out.println(numar % 6);
    }

}
