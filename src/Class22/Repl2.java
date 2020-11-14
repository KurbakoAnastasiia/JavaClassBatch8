package Class22;

public class Repl2 {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);
        //print the elements from new array
        for (int[] aNew : a) {
            for(int aPr : aNew) {
                System.out.print(aPr + " ");
            }
            System.out.println();
        }

    }
    //create method reduce10 here
    static int[][] reduce10(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array [i][j] -= 10;
            }
        }
        return array;
    }
}
