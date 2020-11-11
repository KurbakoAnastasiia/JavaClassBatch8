package Class20;

public class C extends B {
    double extraSale = 0.8;

    public static void main(String[] args) {
        C book = new C();
        book.lastPrice = book.retailPrice * book.discount * book.extraSale;
        System.out.println(book.lastPrice);
    }
}
