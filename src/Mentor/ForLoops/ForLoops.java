package Mentor.ForLoops;

import java.util.ArrayList;

public class ForLoops {
    public static void main(String[] args) {
        //Array
        int[] sir={10051545, 2,3,4 ,6,23};
        int[] sir2 = new int[6];
        sir2[1] = 17;
        sir2[4] = 10;
        sir2[2] = 19;
        sir2[1] = 268;

        //ArrayList
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(16);
        lista.add(23);
        lista.add(80);

        lista.set(1, 98);
        lista.remove(2);

        lista.clear();

//        for(int i = 0; i< sir.length; i++){
//            System.out.println(sir[i]);
//        }
//
//        for (int i = 0; i < sir2.length; i++){
//            System.out.println(sir2[i]);
//        }
//        for (int i = 0; i<lista.size();i++){
//            System.out.println(lista.get(i));
//        }

//        for (int i = 0; i>-7;i++){
//            System.out.println("infinit");
//        }

//        for (int i = 0; i<500;i++){
//            System.out.println("afisez");
//        }

        int[][] nume =new int[3][3];
        nume[0][0] = 18;
        nume[0][1] = 98;
        nume[1][0] = 73;
        nume[2][2] = 98;

        //18 | 98 | 0 |
        //73 | 0 | 0 |
        //0 | 0 | 98

        for(int i =0;i < nume.length;i++){
            for(int j = 0;j < nume[i].length;j++){
                System.out.println(nume[i][j]);
            }
        }
    }
}
