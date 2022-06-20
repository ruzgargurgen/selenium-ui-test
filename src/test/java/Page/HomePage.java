package Page;

import Base.BasePage;
import Objects.HomePageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	HomePageObjects HomePageObjects = new HomePageObjects();

	public void closePopup() {
		try {
			clickElement(HomePageObjects.closePopup);
			logger.info("Popup kapatildi...");
		} catch (Exception e) {
			logger.error(e + "Popup kapatilamadi...");
		}
	}

	public void toLoginPage() {
		try {
			clickElement(HomePageObjects.loginButton);
			logger.info("Giris Buttonu Tiklandi.");
		} catch (Exception e) {
			logger.error(e + "Giris Buttonu Tiklanamadi.");
		}

	}

	public void toSingUpPage() {
		try {
			clickElement(HomePageObjects.signUpButton);
			logger.info("SignUp Buttonu Tiklandi.");
		} catch (Exception e) {
			logger.error(e + "SignUp Buttonu Tiklanamadi.");
		}
	}

	public void searchInputText(String productName) {
		try {
			sendKeys(HomePageObjects.searchProductInputText, productName);
			enter(HomePageObjects.searchProductInputText);
			logger.info("Urun aramasi yapildi.");
		} catch (Exception e) {
			logger.error(e + "Urun aramasi yapilamadi.");
		}

	}

	public void tabIndex(int index) {
		try {
			List<WebElement> list = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(HomePageObjects.tabHdrBtn));
			list.get(index).click();
			logger.info(index + ".inci Tab'e Tiklandi.");
		} catch (Exception e) {
			logger.error(e + "" + index + "inci Tab'e Tiklanamadi.");
		}
	}

	public void toComponent() {
		try {
			clickElement(HomePageObjects.hdrComponent);
			logger.info("Ilk Component tiklandi...");
		} catch (Exception e) {
			logger.error(e + "Ilk Component tiklanamadi...");
		}
	}

	public void imagePresentControl(By by) {
		List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
		for (int i = 0; i < 4; i++) {
			Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
					+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0",
					list.get(i));
			try {
				if (p != null) {
					logger.info("Image goruntulendi");
				} else {
					logger.error("Image goruntulenemedi");
				}
			} catch (Exception e) {
				logger.error(e);
			}
		}
	}
}
