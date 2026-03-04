package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	private WebDriver driver;
	
	CartPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	By removeButton = By.xpath("//button[text()='Remove']");
	private By cartItems = By.className("cart_item");
	private By checkoutButton= By.id("checkout");
	
	public void removeButton()
	{
		driver.findElement(removeButton).click();
	}

	public boolean iscartEmpty() {
		return driver.findElements(cartItems).isEmpty();		
	}
	
	public void checkoutVerify() {
		driver.findElement(checkoutButton).click();
	}
}
