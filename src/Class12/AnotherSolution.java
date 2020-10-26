package Class12;

public class AnotherSolution {
    public static void main(String[] args) {
        int[][] nums = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };


        int [] sums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                rowSum += nums[i][j];
            }
            sums[i] = rowSum;
        }

        for(int sum : sums) {
            System.out.println(sum);
        }
    }
}
