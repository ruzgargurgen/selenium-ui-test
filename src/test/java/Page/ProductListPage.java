package Page;

import Base.BasePage;
import Objects.ProductListPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListPage extends BasePage {

	public ProductListPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public void addFavorite() {
		try {
			clickElement(ProductListPageObjects.cardfavoriteButton);
			logger.info("Urun Favorilerime Eklendi...");
		} catch (Exception e) {
			logger.error(e + "Urun Favorilerime Eklenemedi...");
		}

	}

	public void toFavoritePage() {
		try {
			clickElement(ProductListPageObjects.favoriteButton);
			logger.info("Favorilerim Buttonu Tiklandi...");
		} catch (Exception e) {
			logger.error(e + "Favorilerim Buttonu Tiklanamadi...");
		}
	}

	public void selectProductBrand() {
		try {
			clickElement(ProductListPageObjects.selectProductBrand);
			logger.info("Urun Markasi Tiklandi...");
		} catch (Exception e) {
			logger.error(e + "Urun Markasi Tiklanamadi...");
		}
	}

	public void inputMinPriceValue(String minValue) {
		try {
			clear(ProductListPageObjects.minPriceValue);
			sendKeys(ProductListPageObjects.minPriceValue, minValue);
			logger.info("Minimum Urun Fiyati Girildi...");
		} catch (Exception e) {
			logger.error(e + "Minimum Urun Fiyati Girilemedi...");
		}
	}

	public void inputMaxPriceValue(String maxValue) {
		try {
			clear(ProductListPageObjects.maxPriceValue);
			sendKeys(ProductListPageObjects.maxPriceValue, maxValue);
			logger.info("Maksimum Urun Fiyati Girildi...");
		} catch (Exception e) {
			logger.error(e + "Maksimum Urun Fiyati Girilemedi...");
		}
	}

	public void getProductByFiltre() {
		try {
			enter(ProductListPageObjects.searchByFilterButton);
			;
			logger.info("Filtreleme Yapildi...");
		} catch (Exception e) {
			logger.error(e + "Filtreleme Yapildi...");
		}

	}

	public void selectProduct() {
		try {
			clickElement(ProductListPageObjects.selectProduct);
			logger.info("Urun Secildi...");
		} catch (Exception e) {
			logger.error(e + "Urun Secilemedi...");
		}
	}
}
