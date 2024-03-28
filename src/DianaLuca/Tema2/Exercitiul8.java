package DianaLuca.Tema2;

import java.util.ArrayList;

public class Exercitiul8 {
    public static void main(String[] args) {
        int[] myArray = new int[5];

        boolean isArrayEmpty = myArray.length == 0;
        System.out.println(isArrayEmpty);

        ArrayList<Integer> myList = new ArrayList();
        boolean isArrayListEmpty = myList.isEmpty();
        System.out.println(isArrayListEmpty);
    }
}
