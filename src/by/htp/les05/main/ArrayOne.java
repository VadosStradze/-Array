package by.htp.les05.main;

public class ArrayOne {
    public static void a() {
        int i;
        int j;
        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (i = 0; i < array.length; i++) {

            for (j = 0; j < array.length; j++) {

                if (i == j) {

                    System.out.println(array[i][j]);

                }
            }
        }
    }
}
