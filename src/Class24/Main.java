package Class24;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Joe", "Smith", 35, 35000);
        Student st = new Student("Adam", "Smith", 15, 10);
        Retiree ret = new Retiree("Frank", "Smith", 15, "tour");

        e.print();
        st.print();
        ret.print();
    }
}


