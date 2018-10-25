package Scanner;

import java.util.Scanner;

public class TestScannerdiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int i = scanner.nextInt();
        scanner.nextLine();
        System.out.println(i);
        System.out.println("введите строку");
        String s = scanner.nextLine();
        System.out.println(s);

    }
}
