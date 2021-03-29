import org.apache.poi.hssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        Workbook wb = new Workbook();
        HSSFWorkbook hs = new HSSFWorkbook();
//        Sheet sh
        HSSFSheet sh = hs.createSheet("Мой лист");

        HSSFRow row = sh.createRow(1);//sh.getRow(2); //0,1,2...
        HSSFCell cell = row.createCell((short) 2); //0,1,2...

        HSSFRichTextString str = new HSSFRichTextString("Hello Excel");
        cell.setCellValue(str);

        try {
            FileOutputStream fos = new FileOutputStream("test.xls");
            hs.write(fos);
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
