public class Homework {
    public static void main(String[] args) {
        testProgression(0,5);
    }

    static void testProgression(int a, int b) {
        if (a >= 100){
            System.out.println("Выход");
        } else{
            System.out.println(a);
            testProgression(a + b, b);
        }




    }
}
