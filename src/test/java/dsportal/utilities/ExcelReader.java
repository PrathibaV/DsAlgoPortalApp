package dsportal.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ExcelReader {
	
	   WebDriver driver;
	  
	  public ExcelReader(WebDriver driver) { 
		  this.driver = driver; }
	 

	public synchronized LinkedHashMap<String, String> getTestData (String sheetname, int rowNum ) throws IOException {
		LinkedHashMap<String, String> currCelValue = new LinkedHashMap();

		String path = "C:\\Users\\DELL\\Documents\\Numpy Ninja\\Ds-Algo\\My DS-Algo files\\DsAlgo ExcelData6.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		Iterator<Row> rows = sheet.rowIterator();
		Row firstRow = rows.next();
		Iterator<Cell> firstRowCells = firstRow.cellIterator();
		List<String> columnHeaders = new ArrayList();
		while (firstRowCells.hasNext()) {
			Cell columnHeader = firstRowCells.next();
			columnHeaders.add(columnHeader.getStringCellValue());
		}

		while (rows.hasNext()) {
			Row currRow = rows.next();
			int currRowNum = currRow.getRowNum();
			if (currRowNum == rowNum) {
				Iterator<Cell> currRowCell = currRow.cellIterator();
				int columnHeaderNum = 0;
				while (currRowCell.hasNext()) {
					Cell currCell = currRowCell.next();
					if (currCell.getCellType() == CellType.STRING) {
						currCelValue.put(columnHeaders.get(columnHeaderNum), currCell.getStringCellValue());
					} else if (currCell.getCellType() == CellType.NUMERIC) {
						currCelValue.put(columnHeaders.get(columnHeaderNum),
								NumberToTextConverter.toText(currCell.getNumericCellValue()));
					} else if (currCell.getCellType() == CellType.BLANK) {
						currCelValue.put(columnHeaders.get(columnHeaderNum), "");
					}
					columnHeaderNum++;
				}
			}
		}
		return currCelValue;
	}
	
public  void TextIndentation( int rowNum, int spaceToTrim) {
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).perform();
		
		for (int i = 1; i <=rowNum-1; i++) {
			action.sendKeys(Keys.ARROW_DOWN).perform();
			
			if (i == rowNum-1) {
				for(int j=0; j<spaceToTrim; j++) {
					action.sendKeys(Keys.DELETE).perform();
				}
			}			
		}
	}
}
