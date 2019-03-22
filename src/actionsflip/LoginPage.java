package actionsflip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public WebDriver driver;
	
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
	
		public void loginIcon()
		{
			driver.findElement(LoginpageLIB.loginicon).click();
		}
	
		public void UserName(String value)
		{ 		
			 driver.findElement(LoginpageLIB.username).sendKeys(value);
		}
		
		public void password(String value)
		{ 		
			 driver.findElement(LoginpageLIB.password).sendKeys(value);
		}
		
		public void submit()
		{
			driver.findElement(LoginpageLIB.submit).click();
		}


}
