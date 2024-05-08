/*  ex8.  Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
fie 12 si 2:

        public class Solution {

        public static void main(String[] args) {

int x = 2;*

int y = 12;*

// y = x * y;*

// y = x + y;*

x = y - x;*

y = y - x;*

System.out.println(x);*

System.out.println(y);*
}
    }  */

public class Java1_ex8 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }

}
