package PaduraruRoxana.Tema2;
import java.util.Scanner;
public class Ex2 {
        public static void main(String[] args) {

            metoda();

        }

        public static void metoda(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("introduceti primul numar:");
            int a = scanner.nextInt();
            System.out.println("introduceti al doilea numar:");
            int b = scanner.nextInt();

            char c = scanner.next().charAt(0);


            System.out.println(a);
            System.out.println(b);
            System.out.println("c = "+c);

            switch(c){

                case 'a' :
                    System.out.println(a+b);
                    break;

                case 's' :
                    System.out.println(a-b);

                    break;

                case 'i' :
                    System.out.println(a*b);

                    break;

                case 'p' :
                    System.out.println(a/b);

                    break;

                case 'm' :
                    System.out.println(a%b);

                default:
                    System.out.println("Introduceti un alt caracter");
                    break;

            }

        }
    }

