package DianaLuca.Tema2;

public class Exercitiul5T2 {

    public static void main(String[] args) {

        double[] sir = {4.5, 6, 7.2, 4.5};
        elemente(sir);
    }

    public static void elemente (double[] sir){
        for(double i : sir){
            if( i == 4.5){
                System.out.println(i);
            } if (i > 5) {
                System.out.println("Element peste 5");
            }
        }
    }

}
