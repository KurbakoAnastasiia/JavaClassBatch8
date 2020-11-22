package Class29;

public class Student implements PrintInfo, PayFee {
    @Override
    public void printName() {
        System.out.println("Mohamed");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("121382138123");
    }

    @Override
    public void printInfo() {
        System.out.println("bla bla bla");
    }

    @Override
    public void payFee() {
        System.out.println("Paid");
    }
}
