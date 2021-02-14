package by.htp.les05.main;

import java.util.Scanner;

public class ArrayFive {
    public static void e() {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        System.out.println("Введите размер квадратной матрицы:");
        System.out.print("> ");
        while (scanner.hasNextInt() == false) {
            System.out.println("Введите четное число!");
            scanner.nextLine();
            System.out.print("> ");
        }
        i = scanner.nextInt();
        if (i % 2 != 0) {
            while (i % 2 != 0) {
                System.out.println("Введите четное число!");
                i = scanner.nextInt();
            }
        }
        j = i;
        //int i = scanner.nextInt();
        int[][] array = new int[i][j];
        int count = array.length - 1;
        int length = 1;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                if (j == count) {
                    array[i][j] = length;
                    length++;
                    count--;
                }
                System.out.printf("[%3d]", array[i][j]);
            }
            System.out.println();
        }
    }
}
