package Class31;

public abstract class Card {
    /*Create a Card class that will have implemented
    and unimplemented methods and a constructor that will initializes credit card type.
    Create 3 subclasses of a Card card.
    Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.*/

    private String cardType;
    private double amount;

    public Card(String cardType, double amount) {
        this.cardType = cardType;
        this.amount = amount;
    }

    public String getCardType() {
        return cardType;
    }

    public double getAmount() {
        return amount;
    }

    void purchase(double purchaseCost) {
        if(purchaseCost < amount) {
            System.out.println("You have enough money for this purchase");
            amount -= purchaseCost;
        } else {
            System.out.println("There are not enough money on your account");
        }
    }

    abstract double cashBack(double cost);

}
