package Class13;

public class BankApplication {
    public static void main(String[] args) {
        Account burjusAccount = new Account();
        burjusAccount.accountID = "123";
        burjusAccount.userName = "Burju";
        burjusAccount.password = "pass123";
        burjusAccount.balance = 10000000;
        burjusAccount.typeOfAccount = "checking";
        burjusAccount.limit = 125;

        boolean isLoggedIn = burjusAccount
                .login("Burju", "pass123");
        if (isLoggedIn) {
            System.out.println("Welcome to Syntax bank");
        } else {
            System.out.println("invalid user name or password");
        }


        double amountToTransfer = burjusAccount.amountTransfer(1000);
        if (amountToTransfer == 0) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println(amountToTransfer + " Transferred");
        }


    }
}
