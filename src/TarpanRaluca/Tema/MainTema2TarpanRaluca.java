package TarpanRaluca.Tema;

import java.util.Scanner;

public class MainTema2TarpanRaluca {
    Scanner tastatura = new Scanner(System.in);

    //ex1
    { System.out.println("Alegeti un numar intreg:");
    int primulNumar = tastatura.nextInt();
    int alDoileaNumar = 30;
    if(primulNumar >alDoileaNumar)


        System.out.println("Numarul introdus este mai mic decat: " + alDoileaNumar);

    }

    //ex2
    {
        System.out.println("Alegeti doua numere");
        int numarTastatura1 = tastatura.nextInt();
        int numarTastatura2 = tastatura.nextInt();
        System.out.println("Alegeti o initiala intre a,s,i,p,m");
        String caracter = tastatura.next();
        switch (caracter) {
            case "a":
                System.out.println(numarTastatura1 + numarTastatura2);
                break;
            case "s":
                System.out.println(numarTastatura1 - numarTastatura2);
                break;
            case "i":
                System.out.println(numarTastatura1 * numarTastatura2);
                break;
            case "p":
                System.out.println(numarTastatura1 / numarTastatura2);
                break;
            case "m":
                System.out.println(numarTastatura1 % numarTastatura2);
                break;
            default:
                System.out.println("Caracter incorect");

        }
    }

    {   //ex3
        {
            char[] charArray1 = {'a', 'b', 'c', 'd', 'e'};
            char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};


            for (int i = 0; i < charArray1.length; i++) {
                for (int j = 0; j < charArray2.length; j++) {
                    System.out.println(char[i][j]);
                }
            }
        }
    }
        //ex4
    {
        char[] charArray1 = {'a', 'b', 'c', 'd', 'e'};
        char[] charArray2 = {'j', 'k', 'l', 'm', 'n'};


        for (int i = 0; i < charArray1.length; i++) {
            for (int j = 0; j < charArray2.length; j++) {
                System.out.println(charArray1 = new char[]{'b'});
                System.out.println(charArray2 = new char[]{'k'});
            }
        }
    }
        //ex6
    {
        int[] sirDeCaractere = new int[9];
        for(int i = 0; i < sirDeCaractere.length; i++){
            if(i == 2){
                continue;
            }else if (i == 7){
                break;
            }else{
                System.out.println("Index invalid");
            }
        }
    }
        //ex7
    {
        int numar = 57575;
        int count = 0;

        while (numar != 0){
            numar = numar / 10;
            count++;
            System.out.println(count);
        }
    }

    //ex8 - Array-urile si liste-le nu sunt goale, daca nu se defineste o valoare pentru ele, ele iau valoarea 0.
}

