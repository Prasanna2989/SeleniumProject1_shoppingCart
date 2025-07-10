package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ProductsPage {
	
	private WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		
	}

	private By lnktextSLBackPack = By.linkText("Sauce Labs Backpack");
	
	public SelectedProductPage ClickOnProductLink() {
		driver.findElement(lnktextSLBackPack).click();
		return new SelectedProductPage(driver);
	}
	
}
