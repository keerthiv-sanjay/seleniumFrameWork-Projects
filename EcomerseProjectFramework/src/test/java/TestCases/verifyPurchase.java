package TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import POM.OrderConfirmationPage;
import POM.OrderPage;
import POM.SummerDressesPage;

public class verifyPurchase extends BaseClass {

	@Test
	public void verifypurchase() {
		
		userIdPswdEnter();
		HomePage hp = new HomePage(driver);
		
		extentTest.info("Clicking womens section");
		hp.womenbtn();
		
		extentTest.info("Selecting Summer Dress");
		hp.summerdressbtn();

		SummerDressesPage sp = new SummerDressesPage(driver);
		OrderPage op = new OrderPage(driver);
		OrderConfirmationPage ocp = new OrderConfirmationPage(driver);
		sp.mousekeep();
		extentTest.info("Adding to cart");
		sp.printedsummerdress();
		
		extentTest.info("Proceed to checkout");
		sp.proceedtocheckout();
		
		extentTest.info("summary proceed to checkout");
		op.summary_proceedtocheckout();
		
		extentTest.info("address proceed to checkout");
		op.address_proceedtocheckout();
		
		extentTest.info("clicking agree checkbox");
		op.agreecheckbox();
		op.shipping_proceedtocheckout();
		
		extentTest.info("selecting payment option");
		op.bybankwire();
		
		extentTest.info("confirming order");
		op.confirmorder();
		String title = ocp.pagetitle();
		
		extentTest.info("verfying confirmation of order");
		Assert.assertEquals(title,rp.OrderConfirmationPage());     //data driven
		String txt = ocp.confirmationtext();
		System.out.println(txt);
		Assert.assertEquals(txt,rp.OrderConfirmationText());      //data driven
		
	}

}
