import java.sql.SQLOutput;

public class TestWhilefor {
    public static void main(String[] args) {
        //testIf();
        //testSwitch();
        //testWhile();
        //testDoWhile();
        testFor();

    }

    static void testFor() {

        for (int x = 0; x < 20; x++){
            System.out.println(x);
        }
        // fori+Tab

    }

    static void testDoWhile() {
        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x < 20);

    }

    static void testWhile() {
        int x = 0;
        while (x < 20) {
            System.out.println(x);
            //x = x + 1; // */ +- =
            //x += 1;
            x++;
        }
    }

    static void testSwitch() {
        int grade = 5;

        /*
        использовать как переключатель переменную grade
        в случае, если в ней хранится 5, то сделать то-то
        в случае, если в ней хранится 4, то сделать то-то
        в случае, если в ней хранится 3, то сделать то-то

         */
        switch (grade) {
            case 5:
                System.out.println("Best");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Normal");
                break;
            case 2:
            case 1:
                System.out.println("Bad");
                break;
            default:
                System.out.println("Все остальное");
        }
    }

    static void testIf() {
        int  hp = 100;
        int damage = 50;
        /* если hp <= damage тогда
        убит
         */
        if (hp <= damage){
            System.out.println("killed");
        } else {
            System.out.println("wounded");
        }
    }


}
