package Class27and28;

public interface WebDriver {
     void openBrowser();
     void closeBrowser();
     void maximizeBrowser();
     void findElement();
}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public void maximizeBrowser() {
        System.out.println("Maximixe the Chrome Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the Elements into Chrome Browser");
    }
}

class FireFoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Open FireFox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close FireFox Browser");
    }

    @Override
    public void maximizeBrowser() {
        System.out.println("Maximize FireFox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the Elements into FireFox Browser");
    }
}