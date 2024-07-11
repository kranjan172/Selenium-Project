package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecruitmentPOM {
	public WebDriver driver;
	
	public  RecruitmentPOM(WebDriver driver2) {
		this.driver=driver2;
	}
	private By MyInfo=By.xpath("//span[text()=\"My Info\"]");
	private By firstname=By.xpath("//input[@name=\"firstName\"]");
	private By lastname=By.xpath("//input[@name=\"lastName\"]");
	private By employeeID=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
	private By otherID=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
	
	public WebElement MyInfo() {
		return driver.findElement(MyInfo);
	}
	public WebElement firstnametextbox() {
		return driver.findElement(firstname);
	}
	public WebElement lastnametextbox() {
		return driver.findElement(lastname);
	}public WebElement employeeIDtextbox() {
		return driver.findElement(employeeID);
	}public WebElement otherIDtextbox() {
		return	driver.findElement(otherID);
	}
	
	

}
