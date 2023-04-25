package Rj.OrangeHRMLogin;

import java.awt.Menu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public Menu menu = null;
	public Login(WebDriver driver) {
		menu = PageFactory.initElements(driver, Menu.class);
	}
		@FindBy(name="username")
		WebElement user;
		@FindBy(name="password")
		WebElement password;
		@FindBy(css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")
		WebElement ok;
		
		public void login(String u, String p) {
			user.sendKeys(u);
			password.sendKeys(p);
			ok.click();
		}
	

}
