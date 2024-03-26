package BiancaJianu.Tema2;

public class T2Exercitiul6 {
    public static void main(String[] args) {

        // Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere). Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.

        int[] array = {4, 6, 5, 2, 1, 7, 9, 3, 8};

        for (int i = 0; i < array.length;i++){
            if (i == 2){
                System.out.println("2");
                continue;
            }
            if (i == 7){
                System.out.println("7");
                break;
            }
            System.out.println("Index valid");
        }
    }
}
