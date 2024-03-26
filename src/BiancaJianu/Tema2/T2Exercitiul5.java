package BiancaJianu.Tema2;

public class T2Exercitiul5 {
    public static void main(String[] args) {

        // Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”

        double[] array = {4.5, 2.5, 7.4, 2.7, 1.9, 5.3, 9.8};

        for(int i = 0; i < array.length;i++){
            if(array[i] == 4.5){
                System.out.println(array[i]);
            } else if(array[i] > 5){
                System.out.println("Element peste 5");
            }
        }
    }
}
