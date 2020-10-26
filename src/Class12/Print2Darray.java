package Class12;

import java.sql.SQLOutput;

public class Print2Darray {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int sum = 0;
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                sum += a[j][i];

            }
            System.out.println(sum);
            sum = 0;
        }

    }
    }


