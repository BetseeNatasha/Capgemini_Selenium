package demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
@Test
public void test() throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/OrangeHRM_Test_Script/OrangeHRM_Recruitment_Vacancy_TestData/vacancies.xlsx");
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet= workbook.getSheet("AddVacancy");
	int lastRow=sheet.getLastRowNum();
	for(int i=1;i<=lastRow;i++) {
		String vacancyName=sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(vacancyName);
	}
	workbook.close();
}
}