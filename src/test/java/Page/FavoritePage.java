package Page;

import Base.BasePage;
import Objects.FavoritePageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FavoritePage extends BasePage {
	public FavoritePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public void selectSizeProduct() {
		try {
			clickElement(FavoritePageObjects.beden);
			clickElement(FavoritePageObjects.selectSize);
			logger.info("Urun bedeni secildi...");
		} catch (Exception e) {
			logger.error(e + "Urun bedeni secilemedi...");
		}

	}

	public void addToBasket() {
		try {
			clickElement(FavoritePageObjects.basketButton);
			logger.info("Urun sepete eklendi...");
		} catch (Exception e) {
			logger.error(e + "Urun sepete eklenemedi...");
		}
	}

}
