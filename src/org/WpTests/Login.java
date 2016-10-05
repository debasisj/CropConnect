package org.WpTests;
import org.openqa.selenium.WebDriver;

public class Login {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		LoginPageObjects page = new LoginPageObjects();
		page.driver.navigate().to("http://localhost:18629/wp-login.php?");
		page.userID.sendKeys("admin");
		page.pdw.sendKeys("xxxx");
		page.loginBtn.click();
		

		

	}

}
