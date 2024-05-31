package exceldatadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.commons.collections4.Get;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MajorMinorAge {

	public static  void main(String[] args) throws Exception {
	FileInputStream fis = new FileInputStream("C:\\Users\\Khushi\\Downloads\\data.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sheet = wb.getSheet("people");
    XSSFRow row = sheet.getRow(0);
    XSSFCell cell = null;
    
    
  
	}

}
