package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
    WebDriver driver;
	private By username=By.xpath("//input[@placeholder=\"Username\"]");
	private By password=By.xpath("//input[@name=\"password\"]");
	private By loginbutton=By.xpath("//button[@type=\"submit\"]");

	public Loginpage(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterusername() {
		return driver.findElement(username);
	}
	public WebElement enterpassword() {
		return driver.findElement(password);
	} 
	public WebElement clickloginbutton() {
		return driver.findElement(loginbutton);
	} 
}
