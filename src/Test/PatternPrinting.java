package Test;

public class PatternPrinting {
    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 8 - i; j++) {

                if (i != 7) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("");
                }
            }
            for (int k = 1; k < i - 5; k++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }
    }
}

