package by.htp.les05.main;

import java.util.Scanner;

public class ArrayFour {
    public static void d() {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        System.out.println("Введите количество столбцов:");
        System.out.print("> ");
        j = scanner.nextInt();
        System.out.println("Введите количество строк");
        System.out.print("> ");
        i = scanner.nextInt();
        if (i % 2 != 0 || j % 2 != 0) {
            System.out.println("Только четные числа!");
            System.exit(0);
        }

        int count = 0;
        int[][] array = new int[i][j];
        for (i = 0; i < array.length; i++) {
            int length = array.length + 1;
            if (i % 2 == 0) {
                for (j = 0; j < array[i].length; j++) {
                    array[i][j] = count;
                    array[i][j]++;
                    count = array[i][j];
                    System.out.printf("[%1d]", array[i][j]);
                }
                count = 0;
            } else {
                for (j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = length;
                    array[i][j]--;
                    length = array[i][j];
                    System.out.printf("[%1d]", array[i][j]);
                }
            }
            System.out.println();
        }
    }
}