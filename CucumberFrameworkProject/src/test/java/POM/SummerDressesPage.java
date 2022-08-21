package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDressesPage {
	
	WebDriver driver;
	  
	  public SummerDressesPage(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }
	  
	  @FindBy(xpath="//ul[@class=\"product_list grid row\"]/li/div/div[2]/h5")
	  WebElement mousekeep;
	  
	  @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	  WebElement printedsummerdress;
	  
	  @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	  WebElement proceedtocheckout;
	  
	  public void mousekeep()
	  {
		  Actions a=new Actions(driver);
		  a.moveToElement(mousekeep).perform();

	  }
	  public void printedsummerdress()
	  {
		  printedsummerdress.click();
	  }
	  
	  public void proceedtocheckout()
	  {
		  proceedtocheckout.click();
	  }

}
