package Class26;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone = new Iphone();
        iphone.call();
        iphone.text();
        iphone.playMusics();
        iphone.takePicture();

        Phone samsung = new Samsung();
        samsung.call();
        samsung.text();
        samsung.playMusics();
        samsung.takePicture();

        Phone[] allPhones = {iphone, samsung};
        for (Phone phone :
                allPhones) {
            phone.call();
            phone.text();
            phone.playMusics();
            phone.takePicture();
        }

       /* Phone[] allPhones = {new Iphone(), new Samsung()};
        for (Phone phone :
             allPhones) {
            phone.call();
            phone.text();
            phone.playMusics();
            phone.takePicture();
        }*/

    }
}
