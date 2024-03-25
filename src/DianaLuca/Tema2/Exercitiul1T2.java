package DianaLuca.Tema2;
import java.util.Random;
import java.util.Scanner;

public class Exercitiul1T2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numarDeLaTastatura = scanner.nextInt();

        Random randomNumber = new Random();
        int randomInt = randomNumber.nextInt(101);
        System.out.println("Numarul nostru random este: " + randomInt);

        if(numarDeLaTastatura < randomInt){
            System.out.println("Numarul introdus este mai mic decat numarul random generat");
        }else{
            System.out.println("Numarul introdus nu este mai mic decat numarul random generat");
        }
    }
}
