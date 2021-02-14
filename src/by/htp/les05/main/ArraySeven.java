package by.htp.les05.main;

public class ArraySeven {
    public static void g() {
        int i = 6;
        int j = 6;
        //int count = 1;

        int[][] array = new int[i][j];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                //array[i][j] = count;
                array[i][j]= (array.length-1-i>=j) ? i+1:0;
                System.out.printf("[%2d]", array[i][j]);
            }
            //count++;
            System.out.println();
        }
        System.out.println();
        /*for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j]= (array.length-1-i>=j) ? i+1:0;
                System.out.printf("[%2d]", array[i][j]);
            }
            System.out.println();
        }*/
    }
}
