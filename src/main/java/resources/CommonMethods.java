package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void waits(WebDriver driver,WebElement xpath, int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(xpath));
	}
	public static void handleAsserstion(String Actual,String Expected) {
		SoftAssert softassert=new SoftAssert();
		String Actualtext=Actual;
		String Expectedtext=Expected;
		softassert.assertEquals(Actualtext, Expectedtext);
		softassert.assertAll();
	}
	
	
}
