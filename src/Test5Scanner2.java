import java.util.Scanner;

public class Test5Scanner2 {
    public static void main(String[] args) {
        System.out.println("test");
        //System.in.read();
  //      BufferedReader bufferedReader;
        // CTRL + ALT + T  окружить блоком кода (while)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");

        int i = 0;
        while (true) {
            if (scanner.hasNextInt()){
                i = scanner.nextInt();
                break;

            } else {
                String temp = scanner.nextLine();

            }
        }
        System.out.println(i);


    }
}
