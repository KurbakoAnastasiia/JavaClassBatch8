package Class26;

public abstract class Phone {

    Phone() {
        System.out.println("Constructors from Phone called");
    }
    public void call() {
        System.out.println("Phone can make calls");
    }
    public void text() {
        System.out.println("Phone can send text");
    }

    public abstract void takePicture();
    public abstract void playMusics();

}

class Iphone extends Phone {

    Iphone() {
        System.out.println("Constructor from Iphone called");
    }
    @Override
    public void takePicture() {
        System.out.println("Can take good pictures in low light");
    }

    @Override
    public void playMusics() {
        System.out.println("Iphone can play music using Apple store");
    }
    public void faceTime() {
        System.out.println("I have facetime for video calls");
    }
}

class Samsung extends Phone {

    @Override
    public void takePicture() {
        System.out.println("Can  take pictures using telephoto");
    }

    @Override
    public void playMusics() {
        System.out.println("Can play music using Google music");
    }
    public void Duo() {
        System.out.println("I can make video calls usung Duo");
    }
}
