package Objects;

import org.openqa.selenium.By;

public class HomePageObjects {
    public static final By closePopup=By.className("modal-close");
    public static final By loginButton=By.xpath("//p[text()='Giriş Yap']");
    public static final By signUpButton= By.xpath("//div[text()='Üye Ol']");
	public static final By searchProductInputText = By.cssSelector("input[class='search-box']");
    public static final By tabHdrBtn=By.cssSelector("li[class='tab-link']");
    public static final By hdrComponent=By.xpath("(//article[@class='component-item'])[1]");




}
