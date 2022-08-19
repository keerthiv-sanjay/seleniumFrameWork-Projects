package TestCases;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import POM.LoginPage;
import Utilities.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadProperties rp = new ReadProperties();
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest extentTest;

	@BeforeSuite
	public void extentreportINIT() {
		extent = new ExtentReports(); // engine
		ExtentSparkReporter spark = new ExtentSparkReporter("./extReport.html");
		extent.attachReporter(spark); // to attach extent object with spark object(combine the above two lines)
	}

	@BeforeTest
	public void setup(ITestContext context) {
		String drivers = rp.driveruse();
		if (drivers.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (drivers.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (drivers.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else {
			Assert.fail("Please enter a correct driver name");
		}
		System.out.println(rp.driveruse());
		driver.get(rp.url());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		extentTest = extent.createTest(context.getName()); // used to get test name from the testng.xml file
		System.out.println(context.getName());
	}

	@AfterTest
	public void end() throws InterruptedException {

		// Thread.sleep(2000);
		driver.quit();
	}

	@AfterSuite
	public void extentFlush() throws IOException {
		extent.flush();
		Desktop.getDesktop().browse(new File("extReport.html").toURI());
	}

	public void userIdPswdEnter() {
		LoginPage lp = new LoginPage(driver);
		lp.loginButton();
		lp.userId(rp.id());
		lp.passwd(rp.pwd());
		lp.signInButton();
	}

	public String screenshot(String context) throws IOException // SCREEN SHOT CODE
	{
		File screensc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/" + context + ".png");
		FileUtils.copyFile(screensc, dest);
		return dest.getAbsolutePath();
	}

}
