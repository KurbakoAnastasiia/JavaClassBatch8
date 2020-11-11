package Class18;

import Class19.Task3;

public class Tester {
    public static void main(String[] args) {
        Tasks test = new Tasks();
        double[] arr = {10.2, 25, 45};
        System.out.println(test.sumArray(arr));

        String abc = Tasks.reversedStr("Java");
        System.out.println(abc);

        Task3 sub6 = new Task3(80000.0);
        System.out.println(sub6.salary);
    }

}
