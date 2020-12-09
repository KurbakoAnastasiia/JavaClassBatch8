package Class31;

public class Health extends Insurance {

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + " can offer you follow health insurance. Health insurance depends of your annual income");
    }

    @Override
    void cancelInsurance() {
        System.out.println("You can cancel your insurance any time");
    }
}
