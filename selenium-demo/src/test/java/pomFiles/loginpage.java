package pomFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	private WebDriver driver;

	//WebDriver driver;

	public loginpage(WebDriver driver){
		this.driver=driver;
		
	}
	
	By username_field= By.id("user-name");
	By password_field = By.id("password");
	By loginButton = By.id("login-button");
	By errorblock= By.xpath("//h3[@data-test=\"error\"]");
	
	public void setUserName(String un) {
		driver.findElement(username_field).sendKeys(un);
	}
	
	public void setPassword(String pw) {
		driver.findElement(password_field).sendKeys(pw);
	}
	
	public void loginButton() {
		driver.findElement(loginButton).click();
	}
	
	public String errorBlock() {
		return driver.findElement(errorblock).getText();
	}

}

