package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest {
	protected WebDriver driver;
	protected WebDriverWait wait;
	private String selectBrowser = "chrome";
	private String baseUrl = "https://trendyol.com";

	@BeforeMethod
	public void beginTest() {
		if (selectBrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("notification-disable");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(baseUrl);
			wait = new WebDriverWait(driver, 60);

		} else if (selectBrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(baseUrl);
			wait = new WebDriverWait(driver, 60);
		} else {
			Assert.fail("Driver not found.");
		}
	}

	@AfterMethod
	public void AfterTest() {
		if (driver != null) {
			driver.quit();
		}
	}

}
