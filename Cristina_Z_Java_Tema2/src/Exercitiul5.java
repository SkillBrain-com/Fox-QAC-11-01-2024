public class Exercitiul5 {
    /*Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai mare decat 5, afisati mesajul “Element peste 5” */

    private static double[] sirDeNumere = new double[10];

    public static void setSirDeNumere(double[] sirDeNumere) {
        Exercitiul5.sirDeNumere = sirDeNumere;}

    public static void comparareNumere(){
        for(int i=0; i<sirDeNumere.length; i++){
            if(sirDeNumere[i] == 4.5){
                System.out.println(sirDeNumere[i]);
            }
            else if(sirDeNumere[i] > 5){
                System.out.println("Element peste 5");
            }
        }
    }


}