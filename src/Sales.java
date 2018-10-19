public class Sales {
    public static void main(String[] args) {

        int x;
        int a;
        /*a = 0;
        x = 0;
        a = x++;
        System.out.println(a + " " + x); // a == 0, x == 1
        a = 0;
        x = 0;
        a = ++x;
        System.out.println(a + " " + x); // a == 1, x == 1*/
        a = 0;
        x = 0;
        a = x++ + x++;
        System.out.println(a + " " + x); // a == 1, x == 2
        /*a = 0;
        x = 0;
        a = ++x + ++x;
        System.out.println(a + " " + x); // a == 3, x == 2
        System.out.println("Hello from Sales department");    */

    }
}
