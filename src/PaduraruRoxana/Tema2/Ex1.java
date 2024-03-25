package PaduraruRoxana.Tema2;
import java.util.Scanner;
import java.util.Random;
public class Ex1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            Random random = new Random();

            System.out.println("introduceti primul numar");
            int numar1 = scanner.nextInt();


            int numar2 = random.nextInt(100);
            System.out.println("Random number between 1 and 100: " + numar2);


            if (numar1<numar2){
                System.out.println("Numarul introdus este mai mic decat random");
            }
        }
    }

