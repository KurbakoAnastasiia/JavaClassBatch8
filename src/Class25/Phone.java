package Class25;

abstract public class Phone {

    public void makeCalls() {
        System.out.println("Pghone makes to call");
    }
    public void sendText() {
        System.out.println("Phone send txt");
    }
    public abstract void viewPicture();
    public abstract void unlock();
}
abstract class Iphone extends Phone {

    @Override
    public void viewPicture() {
        System.out.println("We can checkout the photos using the photos app");
    }

   /* @Override
    public void unlock() {
        System.out.println("unlock with face");
    }*/
}
class IphoneChild extends Iphone {

    @Override
    public void unlock() {
        System.out.println("Can unlock using face");
    }
}
class Samsung extends Phone {

    @Override
    public void viewPicture() {
        System.out.println("Ti view pictures use the Gallary App");
    }

    @Override
    public void unlock() {
        System.out.println("Unlock using the password");
    }
}

