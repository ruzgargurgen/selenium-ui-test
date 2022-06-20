package Objects;

import org.openqa.selenium.By;

public class ProductListPageObjects {
	public static final By selectProductBrand = By.xpath("//div[text()='Monster']");
	public static final By minPriceValue = By.cssSelector("input[placeholder='En Az']");
	public static final By maxPriceValue = By.cssSelector("input[placeholder='En Çok']");
	public static final By searchByFilterButton = By.className("fltr-srch-prc-rng-srch");
	public static final By selectProduct = By.xpath("(//div[@class='p-card-chldrn-cntnr'])[1]");
	public static final By cardfavoriteButton = By.xpath("(//div/i[@class='fvrt-btn'])[1]");
	public static final By favoriteButton = By.xpath("//p[text()='Favorilerim']");
	public static final By productImage = By.cssSelector("img[class='p-card-img']");
	public static final By superMarketProductImage = By.cssSelector("img[class='p-card-img short-product-image']");

}
