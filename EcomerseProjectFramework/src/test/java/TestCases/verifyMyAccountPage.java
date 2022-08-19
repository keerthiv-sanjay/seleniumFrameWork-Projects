package TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import POM.MyAccountPage;

public class verifyMyAccountPage extends BaseClass {
	

	@Test
	public void averifyMyAccount() {
		
		
		userIdPswdEnter();
		HomePage lp = new HomePage(driver);
		lp.MyAccount();
	}

	@Test
	public void bhistoryVerify() {
		MyAccountPage ap = new MyAccountPage(driver);
		extentTest.info("Clicking Order History");
		ap.orderhistory();
		String title = ap.title();
		Assert.assertEquals(title, rp.HistoryVerify());   //data driven
		ap.goback();
	}

	@Test
	public void creditSlipVerify() {
		MyAccountPage ap = new MyAccountPage(driver);
		extentTest.info("Clicking credit slip");
		ap.creditslips();
		String title = ap.title();
		Assert.assertEquals(title, rp.CreditSlipVerify());  //data driven
		ap.goback();
	}

	@Test
	public void dAddressVerify() {
		MyAccountPage ap = new MyAccountPage(driver);
		extentTest.info("Clicking addressed and verify");
		ap.myaddresses();
		String title = ap.title();
		Assert.assertEquals(title, rp.AddressVerify());   //data driven
		ap.goback();
	}

	@Test
	public void ePersonalInfoVerify() {
		MyAccountPage ap = new MyAccountPage(driver);
		extentTest.info("Clicking personal info");
		ap.personalinfo();
		String title = ap.title();
		Assert.assertEquals(title, rp.PersonalInfoVerify());   //data driven
		ap.goback();
	}

	@Test
	public void fWishlistVerify() {
		MyAccountPage ap = new MyAccountPage(driver);
		extentTest.info("Clicking wishlist");
		ap.mywishlists();
		String title = ap.title();
		Assert.assertEquals(title, rp.WishlistVerify());  //data driven
		ap.goback();
		
	}
}
