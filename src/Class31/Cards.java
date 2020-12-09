package Class31;

public class Cards {
}

class Mastercard extends Card {

    public Mastercard(String cardType, double amount) {
        super(cardType, amount);
    }

    @Override
    double cashBack(double cost) {
        return cost * 0.01;
    }
}

class Visa extends Card {

    final double cashBackPercent = 0.01;

    public Visa(String cardType, double amount) {
        super(cardType, amount);
    }

    @Override
    double cashBack(double cost) {
        return cost * cashBackPercent;
    }
}
class AmericanExpress extends Card {

    public AmericanExpress(String cardType, double amount) {
        super(cardType, amount);
    }

    @Override
    double cashBack(double cost) {
        double cashBackPercent;
        if(cost > 1000.0) {
           cashBackPercent = 0.05;
        } else {
           cashBackPercent = 0.03;
        }
        return cost * cashBackPercent;
    }
}


