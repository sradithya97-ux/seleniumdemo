package pomFiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
	private static final Object[] Options = null;
	private WebDriver driver;
	
	public ProductPage(WebDriver driver){
		this.driver=driver;
		}
	
	By addtoCartButton= By.id("add-to-cart-sauce-labs-backpack");
	By addToCartLink = By.xpath("//a[@class='shopping_cart_link']");

	
	
	
	public void setaddToCartButton() {
		driver.findElement(addtoCartButton).click();
	}
	
	public void addtoCartLink() {
		driver.findElement(addToCartLink).click();
	}
	
	
	
		 
	}
	
	

