package Class31;

public class Pet extends Insurance {
    String petType;
    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("Congrats! Your " + petType + " has now " + insuranceName + " insurance!");
    }
    @Override
    void cancelInsurance() {
        System.out.println("Your " + insuranceName + " insurance for " + petType + " is canceled");

    }
}
