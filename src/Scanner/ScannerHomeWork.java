package Scanner;

import java.util.Scanner;

public class ScannerHomeWork {
    public static void main(String[] args) {
        int a, b;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        while (true) {
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();

                System.out.println("И последнее!");
                b = scanner.nextInt();
                System.out.println(reSults(a, b));
                break;

            } else {
                System.out.println("Вы ввели что-то другое");
                String temp = scanner.nextLine();


            }
        }


    }

    private static int reSults(int a, int b) {
        int res = 0;
        if (a > 0 & b < 0 | a < 0 & b > 0) {
            res = a * b;
        } else {
            if (a > b & a>0 & b>0) {
                res = a - b;
            } else {
                if (a < 0 & b < 0) {
                    res = a + b;
                } else {
                    res = a % b;
                }
            }
        }

        return res;
    }
}
