package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadTestData extends ProjectSpecificMethods {

	@Test(dataProvider = "testData")
	public void runCreateLead(String username, String password, String companyName, String firstName, String lastName) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
	}

	@DataProvider
	public String[][] testData() {
		// 2D array to store the test data
		String[][] array = new String[2][5];

		array[0][0] = "Demosalesmanager";
		array[0][1] = "crmsfa";
		array[0][2] = "Test Leaf";
		array[0][3] = "gopi";
		array[0][4] = "R";

		array[1][0] = "DemoCSR";
		array[1][1] = "crmsfa";
		array[1][2] = "TL";
		array[1][3] = "Babu";
		array[1][4] = "M";

		return array;

	}
}
