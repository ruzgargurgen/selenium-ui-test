package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;

import java.util.List;

public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Logger logger;

	public BasePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		this.logger = Logger.getLogger(BasePage.class);
	}

	public void clickElement(By by) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		try {
			element.click();
			logger.info(by.toString() + " elementi Tiklandi.");
		} catch (Exception e) {
			logger.error(by.toString() + " element Tiklanamadi.");
		}
	}

	public void sendKeys(By by, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		try {
			clear(by);
			element.sendKeys(value);
			logger.info(by.toString() + " Elementine " + value + " degeri yazildi.");
		} catch (Exception e) {
			logger.error(by.toString() + "Elementine " + value + "degeri yazilamadi.");
		}
	}

	public void clear(By by) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		try {
			element.clear();
			logger.info(by.toString() + " Elementinin text degeri temizlendi.");
		} catch (Exception e) {
			logger.error(by.toString() + "Elementinin text degeri temizlendi..");
		}
	}

	public void enter(By by) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		try {
			element.sendKeys(Keys.ENTER);
			logger.info(by.toString() + " elementine ENTER yapildi.");
		} catch (Exception e) {
			logger.error(by.toString() + " elementine yapilamadi.");
		}
	}
	public void selectElement(By by, int index) {
		List<WebElement> element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
		try {
			element.get(index).click();
			logger.info(by.toString() + " elementi Tiklandi..");
		} catch (Exception e) {
			logger.error(by.toString() + "  elementi Tiklanamadi.");
		}
	}
}
