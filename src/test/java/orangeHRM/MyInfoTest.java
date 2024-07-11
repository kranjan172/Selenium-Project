package orangeHRM;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobject.Loginpage;
import pageobject.RecruitmentPOM;
import resources.Baseclass;

public class MyInfoTest extends Baseclass{
    @Test
	public void Entermyinfodetails() throws IOException, InterruptedException {
    	
		Loginpage login=new Loginpage(driver);
		login.enterusername().sendKeys("Admin");
		login.enterpassword().sendKeys("admin123");
		login.clickloginbutton().click();
		
		RecruitmentPOM myinfo=new RecruitmentPOM(driver);
		myinfo.MyInfo().click();
		Thread.sleep(4000);
		myinfo.firstnametextbox().clear();
		myinfo.firstnametextbox().sendKeys("Kunal");
		myinfo.lastnametextbox().clear();
		myinfo.lastnametextbox().sendKeys("Ranjan");
		myinfo.employeeIDtextbox().clear();
		myinfo.employeeIDtextbox().sendKeys("123");
		myinfo.otherIDtextbox().clear();
		myinfo.otherIDtextbox().sendKeys("23");
		
		
	
	
	
}}
