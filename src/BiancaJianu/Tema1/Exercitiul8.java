package BiancaJianu.Tema1;

public class Exercitiul8 {
    public static void main(String[] args) {

        //Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa fie 12 si 2

        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

    }
}
