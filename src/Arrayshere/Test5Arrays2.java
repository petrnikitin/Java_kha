package Arrayshere;

public class Test5Arrays2 {
    public static void main(String[] args) {
        char[][] cells;
        cells = new char[3][3];

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                cells[j][i] = '.';

            }

        }

        cells[0][1] = 'X';


        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(cells[column][row]+ " ");

            }
            System.out.println();

        }
    }
}



// X 0 X
// X 0 X
// X 0 X
