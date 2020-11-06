package Class16;

public class HW {

    /*Create a method createEmail().
    Based on values of users name, lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) →johnsnow@gmail.com*/

    public static String createEmail(String name, String lastName, String emailType) {
        String completeEMail = name + lastName + "@" + emailType + ".com";
        return completeEMail;
    }
    /*Write a method to return whether given number is prime or not?*/

    public static boolean isPrime(int num) {

        boolean itIsPrime = true;
        if (num <= 1) {
           return false;

        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    boolean primeIs(int number) {

        if(number <= 1) {
            return false;
        }
        boolean primeIs = true;
        for(int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                primeIs = false;
            }
        }
        return primeIs;
    }
}

