package Class26;

public abstract class File {

    public abstract void open();
    public abstract void edit();
    public abstract void close();

}

class JavaFile extends File {

    @Override
    public void open() {
        System.out.println("To open .java files we need notepad++ or sublime text");
    }

    @Override
    public void edit() {
        System.out.println("To edit .java files we need to open our file ising one of IDE");
    }

    @Override
    public void close() {
        System.out.println("Before closing program you need to push your code on GitHub");
    }
}

class WordFile extends File {

    @Override
    public void open() {
        System.out.println("To open .doc files we need Microsoft Word to be installed");
    }

    @Override
    public void edit() {
        System.out.println("To edit .doc files we need to use the tools of Microsoft Word Program");
    }

    @Override
    public void close() {
        System.out.println("Before closing program you need to click Save all");
    }
}

class PdfFile extends File {

    @Override
    public void open() {
        System.out.println("To open .pdf files we need Adobe Acrobat reader to be installed");
    }

    @Override
    public void edit() {
        System.out.println("To edit .pdf files we need to use the tool Edit PDF in Adobe Acrobat App");
    }

    @Override
    public void close() {
        System.out.println("Before closing program you need to click Save all");
    }
}
