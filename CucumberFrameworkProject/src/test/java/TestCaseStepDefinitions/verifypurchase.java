package TestCaseStepDefinitions;

import org.openqa.selenium.WebDriver;

import POM.LoginPage;
import POM.OrderConfirmationPage;
import POM.OrderPage;
import POM.SummerDressesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class verifypurchase {
	WebDriver driver=hooks.driver;
	
	@When("Select summer dress from womens section")
	public void select_summer_dress_from_womens_section() {
	    LoginPage lp=new LoginPage(driver);
	    lp.womenbtn();
	    lp.summerdressbtn();	    
	}
	
	@Then("Select printed summer dress and confirm the order")
	public void select_printed_summer_dress_and_confirm_the_order() {
	   SummerDressesPage sp=new SummerDressesPage(driver); 
	   OrderPage op=new OrderPage(driver);
	   OrderConfirmationPage ocp = new OrderConfirmationPage(driver);
	   sp.mousekeep();
	   sp.printedsummerdress();
	   sp.proceedtocheckout();
	   op.summary_proceedtocheckout();
	    op.address_proceedtocheckout();
	    op.agreecheckbox();
	    op.shipping_proceedtocheckout();
	    op.bybankwire();
	    op.confirmorder();
	    String title=ocp.pagetitle();
	    Assert.assertEquals("Order confirmation - My Store",title);
	    String txt= ocp.confirmationtext();
	    System.out.println(txt);
	    Assert.assertEquals("Your order on My Store is complete.",txt);
	    
	}

}
