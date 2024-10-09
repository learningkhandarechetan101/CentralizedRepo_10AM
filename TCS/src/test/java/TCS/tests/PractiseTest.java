package TCS.tests;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import TCS.TestComponenet.BaseClass1;

public class PractiseTest extends BaseClass1 {

	Logger log = LogManager.getLogger("PractiseTest");

	@Test(priority = 1)
	public void Link() throws InterruptedException {
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		Thread.sleep(3000);
		log.info("Clicked on Link");
		driver.navigate().back();
		Thread.sleep(5000);
		log.info("Navigated back on Practise page");
	}
	@Test(priority = 2)
	public void DropDowns() throws InterruptedException {
		WebElement dropDownfield = driver.findElement(By.id("dropdown-class-example"));
		dropDownfield.click();
		Thread.sleep(5000);
		Select d = new Select(dropDownfield);
		log.info("DropDown Field Selected");
		d.selectByVisibleText("Option2");
		log.info("Option2 Selected from DropDown");
		Thread.sleep(5000);
	}

}
