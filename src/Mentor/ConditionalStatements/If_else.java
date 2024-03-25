package Mentor.ConditionalStatements;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar");
        int primulNumar = scanner.nextInt();

        System.out.println("Introduceti al doilea numar");
        int alDoileaNumar = scanner.nextInt();

        if((primulNumar % 2) == 0){
            System.out.println("Primul numar este par!");
        } else if (primulNumar % 2 == 1 ) {
            System.out.println("Primul numar este impar!");
        }

        if (alDoileaNumar % 2 == 0) {
            System.out.println("Al doilea numar este par!");
        } else if (alDoileaNumar % 2 == 1) {
            System.out.println("Al doilea numar este impar!");
        }

        int primulNumarComparat = scanner.nextInt();
        int alDoileaNumarComparat = scanner.nextInt();
        int alTreileaNumarComparat = scanner.nextInt();

        if (primulNumarComparat > alDoileaNumarComparat) {
            if (primulNumarComparat > alTreileaNumarComparat) {
                System.out.println("Cel mai mare numar este: " + primulNumarComparat + "!");
            }
        }


        if(alDoileaNumarComparat > primulNumarComparat){
            if(alDoileaNumarComparat > alTreileaNumarComparat){
                System.out.println("Cel mai mare numar este: " + alDoileaNumarComparat + "!");
            }
        }

        if(alTreileaNumarComparat > primulNumarComparat){
            if(alTreileaNumarComparat > alDoileaNumarComparat){
                System.out.println("Cel mai mare numar este: " + alTreileaNumarComparat + "!");
            }
        }

        if(primulNumarComparat > alDoileaNumarComparat && primulNumarComparat > alTreileaNumarComparat){
            System.out.println("Cel mai mare numar este: " + primulNumarComparat + "!");
        }
        if(alDoileaNumarComparat > primulNumarComparat && alDoileaNumarComparat > alTreileaNumarComparat){
            System.out.println("Cel mai mare numar este: " + alDoileaNumarComparat + "!");
        }
        if (alTreileaNumarComparat > primulNumarComparat && alTreileaNumarComparat > alDoileaNumarComparat){
            System.out.println("Cel mai mare numar este: " + alTreileaNumarComparat + "!");
        }

        float input = scanner.nextFloat();

        if(input > 0){
            if(input < 1){
                System.out.println("Pozitiv smalll");
            } else if (input > 1000000) {
                System.out.println("Pozitiv large");
            }else {
                System.out.println("Pozitiv");
            }
        } else if (input < 0) {
            if(Math.abs(input) < 1){
                System.out.println("Negativ small");
            } else if (Math.abs(input) > 1000000) {
                System.out.println("Negativ large");
            }else {
                System.out.println("Negativ");
            }
        }else {
            System.out.println("Zero");
        }

        int input2 = scanner.nextInt();

        if(input2 >0 || input2 < -10){
            System.out.println("Suntem in primul if");
        } else if (input2 > 23 || input2 < 26) {
            System.out.println("Suntem in al doilea If");
        }

//        if conditie ? behaviour if true : behaviour if false
//
//                if(conditie){
//                    behaviour if true
//                }else {
//                    behaviour if false
//                }

        String text =  input2 > 0 ? "numar pozitiv" : "numar negativ";

        System.out.println(text);

    }
}
