package Page;

import Base.BasePage;
import Objects.SignUpObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignUpPage extends BasePage {

	public SignUpPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	HomePage homePage = new HomePage(driver, wait);

	public void signUp(String email, String password) {
		homePage.closePopup();
		homePage.toSingUpPage();
		sendKeys(SignUpObjects.signUpEmailText, email);
		sendKeys(SignUpObjects.signUpPasswordText, password);
		clickElement(SignUpObjects.genderButton);
		selectElement(SignUpObjects.checkbox, 0);
		selectElement(SignUpObjects.checkbox, 1);
		clickElement(SignUpObjects.singUpSubmit);
	}
}
