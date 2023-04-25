package Rj.OrangeHRMLogin;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public Menu menu = null;
	public  Logout(WebDriver driver) {
		menu = PageFactory.initElements(driver, Menu.class);
	}
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")
	WebElement admin;
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
	WebElement logout;
	
	public void logout() {
		admin.click();
		logout.click();
	}

}
