package ReviewClass04;

import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        String[][][] arr3d = new String[2][2][3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr3d.length; i++) {
            for (int j = 0; j < arr3d[i].length; j++) {
                for (int z = 0; z < arr3d[i][j].length; z++){
                    System.out.println("Please enter a name: ");
                    arr3d[i][j][z] = scan.nextLine();
                }
            }
        }

        for (String[][] arr2d : arr3d) {
            for (String [] arr : arr2d) {
                for (String value : arr) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
