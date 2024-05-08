// ex4. Scrieti un program in care cititi o propozitie de la tastatura

import java.util.Scanner;

public class Java1_ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti o propozitie");
        String propozitie = scanner.nextLine();
        System.out.println(propozitie);
    }
}
