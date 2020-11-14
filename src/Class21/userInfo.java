package Class21;

public class userInfo extends userClass {
    String userAddress;

    userInfo(String name, String mobileNumber, String userAddress) {

        super(name, mobileNumber);
        this.userAddress = userAddress;
    }

    void userDetails() {
        System.out.println("User name is " + super.name + " has a phone number " + super.mobileNumber + " and lives in " + userAddress);
    }

    public static void main(String[] args) {
        userInfo userInfo = new userInfo("Liya", "38237173913", "Brooklyn, NY");
        userInfo.userDetails();
    }
}
