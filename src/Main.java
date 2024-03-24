import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Imi place Java");
        for(int i=1; i<=6; i++){
            System.out.println("Cursul acesta este foarte fain!");
        }

        int ana = 24;
        int varstaDavid = ana - 6;
        System.out.println("Varsta lui David este: " + varstaDavid);

        Scanner tastatura = new Scanner(System.in);
        System.out.println("Va rugam sa va introduceti numele dvs:");
        String text = tastatura.nextLine();

        numerenorocoase();
        calcule();
        myVariabile();
        comment();
    }


    static void numerenorocoase(){
        Scanner tastatura = new Scanner(System.in);
        System.out.println("Va rugam sa alegeti primul numar norocos:");
        int primulnumar = tastatura.nextInt();
        System.out.println("Va rugam sa alegeti al doilea numar norocos:");
        int aldoileanumar = tastatura.nextInt();
        System.out.println("Numerele dvs norocoase sunt" + ':' + primulnumar + ',' + aldoileanumar);
    }


    static void calcule(){
        Scanner tastatura = new Scanner(System.in);
        System.out.println("Va rugam sa alegeti un numar intreg:");
        int numarintreg = tastatura.nextInt();
        int suma = numarintreg + 5;
        double ptscadere = 12.3;
        double scadere = numarintreg - ptscadere;
        int impartire = numarintreg / 4;
        double deinmultit = -3.2;
        double inmultire = numarintreg * deinmultit;

        System.out.println("Suma numerelor este" + ":" + suma);
        System.out.println("Rezultatul impartirii este" + ":" + impartire);
        System.out.println("Rezultatul scaderii este" + ":" + scadere);
        System.out.println("Rezultatul inmultirii este" + ":" + inmultire);
    }

    static void myVariabile(){
        int z = 200;
        String txt = "I like IT";
        boolean string = true;
        System.out.println (txt + " " + "is" + " " + string);

    }

    static void comment() {

        int x = 2;

        int y = 12;
        //y = x * y;
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);

        System.out.println(y);


    }

}