package Page;

import Base.BasePage;
import Objects.HomePageObjects;
import Objects.LoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public void login(String email, String password) {

		HomePage homePage = new HomePage(driver, wait);
		homePage.closePopup();
		homePage.toLoginPage();
		sendKeys(LoginPageObjects.loginEmailText, email);
		sendKeys(LoginPageObjects.loginPasswordText, password);
		clickElement(LoginPageObjects.submitLogin);
	}
}
