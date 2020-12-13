package Class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo3 {
    public static void main(String[] args) throws IOException {
        // path to the file
        String path = "/Users/agameganon/eclipse-workspace/JavaClassBatch8/src/Class35/Test.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path); // creating connection

        // creating the object of XSSFworkbook to manipulate xlsx files
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet2"); // accessing the sheet
        Row row = sheet.getRow(1); // access the row by index
        Cell cell = row.getCell(2); // accessing the cells by index
        cell.setCellValue("Mahmut");
        System.out.println(cell); // printing the results

        FileOutputStream fileOutputStream = new FileOutputStream(path); //creating the connection to write the data
        workbook.write(fileOutputStream); // writing the data


    }
}
