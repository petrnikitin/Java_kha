import java.util.Arrays;

public class Test5Arrays {
    public static void main(String[] args) {
        int a;
        int[] numbers; //хранит только адрес (где), но не сам объект
        // new // выделение памяти нужного размера в КУЧЕ
        // выделить память под целочисленный массив размером в 10 элементов
       // new int[10];
        numbers = new int[10];
        numbers[0] = 3;
        numbers[5] = 2342;

        System.out.println(Arrays.toString(numbers));

        int[]  numbers2;
        numbers2 = numbers;

        numbers2[1] = 111;
        System.out.println(Arrays.toString(numbers));

        int[] numbers3 = {23, 235, 234};

        String[] names = new String[20];
        names[0] = "Yura";
        names[1] = "Sveta";

        // itar + Tab



        for (int i = 0; i <names.length ; i++) { // Длина массива (20)
            System.out.println(names[i]);

        }
    }
}
