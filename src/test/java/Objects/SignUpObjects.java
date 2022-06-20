package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpObjects {

	public static final By signUpEmailText = By.id("register-email");
	public static final By signUpPasswordText = By.id("register-password-input");
	public static final By genderButton = By.xpath("//span[text()='Erkek']");
	public static final By checkbox = By.cssSelector("div>svg[class='ty-check']");
	public static final By singUpSubmit = By.xpath("//button[@type=('submit')]");
	public static final By codeText = By.cssSelector("input[class='ty-bg-beige ty-input ty-textbox ty-bordered ty-input-small']");
	public static final By acceptedButton = By.xpath("//button[text()='Onayla']");
	
}
