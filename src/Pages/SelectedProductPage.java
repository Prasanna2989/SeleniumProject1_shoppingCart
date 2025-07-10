package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SelectedProductPage {
	
	private WebDriver driver;
	
	public SelectedProductPage(WebDriver driver) {
		this.driver = driver;
	}

	private By btnAddToCart = By.id("add-to-cart");
	private By lnkShoppingCart = By.cssSelector(".shopping_cart_link");
	
	
	public void clickOnAddToCart() {
		driver.findElement(btnAddToCart).click();
	}
	
	public ShoppingCartPage clickOnShoppingCartLink() {
		driver.findElement(lnkShoppingCart).click();
		return new ShoppingCartPage(driver);
	}
	
}
