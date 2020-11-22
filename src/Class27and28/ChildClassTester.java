package Class27and28;

public class ChildClassTester {
    public static void main(String[] args) {
        MyInterface myInterface = new ChildClass();
        myInterface.printInfo();
      //  myInterface.name = "hello"; fields can not be reassigned as they are always final
       // myInterface we call "Interface refference or refference variable" and non primitive
    }
}
