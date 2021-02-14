package by.htp.les05.main;

public class ArrayEleven {
    public static void eleven() {
        int i = 10;
        int j = 20;
        int z = 0;
        int counter = 0;
        int count=0;
        int array[][] = new int[i][j];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 15));
                if (array[i][j] == 5) {
                    counter++;
                    if (counter >= 3) {
                        counter=0;
                        //System.out.print(i + 1);
                        count++;
                    }
                }
                System.out.printf("[%3d]", array[i][j]);
            }
            counter = 0;
            System.out.println();
        }
        int[] arr = new int[count];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    counter++;
                    if (counter >= 3) {
                        counter=0;
                        arr[z] = i+1;
                        z++;
                    }
                }
            }
            counter = 0;
        }
        System.out.println();
        for (int k:arr) {
            System.out.printf("{%3d}",k);
        }
    }
}
