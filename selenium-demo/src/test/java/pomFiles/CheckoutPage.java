package pomFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	WebDriver driver;
	
	public CheckoutPage (WebDriver driver){
		this.driver = driver;
	}
	
	
	By firstNameField = By.id("first-name");
	By lastNameField = By.id("last-name");
	By zipcode = By.id("postal-code");
	By continueButton = By.id("continue");
	By finishButton = By.id("finish");
	
	
	public void enterFirstName(String name) {
		driver.findElement(firstNameField).sendKeys(name);
		
	}
	
	public void enterLastName(String lname) {
		driver.findElement(lastNameField).sendKeys(lname);
	}
	
	public void enterZipcode(String zip) {
		driver.findElement(zipcode).sendKeys(zip);
	}
	
	public void clickContinueButton() {
		driver.findElement(continueButton).click();
	}
	
	public void finishButtonClick() {
		driver.findElement(finishButton).click();
	}

}
