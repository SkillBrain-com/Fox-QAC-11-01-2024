package OprisanMiruna.tema2;

import java.util.Arrays;

public class exercitiul9 {


        public static void main(String[] args){
            int numere[]={2,3,4,5,10,45,15,34,6,7,8,9};
            int l = numere.length;
            int i;

            System.out.println();
            Arrays.sort(numere);
            System.out.print("Sortarea crescatoare este: ");
            for(i=0;i< l;i++){
                System.out.print(numere[i] + " ");
            }
        }
    }

