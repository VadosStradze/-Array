package by.htp.les05.main;

public class ArrayThree {
    public static void c() {
        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 3},{4,5,6}};
        for (int i = 0; i < array.length; i++) {
            if (i % 2!=0){
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("[%1d]",array[i][j]);
                }
                System.out.println();
            }else{
                for (int j = array[i].length-1;j>=0;j--){
                    System.out.printf("{%1d}",array[i][j]);
                }
                System.out.println();
            }
        }
    }
}
