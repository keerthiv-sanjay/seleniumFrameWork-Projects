package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
  Properties prop;
	public ReadProperties() 
	{
		File file = new File("./src/test/java/Utilities/config.properties");
		
		prop =new Properties();
		try {
			FileInputStream fis=new FileInputStream(file);
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String driveruse()
	{
		String driverr =prop.getProperty("driver");
		return driverr;
	}
	public String id()
	{
		String id =prop.getProperty("id");
		return id;
	}
	public String pwd()
	{
		String pwd =prop.getProperty("pwsd");
		return pwd;
	}
	public String url()
	{
		String url =prop.getProperty("url");
		return url;
	}
	public String chromepath()
	{
		String chromepath =prop.getProperty("chromedriverpath");
		return chromepath;
	}
	public String company()
	{
		String company=prop.getProperty("company");
		return company;
	}
	public String address()
	{
		String address=prop.getProperty("address");
		return address;
	}
	public String statename()
	{
		String statename=prop.getProperty("statename");
		return statename;
	}
	public String LoginPageTitle()
	{
		String loginpagetitle=prop.getProperty("LoginPageTitle");
		return loginpagetitle;
	}
	public String HomePageTitle()
	{
		String homepagetitle=prop.getProperty("HomePageTitle");
		return homepagetitle;
	}
	public String HistoryVerify()
	{
		String HistoryVerify=prop.getProperty("historyverify");
		return HistoryVerify;
	}
	public String CreditSlipVerify()
	{
		String CreditSlipVerify=prop.getProperty("creditslipverify");
		return CreditSlipVerify;
	}
	public String AddressVerify()
	{
		String AddressVerify=prop.getProperty("addressverify");
		return AddressVerify;
	}
	public String PersonalInfoVerify()
	{
		String PersonalInfoVerify=prop.getProperty("personalinfoverify");
		return PersonalInfoVerify;
	}
	public String WishlistVerify()
	{
		String WishlistVerify=prop.getProperty("wishlistverify");
		return WishlistVerify;
	}
	public String OrderConfirmationPage()
	{
		String OrderConfirmationPage=prop.getProperty("orderconfirmationpage");
		return OrderConfirmationPage;
	}
	public String OrderConfirmationText()
	{
		String OrderConfirmationText=prop.getProperty("orderconfirmationtext");
		return OrderConfirmationText;
	}
	

}
