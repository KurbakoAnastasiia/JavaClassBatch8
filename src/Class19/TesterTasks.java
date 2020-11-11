package Class19;

public class TesterTasks {
    public static void main(String[] args) {
        Tasks t1 = new Tasks(10, 67);
        Tasks t2 = new Tasks();

        Students st1 = new Students("John Smith", 93, 90, 91);
        st1.printGradeAverage();
        Students st2 = new Students("Kate Burn", 89, 78, 98);
        st2.printGradeAverage();
        Students st3 = new Students("Bob Dark", 78, 84, 100);
        st3.printGradeAverage();
        Students st4 = new Students("Dayna Merrick", 74, 97, 89);
        st4.printGradeAverage();
        Students st5 = new Students("Nick Nors", 87, 83, 99);
        st5.printGradeAverage();

        Task3 sub4 = new Task3(65);
        System.out.println(sub4.name);
        System.out.println(sub4.age);
        System.out.println(sub4.salary);

        Task3 sub5 = new Task3(80000.0);
        System.out.println(sub5.name);
        System.out.println(sub5.age);
        System.out.println(sub5.salary);
    }
}
