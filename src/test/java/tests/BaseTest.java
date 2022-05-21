package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import pages.AddToCart;
import pages.HomePage;
import pages.MyAccount;
import pages.OrderSummaryPage;
import pages.Payment;
import pages.ShoppingCart;
import pages.SignInPage;
import pages.WomenApparelPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import testDataManagement.TestDataHandler;
import utilities.ExtentManager;

public class BaseTest {
	WebDriver driver = null;
//	public static final String USERNAME = "kaur938";
//	public static final String ACCESS_KEY = "c44d5a12-0f9a-43ab-a2c4-245ecf1abd54";
//	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static ExtentReports extent;
	public HomePage hp;
	public SignInPage si;
	public MyAccount account;
	public WomenApparelPage womenA;
	public AddToCart atocart;
	public ShoppingCart scart;
	public Payment pay;
	public OrderSummaryPage odrsumry;
	
	public void startSession() throws IOException {
		extent = ExtentManager.getInstance();
		System.out.println();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		String strbrowser = config.getProperty("strBrowser");
		String strUrl = config.getProperty("strUrl");
		int intImplicitWait = Integer.parseInt(config.getProperty("implicitWait"));
		if(driver == null) {
			if(strbrowser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if (strbrowser.equalsIgnoreCase("firefox")){
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}else if (strbrowser.equalsIgnoreCase("edge")){
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}else {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
		}
		driver.get(strUrl);
		driver.manage().timeouts().implicitlyWait(intImplicitWait, TimeUnit.SECONDS);
		createPageObjects();
	}
	
	
	public void createPageObjects() {
		hp = new HomePage(driver);
		si = new SignInPage(driver);
		account = new MyAccount(driver);
		womenA = new WomenApparelPage(driver);
		atocart= new AddToCart(driver);
		scart = new ShoppingCart(driver);
		pay = new Payment(driver);
		odrsumry = new OrderSummaryPage(driver);
		
	}

	@BeforeMethod
	public void beforeTest() throws IOException {
		startSession();
	}
	
	@AfterMethod
	public void tearDown() {
		ExtentManager.flushExtentInstance();
		driver.quit();
	}
	
	@BeforeSuite
	public void beforeSuite() throws StreamReadException, DatabindException, IOException {
		TestDataHandler.testDataInit();
	} 
}
