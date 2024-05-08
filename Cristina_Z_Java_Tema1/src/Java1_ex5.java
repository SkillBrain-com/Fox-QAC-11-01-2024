/*  ex5. Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un String si un boolean,
apoi apelati metoda din metoda “main”  */

public class Java1_ex5 {
    public static void main(String[] args) {
        myVariables();
    }

    public static void myVariables(){
        int a = 24;
        String b = "Java";
        boolean c = true;

        System.out.println(a + " " + b + " " + c);
    }
}
