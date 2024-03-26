package BiancaJianu.Tema2;

public class T2Exercitiul4 {
    public static void main(String[] args) {

        // Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea caracter din sir.

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}
