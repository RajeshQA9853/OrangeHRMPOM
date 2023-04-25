package Rj.OrangeHRMLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		System.out.println("Browser Open");
		Login login = PageFactory.initElements(driver, Login.class);
		VerifyDashboard vboard = PageFactory.initElements(driver, VerifyDashboard.class);
		Logout logout = PageFactory.initElements(driver, Logout.class);
		
		login.login("Admin", "admin123");
		vboard.verify();
		logout.logout();
	}

}
