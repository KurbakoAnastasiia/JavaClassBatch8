package Class29;

public class PersonTester {
    public static void main(String[] args) {
        Person davitObj = new Person("Davit", "1729137196193", 25, 30000);
        Person mikeObj = new Person("Mike", "34723754", 30, 750);
        // System.out.println(davitObj.taxPaid);
        // davitObj.taxPaid = 0; // CE cannot access and modify data
        // System.out.println(davitObj.taxPaid);

        davitObj.setTaxPaid("1729137196193", 0);
        System.out.println(davitObj.getTaxPaid("27342825838"));
        System.out.println(davitObj.getTaxPaid("1729137196193"));

        //Mike
        System.out.println(mikeObj.getTaxPaid("34723754"));
    }
}
