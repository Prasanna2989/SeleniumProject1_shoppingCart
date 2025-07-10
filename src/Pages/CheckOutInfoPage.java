package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutInfoPage {
	
	private WebDriver driver;
	
	//Login page
	
	public CheckOutInfoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By txtFirstName = By.id("first-name");
	private By txtLastName = By.id("last-name");
	private By txtPostalCode = By.id("postal-code");
	private By btnContinue = By.id("continue");
	
	public CheckOutOverviewPage enterUserInfo(String firstName, String lastName, String postalCode) {
		driver.findElement(txtFirstName).sendKeys(firstName);
		driver.findElement(txtLastName).sendKeys(lastName);
		driver.findElement(txtPostalCode).sendKeys(postalCode);
		driver.findElement(btnContinue).click();
		return new CheckOutOverviewPage(driver);
	}
	
}
