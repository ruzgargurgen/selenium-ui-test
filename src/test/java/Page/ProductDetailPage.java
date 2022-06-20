package Page;

import Base.BasePage;
import Objects.ProductDetailPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class ProductDetailPage extends BasePage {
	public ProductDetailPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public void productAddBasket() {
		try {
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			clickElement(ProductDetailPageObjects.basketButton);
			logger.info("Urun sepete eklendi...");
		} catch (Exception e) {
			logger.error(e + "Urun sepete eklenmedi...");
		}

	}
}
