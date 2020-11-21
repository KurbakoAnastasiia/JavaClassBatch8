package Class26;

public class TestFile {
    public static void main(String[] args) {
        File[] allFiles = {new JavaFile(), new WordFile(), new PdfFile()};

        for (File file :
             allFiles) {
            file.open();
            file.edit();
            file.close();
        }

    }
}
