package TestCaseStepDefinitions;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void endSetup(Scenario scenario) throws IOException {
		 if (scenario.isFailed()) {
		      // Take a screenshot...
		      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		      scenario.attach(screenshot, "image/png"," Please click the dropdown to view the failure screenshot"); // ... and embed it in the report.
		    }
	}
	@AfterAll
	public static void after_all() throws IOException
	{
		 Desktop.getDesktop().browse(new File("target/cucumber-reports.html").toURI());
	}	      
		    
		
		
	

}
