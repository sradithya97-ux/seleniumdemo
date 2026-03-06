package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pomFiles.ProductPage;
import pomFiles.loginpage;

public class SortProduct extends BaseTest {
	
	@Test
	public void sortProduct() throws InterruptedException {
	    loginpage lp = new loginpage(driver);
	    lp.setUserName("standard_user");
	    lp.setPassword("secret_sauce");
	    lp.loginButton();

	    ProductPage pp = new ProductPage(driver);
	    Thread.sleep(3000);

	    WebElement dropdown = driver.findElement(By.className("product_sort_container"));
	    List<WebElement> options = dropdown.findElements(By.tagName("option"));

	    // Print all dropdown values
	    for(WebElement option : options) {
	        System.out.println("Dropdown value: " + option.getText());
	    }

	    // Select the 3rd option once
	    String valueToSelect = options.get(2).getText();
	    options.get(2).click();

	    // Verification
	    if(valueToSelect.equals("Price (low to high)")) {
	        System.out.println("Dropdown selection verified!");
	    }
	}
}
