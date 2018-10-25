package Scanner;

import java.io.BufferedReader;
import java.util.Scanner;

public class Test5Scanner {
    public static void main(String[] args) {
        System.out.println("test");
        //System.in.read();
  //      BufferedReader bufferedReader;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные");

        int i;
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println(i);
        } else {
            String temp = scanner.nextLine();
            i = scanner.nextInt();
            System.out.println(i);
        }


    }
}
