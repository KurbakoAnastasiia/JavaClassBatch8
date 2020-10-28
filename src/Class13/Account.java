package Class13;

public class Account {

        String accountID;
        String userName;
        String password;
        double balance;
        String typeOfAccount;
        double limit;
        boolean isBlocked;

        boolean login(String enteredUserName, String enteredPassword) {
                if (userName.equals(enteredUserName) && password.equals(enteredPassword)) {
                        return true;
                } else {
                        return false;
                }
        }

        double amountTransfer(double amountToTransfer) {
                if (amountToTransfer < balance) {
                       return balance = balance - amountToTransfer;
                } else {
                        return 0;
                }
        }
}




