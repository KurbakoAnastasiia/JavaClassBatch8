package Class23;

public class Degree {
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
*/
    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree {

}

class Masters extends Degree {
    @Override
    public void getPrerequisite() {
        System.out.println("To get a degree you need bachelors diploma");
    }
}

class Test {
    public static void main(String[] args) {
       Degree obj1 = new Degree();
       Bachelors obj2 = new Bachelors();
       Masters obj3 = new Masters();
       obj1.getPrerequisite();
       obj2.getPrerequisite();
       obj3.getPrerequisite();
    }
}
