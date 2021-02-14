package by.htp.les05.main;

public class ArrayTwo {
    public static void b() {

        int i;
        int j;
        int k = 0;
        int p = 2;
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (i = 0, j = p; i < array.length; i++) {

            System.out.println(array[i][j]);

            if (i == array.length - 1) {

                System.out.println();

            }
        }

        for (j = 0, i = k; j < array.length; j++) {

            System.out.print(array[i][j] + " ");

        }
    }
}
