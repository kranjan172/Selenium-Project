package orangeHRM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageobject.Loginpage;
import resources.Baseclass;
import resources.CommonMethods;

public class Nextpage extends Baseclass{

  @Test
  public void checkLogin() {
	  Loginpage lpo=new Loginpage(driver);
	  lpo.enterusername().sendKeys("Kunal");
	  lpo.enterpassword().sendKeys("ppp");
	  lpo.clickloginbutton();
	  CommonMethods.handleAsserstion(driver.findElement(By.xpath("dfs")).getText(), "Invalid credentials");
  }
	   
	
	
}
