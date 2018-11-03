package io.khasang.oop_lessons.seabattle_with_oop;

import java.util.Scanner;

// 1 Шаг - понять предметную область классы - корабль
// 2 Что должны делать классы
// 3 В главном методе создать экземпляры классов
// 4. Связать классы друг с другом

public class SeaBattle {
    public static void main(String[] args) { doGame();}

    static void doGame() {
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship();
        ship.position = 4;
        field.init();
        field.setShip(ship);

        do {
            field.show();
            int shoot = player.getShoot();
            field.doShoot(shoot);




        } while (field.continueGame());
        field.show();
    }




}