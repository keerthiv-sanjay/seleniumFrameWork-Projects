package TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;


public class verifyLoginPage extends BaseClass {

    @Test
	public void loginVerify()
	{
    	
    LoginPage lp=new LoginPage(driver);	
    HomePage hp=new HomePage(driver);
    String LoginPageTitle=lp.pagetitle();
    Assert.assertEquals(LoginPageTitle,rp.LoginPageTitle());   //data driven
    lp.loginButton();
    extentTest.info("entering ID");
    lp.userId(rp.id());
    
    extentTest.info("entering PASSWORD");
    lp.passwd(rp.pwd());
    
    extentTest.info("clicking SIGN IN button"); 
    lp.signInButton();
    
    extentTest.info("Verifying PageTitle");
    String HomePageTitle=hp.pagetitle();
    Assert.assertEquals(HomePageTitle,rp.HomePageTitle());           //data driven
    	
	}
}
