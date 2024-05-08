public class Exercitiul2 {
/*Cititi un caracter si 2 numere de la tastatura, si stocati-le in variabile.
Folosind structura switch, daca s-a introdus un caracter anume, realizati
operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:-‘a’:
adaugare-‘s’: scadere-‘i’: inmultire-‘p’: impartire-‘m’: modulDaca nu s-a
introdus un caracter valid, afisati un mesaj de eroare. */

    private static char operatia;
    private static double numarul1;
    private static double numarul2;

    public static void setOperatia(char operatia) {
        Exercitiul2.operatia = operatia;}

    public static void setNumarul1(double numarul1) {
        Exercitiul2.numarul1 = numarul1;}

    public static void setNumarul2(double numarul2) {
        Exercitiul2.numarul2 = numarul2;}

    public static void operatii(){
        switch(operatia){
            case 'a':
                System.out.println(numarul1 + numarul2);
                break;
            case 's':
                System.out.println(numarul1 - numarul2);
                break;
            case 'i':
                System.out.println(numarul1 * numarul2);
                break;
            case 'p':
                System.out.println(numarul1 / numarul2);
                break;
            case 'm':
                System.out.println(numarul1 % numarul2);
                break;

            default:
                System.out.println("Caracter invalid");}

    }

}