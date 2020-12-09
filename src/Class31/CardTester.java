package Class31;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        Card card1 = new Mastercard("Student", 2500.00);
        Card card2 = new Visa("Travel", 600.00);
        Card card3 = new AmericanExpress("Business", 300000.00);
        LinkedList<Card> cards = new LinkedList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        for (int i = 0; i < cards.size(); i++) {
            System.out.println("The amount on your account: " + cards.get(i).getAmount());
            System.out.println("Your card is " + cards.get(i).getCardType() + " card");
            cards.get(i).purchase(680);
            cards.get(i).cashBack(1010);
        }

        for (Card card : cards) {
            System.out.println("The amount on your account: " + card.getAmount());
            System.out.println("Your card is " + card.getCardType() + " card");
            card.purchase(680);
            card.cashBack(1010);
        }

        Iterator<Card> iterator = cards.iterator();
        while(iterator.hasNext()) {
            Card card = iterator.next();
            System.out.println("The amount on your account: " + card.getAmount());
            System.out.println("The amount on your account: " + card.getCardType());
            card.purchase(789);
            card.cashBack(350);
        }

    }
}
