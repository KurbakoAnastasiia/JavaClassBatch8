package Class35;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo4 {
    public static void main(String[] args) throws IOException {
        // path to the file
        String path = "/Users/agameganon/eclipse-workspace/JavaClassBatch8/src/Class35/Test.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path); // creating connection

        // creating the object of XSSFworkbook to manipulate xlsx files
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("FirstPage"); // accessing the sheet
        for(int row = 0; row < sheet.getPhysicalNumberOfRows(); row++) {
            Row rowData = sheet.getRow(row); // getting the rows one by one using the outer loop
            for (int j = 0; j < rowData.getPhysicalNumberOfCells(); j++) {
                System.out.print(rowData.getCell(j) + " "); // getting the cells one by one using the inner loop
            }
            System.out.println();
        }
         /*String firstName = row.getCell(0).getStringCellValue();
            String lastName = row.getCell(1).getStringCellValue();
            String hobby = row.getCell(2).getStringCellValue();
            int age = (int) row.getCell(3).getNumericCellValue();
            int age2 = Integer.parseInt(row.getCell(3).getStringCellValue());*/
    }
}
