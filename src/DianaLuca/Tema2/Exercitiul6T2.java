package DianaLuca.Tema2;

public class Exercitiul6T2 {

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Value at index " + i + ": " + myArray[i]);
            if (i == 2) {
                continue; // Skip iteration at index 2
            }
            if (i == 7) {
                break; // Stop iteration at index 7
            }
            if(i != 2 && i != 7){
                System.out.println("Index valid");
            }
        }
    }

}
