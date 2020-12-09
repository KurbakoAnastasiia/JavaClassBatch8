package Class31;

public abstract class Insurance {
    /*Create a class Insurance that will have an attribute as
    insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health.
    Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class. */

    String insuranceName;
    Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();
}
