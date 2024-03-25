package DianaLuca.Tema1;
import java.util.Scanner;

public class Exercitiul6 {

    public static void main(String[] args) {
        metoda();
    }
    public static void metoda(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar:");
        int numar1 =scanner.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int numar2 = scanner.nextInt();

        System.out.println(numar1);
        System.out.println(numar2);
    }

}
