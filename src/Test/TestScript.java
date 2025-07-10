package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import Pages.CheckOutOverviewPage;
import Pages.LoginPage;
import Pages.ProductsPage;
import Pages.ShoppingCartPage;

public class TestScript {

	private WebDriver driver;
	private LoginPage loginPage;
	private ProductsPage productsPage;
	private ShoppingCartPage shoppingCartPage;
	private CheckOutOverviewPage checkoutOverviewPage;
	
	
	@BeforeTest
	public void beforeTest(){
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.saucedemo.com/");
	}
	
	//login to products page
	@Test
	public void TestALogin() {
		loginPage = new LoginPage(driver);
		productsPage = loginPage.performLogin("standard_user", "secret_sauce");
	}
	
	//products page to selected product page
	@Test
	public void TestBShoppingCart() {
		var selectedProductPage = productsPage.ClickOnProductLink();
		//Add to cart
		selectedProductPage.clickOnAddToCart();		
		shoppingCartPage = selectedProductPage.clickOnShoppingCartLink();
		
	}
	
	//shopping cart to checkout info page
	@Test
	public void TestCCheckoutInfo() {
		var checkOutInfoPage = shoppingCartPage.clickOnCheckout();	
		checkoutOverviewPage = checkOutInfoPage.enterUserInfo("Adam", "McGreggor", "3155");
	}
	
	//Checkout confirmation
	@Test
	public void TestDChkOutOverview() {
		checkoutOverviewPage.clickOnbtnFinish();
	}
	

}
