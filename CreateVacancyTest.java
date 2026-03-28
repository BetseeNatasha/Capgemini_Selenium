package com.orangehrm.recruitment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.orangehrm.seleniumframework.object_repository.AddVacancyPage;
import com.orangehrm.seleniumframework.object_repository.DashboardPage;
import com.orangehrm.seleniumframework.object_repository.RecruitmentPage;
import com.orangehrm.seleniumframework.object_repository.VacanciesPage;
import com.orangehrm.seleniumuiframework_generic_utility.ActionHelper;
import com.orangehrm.seleniumuiframework_generic_utility.BaseClass;
import com.orangehrm.seleniumuiframework_generic_utility.ExcelUtility;


public class CreateVacancyTest extends BaseClass {
	// public 

	@Test
	public void addVacancy() throws Exception {

	    DashboardPage dsp = new DashboardPage(driver);
	    ExcelUtility eUtil= new  ExcelUtility();
	    RecruitmentPage rp = new RecruitmentPage(driver);
	    VacanciesPage vp = new VacanciesPage(driver);
	    AddVacancyPage addvp = new AddVacancyPage(driver);
	    ActionHelper aHelper = new ActionHelper(driver);
			// dashboard
			dsp.clickRecuitment();
			// Recruitment page
			rp.clickVacancieslink();
			// click add
			vp.clickAddbtn();

			String path = "./src/test/resources/OrangeHRM_Test_Script/OrangeHRM_Recruitment_Vacancy_TestData/vacancies.xlsx";

			eUtil.loadExcelFile(path, "AddVacancy");

			String vacancyName = eUtil.getDataFromSingleCell(1, 1);
			String description = eUtil.getDataFromSingleCell(1, 2);
			String hiringManager = eUtil.getDataFromSingleCell(1, 3);
			String positions = eUtil.getDataFromSingleCell(1, 3);

			addvp.setVacancyNameTextField(vacancyName);
			aHelper.navigateDownDropdown(addvp.getJobTitle(), 1);
			addvp.setDescriptionTextField(description);

			aHelper.scrollDownAutoSuggestion(addvp.getHiringManagerTextField(), hiringManager, 5, 1);

			addvp.setDescriptionTextField(positions);
			addvp.clickSavebtn();

			List<WebElement> validateionVacancyName = driver
					.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));

			for (WebElement vacancy : validateionVacancyName) {
				String name = vacancy.getText();
				Assert.assertEquals(name, eUtil.getDataFromSingleCell(1, 1));
				if (name.equals(eUtil.getDataFromSingleCell(1, 1))) {
					Reporter.log("passed");
				} else {
					Reporter.log("failed");
				}

			}
		}
}