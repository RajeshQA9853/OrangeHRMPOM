package Rj.OrangeHRMLogin;

import java.awt.Menu;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifyDashboard {
	public Menu menu = null;
	
	public VerifyDashboard(WebDriver driver) {
		menu = PageFactory.initElements(driver, Menu.class);
	}
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement actual;

	public void verify() {
		String e1 = "Dashboard";
		 actual.getText();
		Assert.assertEquals(e1, actual);
		System.out.println("Verified");
		
	}

}
