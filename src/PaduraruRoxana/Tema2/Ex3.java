package PaduraruRoxana.Tema2;
import java.util.Arrays;
public class Ex3 {
           public static void main(String[] args) {

            int[][] array = {{1,2,3,4,5},{91,81,71}};

            for (int[] row : array) {
                for (int element : row) {
                    System.out.print(element + " ");
                }


                int primulElement = array[0][0];

                System.out.println(array[0][0]);
                System.out.println(array[array.length - 1][0]);


            }
        }


    }

