package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage {

	private WebDriver driver;
	
	//Login page
	
	public CheckOutOverviewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By btnFinish = By.id("finish");
	
	public void clickOnbtnFinish() {
		driver.findElement(btnFinish).click();
		//return new CheckOutInfoPage(driver);
	}
	
}
