package OprisanMiruna.tema2;

public class exerticiul3 {
    public static void main(String[] args) {

        int[][] nume = new int[3][5];
        nume[0][0] = 18;
        nume[0][4] = 98;
        nume[1][0] = 73;
        nume[1][4] = 56;
        nume[2][0] = 32;
        nume[2][4] = 5;






        for (int i = 0; i < nume.length; i++) {
            System.out.println();
            for (int j = 0; j < nume[i].length; j++) {
                System.out.printf( "%2d",nume[i][j]);
            }
        }
    }
}