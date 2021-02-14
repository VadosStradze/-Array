package by.htp.les05.main;

public class ArrayTen {
    public static void ten() {
        int i = 6;
        int j = 6;
        int z=0;
        int counter = 0;
        int[][] array = new int[i][j];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (30 + 1) - 15);
                System.out.printf("[%3d]", array[i][j]);
                if (i == j && array[i][j] > 0) {
                    counter++;
                }
            }
            System.out.println();
        }
        int[] arr = new int[counter];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                if (i == j && array[i][j] > 0) {
                    arr[z] = array[i][j];
                    z++;
                }
            }
        }
        System.out.println();
        for (int k:arr) {
            System.out.printf("{%3d}",k);
        }
    }
}