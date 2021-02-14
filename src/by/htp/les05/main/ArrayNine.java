package by.htp.les05.main;

public class ArrayNine {
    public static void nine(){
        int i=4;
        int j=4;
        int[][] array = new int[i][j];
        for (i = 0;i< array.length;i++){
            for (j=0;j<array[i].length;j++){
                array[i][j] = (int) Math.pow(j+1, i+1);
                System.out.printf("[%4d]",array[i][j]);
            }
            System.out.println();
        }
    }
}
