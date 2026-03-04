package login;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomFiles.CheckoutPage;
import pomFiles.ProductPage;
import pomFiles.loginpage;

public class ProductTest extends BaseTest {
	
	
	@Test(enabled=false)
	
	public void addProductToCartTest() {
		loginpage lp= new loginpage(driver);
		lp.setUserName("standard_user");
		lp.setPassword("secret_sauce");
		lp.loginButton();
		String expectedUrl= "https://www.saucedemo.com/inventory.html";
		String actualUrl= driver.getCurrentUrl();
		System.out.println("Url of the page is: " +actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl);
		
		ProductPage pp= new ProductPage(driver);
		pp.setaddToCartButton();
		pp.addtoCartLink();
		
		String actuallink= driver.getCurrentUrl();
		System.out.println("The actual url is: " +actuallink);
		String expectedLink= "https://www.saucedemo.com/cart.html";
		
		Assert.assertEquals(actuallink, expectedLink);
		}
	
	@Test(enabled=false)
	public void removeProductFromCart() {
		addProductToCartTest();
		CartPage cp = new CartPage(driver);
		cp.removeButton();
		Assert.assertTrue(cp.iscartEmpty());
	}
	
	@Test()
	
	public void checkoutProductFromCart() throws InterruptedException {
		addProductToCartTest();
		CartPage cp= new CartPage(driver);
		cp.checkoutVerify();
		
		CheckoutPage ch= new CheckoutPage(driver);
		Thread.sleep(2000);
		ch.enterFirstName("ABCD");
		ch.enterLastName("lp");
		ch.enterZipcode("673302");
		
		ch.clickContinueButton();
		ch.finishButtonClick();
		
		String actualUrl= driver.getCurrentUrl();
		String expectedUrl= "https://www.saucedemo.com/checkout-complete.ht";
		
		System.out.println("The actual url of the page is : " +actualUrl);
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}

}
