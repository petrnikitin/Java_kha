package io.khasang.oop_lessons.seabattle_withiout_oop;

import java.util.Scanner;

// 1 Шаг - понять предметную область классы - корабль

public class SeaBattle {
    public static void main(String[] args) { doGame();}

    static void doGame() {
        // ....X.....
        char[] cells; // = {'.','.'}
        cells = new char[10];

        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';

        }

        int shipPosition = 4;
        cells[shipPosition] = 'X';

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(cells);
            int shoot = 0;
            while (true) {
                if (scanner.hasNextInt()){
                    shoot = scanner.nextInt();
                    break;
                }else {
                    String temp = scanner.nextLine();
                }
            }
            System.out.println("Ваш выстрел: " + shoot);
            switch (cells[shoot]) {
                case '.':
                    System.out.println("Промах");
                    cells[shoot] = '*';
                    break;
                case 'X':
                    System.out.println("Потопили");
                    cells[shoot] = '#';
                    break;
                case '*':
                    System.out.println("Уже стреляли");
                    break;
            }
        } while (cells[shipPosition] == 'X');
        System.out.println(cells);
    }


}
