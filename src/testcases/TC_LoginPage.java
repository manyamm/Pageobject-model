package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import actionsflip.LoginPage;

public class TC_LoginPage {
	
	@Test
	public void testScript() throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Program Files\\browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50000,TimeUnit.MILLISECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(50000);
		LoginPage lp= new LoginPage(driver);
		//lp.loginIcon();
		lp.UserName("deepthi.n25@gmail.com");
		lp.password("134");
		lp.submit();
		
	}

}
