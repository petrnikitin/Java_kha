public class Test1 {
    public static void main(String[] args) {
        // СТЕК
       // testStackOverflow(10);

        byte bt; // 1
        short sh; // 2
        int i = 100; // 4
        long l = 40000000000L; // 8

        float f = 10.2f; // 4
        double d = 10.2; // 8

        boolean b = true; // 4

        char ch = '0'; // 2


        // КУЧА
        // ссылочные типы данных
        // все, что пишем с большой буквы + массивы
        // экземпляры классов

        Byte bt1 = 10;
        Byte bt2 = new Byte((byte) 10);
        Short sh1 = 10;
        Integer in1 = 10;
        Long l1;

        Float f1;
        Double d1;

        Boolean b1;
        Character ch1;

        String s = "hello";

        // "A" - всегда тип String
        // 'A' - всегда тип char
        System.out.println(Integer.MAX_VALUE);
    }



    static void testStackOverflow(){
        System.out.println("No params");
    }

    static void testStackOverflow(int i) {
        //System.out.println(i);
        //testStackOverflow(i + 1);

    }



}
