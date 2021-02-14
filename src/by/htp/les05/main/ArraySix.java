package by.htp.les05.main;

public class ArraySix {
    public static void f() {
        int i = 6;
        int j = 6;
        int[][] array = new int[i][j];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                if (i == 0 || j==0 || i ==array.length-1 || j== array.length-1) {
                    array[i][j] = 1;
                    System.out.printf("[%2d]", array[i][j]);
                }else {
                    array[i][j]=0;
                    System.out.printf("[%2d]", array[i][j]);
                }
            }
            System.out.println();
        }
    }
}
