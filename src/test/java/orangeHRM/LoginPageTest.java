package orangeHRM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import pageobject.Loginpage;
import resources.Baseclass;
import resources.CommonMethods;

public class LoginPageTest extends Baseclass{
	
	@Test
	public void verifyLogin() throws IOException {
		
		Loginpage login=new Loginpage(driver);
		 CommonMethods.waits(driver, login.enterusername(), 10);
		login.enterusername().sendKeys("Admin");
		
		
		login.enterpassword().sendKeys("admin123");
		login.clickloginbutton().click();
		
	}
	@Test(priority=2,groups= "demo")
	public void InvalidverifyLogin() throws IOException {
		
		Loginpage login=new Loginpage(driver);
		login.enterusername().sendKeys("Adminede");
		login.enterpassword().sendKeys("dwed34");
		login.clickloginbutton().click();
//		SoftAssert sa=new SoftAssert();
//		String expectedinvalid="Invalid credentials";
//		String Actual = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
//		sa.assertEquals(expectedinvalid, Actual);
//		sa.assertAll();
		CommonMethods.handleAsserstion(driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText(), "Invalid credentials");
		
		//WebDriverWait wait=new WebDriverWait(driver, );
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com/");
		
		
		Date d=new Date();
		System.out.println(d);
		String filename=d.toString().replaceAll(" ", "-").replaceAll(":", "-");
		
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+("\\screenshot\\")+filename+".png";
		FileHandler.copy(f, new File(destination));
		
		
		
		
		
	}
}
