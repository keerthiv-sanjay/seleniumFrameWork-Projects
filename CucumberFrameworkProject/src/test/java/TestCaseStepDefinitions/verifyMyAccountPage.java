package TestCaseStepDefinitions;

import org.openqa.selenium.WebDriver;

import POM.LoginPage;
import POM.MyAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class verifyMyAccountPage {
WebDriver driver=hooks.driver;

@When("Enter into MyAccounts page")
public void enter_into_my_accounts_page() {
    LoginPage lp=new LoginPage(driver);
    lp.MyAccount();
}

@Then("click order history details and verify")
public void click_order_history_details_and_verify() {
   MyAccountPage ap=new MyAccountPage(driver);
   ap.orderhistory();
   String title=ap.title();
   Assert.assertEquals(title,"Order history - My Store");
   ap.goback();
}

@Then("click order My Credit slip and verify")
public void click_order_my_credit_slip_and_verify() {
	MyAccountPage ap=new MyAccountPage(driver);
	   ap.creditslips();
	   String title=ap.title();
	   Assert.assertEquals(title,"Order slip - My Store");
	   ap.goback();
}

@Then("click order My Addresses and verify")
public void click_order_my_addresses_and_verify() {
	MyAccountPage ap=new MyAccountPage(driver);
	   ap.myaddresses();
	   String title=ap.title();
	   Assert.assertEquals(title,"Addresses - My Store");
	   ap.goback();
}

@Then("click order My Personal information and verify")
public void click_order_my_personal_information_and_verify() {
	MyAccountPage ap=new MyAccountPage(driver);
	   ap.personalinfo();
	   String title=ap.title();
	   Assert.assertEquals(title,"Identity - My Store");
	   ap.goback();
}

@Then("click order My Wishlists and verify")
public void click_order_my_wishlists_and_verify() {
	MyAccountPage ap=new MyAccountPage(driver);
	   ap.mywishlists();;
	   String title=ap.title();
	   Assert.assertEquals(title,"My Store");
}




}
