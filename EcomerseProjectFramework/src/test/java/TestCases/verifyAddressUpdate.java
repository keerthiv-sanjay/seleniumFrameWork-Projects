package TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.AddressPage;

public class verifyAddressUpdate extends BaseClass {
    
	@Test
	public void verifyAddress()
	{

		userIdPswdEnter();
		AddressPage ap = new AddressPage(driver);
		ap.addressbtn();
		
		extentTest.info("updating address info");
		ap.updatebtn();
		
		extentTest.info("entering company name");
		ap.company(rp.company());                     //data driven
		
		extentTest.info("entering new address");
		ap.address(rp.address());
		
		extentTest.info("selecting state");
		ap.statebtn();
		ap.stateoption();
		ap.savebtn();
		
		//AddressPage ap = new AddressPage(driver);
		String company = ap.companytxt();
		String address = ap.address1();
		String statename = ap.statename();
		
		extentTest.info("verifying updates address");
		Assert.assertEquals(company, rp.company());    //data driven
		Assert.assertEquals(address, rp.address());     //data driven
		Assert.assertEquals(statename, rp.statename());  //data driven
		
	}
}
