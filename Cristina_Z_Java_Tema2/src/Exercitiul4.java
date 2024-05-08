public class Exercitiul4 {
    /* Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea caracter din sir.   */

    private static char[] sirDeCaractere = new char[9];
    public static void setSirDeCaractere(char[] sirDeCaractere){
        Exercitiul4.sirDeCaractere = sirDeCaractere;
    }

    public static void iteratia(){
        for(int i=0; i<sirDeCaractere[i]; i+=2){
            System.out.println(sirDeCaractere[i]);}

    }
}