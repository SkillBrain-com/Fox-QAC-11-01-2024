package Mentor.ConditionalStatements;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar:");

        int numar = scanner.nextInt();
        if(numar % 2 == 0){
           System.out.println("Numarul este par");
        }else {
            System.out.println("Numarul este impar");
        }
        int primulNumarDeComparat = scanner.nextInt();
        int alDoileaNumarDeComparat = scanner.nextInt();
        int altreileaNumarDeComparat = scanner.nextInt();

        if(primulNumarDeComparat > alDoileaNumarDeComparat){
            if(primulNumarDeComparat > altreileaNumarDeComparat){
                System.out.println("Numarul cel mai mare este" + primulNumarDeComparat);
            }
        }
        if(alDoileaNumarDeComparat > primulNumarDeComparat){
            if(alDoileaNumarDeComparat > altreileaNumarDeComparat){
                System.out.println("Numarul cel mai mare este" + alDoileaNumarDeComparat);
            }
        }
        if (altreileaNumarDeComparat > primulNumarDeComparat){
            if (altreileaNumarDeComparat > alDoileaNumarDeComparat){
                System.out.println("Numarul cel mai mare este" + altreileaNumarDeComparat);
            }
        }

        if(primulNumarDeComparat > alDoileaNumarDeComparat && primulNumarDeComparat > altreileaNumarDeComparat){
            System.out.println("Numarul cel mai mare este" + primulNumarDeComparat);
        } else if (alDoileaNumarDeComparat > primulNumarDeComparat && alDoileaNumarDeComparat > altreileaNumarDeComparat) {
            System.out.println("Numarul cel mai mare este" + alDoileaNumarDeComparat);
        } else if (altreileaNumarDeComparat > primulNumarDeComparat && altreileaNumarDeComparat > alDoileaNumarDeComparat) {
            System.out.println("Numarul cel mai mare este" + altreileaNumarDeComparat);
        }

        float input = scanner.nextFloat();

        if(input > 0){
            if (input<1){
                System.out.println("pozitiv small");
            } else if (input > 1000000) {
                System.out.println("pozitiv large");
            }else {
                System.out.println("pozitiv");
            }
        } else if (input < 0) {
            if(Math.abs(input) < 1){
                System.out.println("negativ small");
            } else if (Math.abs(input) > 1000000) {
                System.out.println("negativ large");
            }else {
                System.out.println("negativ");
            }
        }else {
            System.out.println("zero");
        }

        String variabila = (input > 8) ? "input mai mare ca 8" : "input mai mic decat 8";

        if(input > 8){
            variabila = "input mai mare ca 8";
        }else {
            variabila = "input mai mic decat 8";
        }

        int zi = scanner.nextInt();

        switch (zi){
            case 1:
                System.out.println("luni");
                break;
            case 2:
                System.out.println("marti");
                break;
            case 3:
                System.out.println("miercuri");
                break;
            case 4:
                System.out.println("joi");
                break;
            case 5:
                System.out.println("vineri");
                break;
            case 6:
                System.out.println("sambata");
                break;
            case 7:
                System.out.println("duminica");
                break;
            default:
                System.out.println("zi invalida");
        }
    }
}
