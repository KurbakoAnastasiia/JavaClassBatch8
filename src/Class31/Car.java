package Class31;

public class Car extends Insurance {

    String carModel;
    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;

    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + " for " + carModel + " is approved!!");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Your " + insuranceName + " insurance for " + carModel + " is canceled");
    }
}
