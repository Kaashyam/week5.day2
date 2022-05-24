package testcase;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateLead extends CommonMethods {
	
	@BeforeClass
	public void setUp() {
		fileName = "sheet1";
	}	
	
	
	@Test(dataProvider = "fetchData",groups= {"Regression","Smoke"})
	public  void runCreateLd(String cName, String fName, String lastName,String phone) {
	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Pull request to local");


		System.out.println("Successfully created the lead");

  



}
}







