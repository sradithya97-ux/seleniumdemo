package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomFiles.loginpage;

public class LoginTest1 extends BaseTest {
	//WebDriver driver;
	
	@Test()
	
	public void loginwithvalid() {
		loginpage lp= new loginpage(driver);
		lp.setUserName("standard_user");
		lp.setPassword("secret_sauce");
		lp.loginButton();
		String expectedUrl= "https://www.saucedemo.com/inventory.html";
		String actualUrl= driver.getCurrentUrl();
		System.out.println("Url of the page is: " +actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl);
		tearDown();
	}
	@Test

	public void loginWithOnvalid()
	{
		loginpage lp= new loginpage(driver);
		lp.setUserName("kkkkk");
		lp.setPassword("kmjj");
		lp.loginButton();
		String actualError= lp.errorBlock();
		System.out.println("Actual error message is: " +actualError);
		String expectedError="Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actualError, expectedError);
		
	}
	
}
