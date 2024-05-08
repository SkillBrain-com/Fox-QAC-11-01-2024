public class Exercitiul6 {
    /* Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere). Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.*/

    private static char[] sirDeCaractere = new char[9];

    public static void setSirDeCaractere(char[] sirDeCaractere) {
        Exercitiul6.sirDeCaractere = sirDeCaractere;}

    public static void iterareIndexi(){
        for(int i=0; i<sirDeCaractere.length; i++){
            if(i==2){
                continue;
            }
            else if(i==7){
                break;
            }
            else {System.out.println("Index valid");}
        }

    }
}