package DianaLuca.Tema2;

public class Exercitiul3T2 {

    public static void main(String[] args) {

        int[][] sirulMeu = {{29, 40, 11},{2, 15, 89, 36, 100}};
        for(int i = 0; i < sirulMeu.length; i++){
            for(int j = 0; j < sirulMeu[i].length; j++){
                System.out.printf("%2d ", sirulMeu[i][j]);
            }
            System.out.println();
        }
        System.out.println("Primul si ultimul element din prima dimensiune: " + sirulMeu[0][0] + " " + sirulMeu[0][2]);
        System.out.println("Primul si ultimul element din a 2 a dimensiune: " + sirulMeu[1][0] + " " + sirulMeu[1][4]);

    }

}
