package by.htp.les05.main;

public class ArrayTwelve {
    public static void main(String[] args) {

        int n = 6;
        int m = 6;
        int[][] array = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                array[i][j] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("{%2d}", array[i][j]);
            }
            System.out.println();
        }


    }


}
