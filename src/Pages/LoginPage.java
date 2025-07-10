package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	//Login page
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By txtUserName = By.id("user-name");
	private By txtPassword = By.id("password");
	private By btnLogin = By.id("login-button");
	
	public ProductsPage performLogin(String userName, String passWord) {
		driver.findElement(txtUserName).sendKeys(userName);
		driver.findElement(txtPassword).sendKeys(passWord);
		driver.findElement(btnLogin).click();
		return new ProductsPage(driver);
	}

}
