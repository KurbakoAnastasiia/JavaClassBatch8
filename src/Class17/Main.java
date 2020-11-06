package Class17;

public class Main {
    public static void main(String[] args) {
        Student qasim = new Student();
        qasim.name = "Qasim";
        qasim.age = 30;
        qasim.marks = 90;
       qasim.numberOfStudentsEnrolled++;
       qasim.StudentsReqistered();

        Student danilo = new Student();
        danilo.name = "Danilo";
        danilo.age = 30;
        danilo.marks = 95;
        danilo.numberOfStudentsEnrolled++;
danilo.StudentsReqistered();
        Student ilya = new Student();
       ilya.name = "Ilya";
        ilya.age = 38;
        ilya.marks = 90;
        ilya.numberOfStudentsEnrolled++;
        ilya.StudentsReqistered();


        Variables variables=new Variables();
        Variables var2=new Variables();
        variables.varsDemo();
        variables.varsDemo1();
}
}
