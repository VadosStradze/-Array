package by.htp.les05.main;

public class ArrayEight {
    public static void h(){
        int i = 6;
        int j= 6;
        int [][]array = new int[i][j];
        for (i=0;i< array.length;i++){
            for (j=0;j< array[i].length;j++){
                array[i][j]= i+j+1;
                if (array[i][j]> array.length){
                    array[i][j]=0;
                }
                System.out.printf("[%2d]",array[i][j]);
            }


            System.out.println();
        }
    }
}
