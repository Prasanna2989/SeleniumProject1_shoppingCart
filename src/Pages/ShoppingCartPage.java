package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

	private WebDriver driver;
	
	//Login page
	
	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By btnCheckout = By.id("checkout");
	
	public CheckOutInfoPage clickOnCheckout() {
		driver.findElement(btnCheckout).click();
		return new CheckOutInfoPage(driver);
	}
}
