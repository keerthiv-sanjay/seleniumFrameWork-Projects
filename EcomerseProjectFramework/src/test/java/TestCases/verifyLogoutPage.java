package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;

public class verifyLogoutPage extends BaseClass {  
  @Test
  public void  logoutVerify() {
	  	
	  
	    LoginPage lp=new LoginPage(driver);	
	    HomePage hp=new HomePage(driver);
	    
	    extentTest.info("Entering ID and PASSWORD");
	    userIdPswdEnter();
	    extentTest.info("Entered Home Page");
	    String HomePageTitle=hp.pagetitle();
	    Assert.assertEquals(HomePageTitle,rp.HomePageTitle());   //data driven
	    
	    extentTest.info("Signing out");
	    hp.signOutButton();
	    
	    extentTest.info("Verifying page title");
	    String LoginPageTitle2=lp.pagetitle();
	    Assert.assertEquals(LoginPageTitle2,rp.LoginPageTitle());   //data driven
	  
  }
}
