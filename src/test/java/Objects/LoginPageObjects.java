package Objects;

import org.openqa.selenium.By;

public class LoginPageObjects {
	public static final By loginEmailText = By.id("login-email");
	public static final By loginPasswordText = By.id("login-password-input");
	public static final By submitLogin = By.cssSelector("button[type='Submit']");
}
