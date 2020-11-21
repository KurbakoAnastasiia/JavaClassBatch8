package Class26;

public class Finalrepl {

    public static void main(String[] args) {
        int[] a = {2, 7, 3, 8, 4};
        System.out.println(avgElements(a)); //should print 4.8
    }

   static final double avgElements(int[] arr) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        average = sum / arr.length;
        return average;
    }
}