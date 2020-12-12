package Class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class OutputFiles {
    public static void main(String[] args) throws IOException {
        String path1 = "/Users/agameganon/eclipse-workspace/JavaClassBatch8/src/Class34/Credentials2.properties";
        // Connection to
        FileOutputStream fileOutputStream = new FileOutputStream(path1);
        Properties properties = new Properties();

        properties.setProperty("phoneNumber", "11111111");
        properties.store(fileOutputStream, "Storing the data");
    }
}
