package TestCase;

import Base.BaseTest;
import Objects.ProductListPageObjects;
import Page.*;
import Utils.Constants;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    @Test
    public void singUp() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage(driver, wait);
        signUpPage.signUp(Constants.signUpEmail, Constants.singnUpPassword);
    }

    @Test
    public void login() {
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login(Constants.loginEmail, Constants.loginPassword);
    }

    @Test
    public void searchProductByFilterAddBasket() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        ProductListPage productListPage = new ProductListPage(driver, wait);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver, wait);
        login();
        homePage.searchInputText(Constants.expectedSearchProductName);
        productListPage.selectProductBrand();
        productListPage.inputMinPriceValue(Constants.minValue);
        productListPage.inputMaxPriceValue(Constants.maxValue);
        productListPage.getProductByFiltre();
        productListPage.selectProduct();
        Thread.sleep(2000);
        productDetailPage.productAddBasket();
    }

    @Test
    public void searchProductAddFavAndBasket() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        FavoritePage favoritePage = new FavoritePage(driver, wait);
        ProductListPage productListPage = new ProductListPage(driver, wait);
        login();
        homePage.searchInputText(Constants.productName);
        productListPage.addFavorite();
        productListPage.toFavoritePage();
        Thread.sleep(2000);
        favoritePage.selectSizeProduct();
        Thread.sleep(2000);
        favoritePage.addToBasket();
    }

    @Test
    public void tabComponentProductImageControl() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.closePopup();
        for (int i = 0; i < 4; i++) {
            homePage.tabIndex(i);
            homePage.toComponent();
            homePage.imagePresentControl(ProductListPageObjects.productImage);
        }
        homePage.tabIndex(4);
        homePage.toComponent();
        homePage.imagePresentControl(ProductListPageObjects.superMarketProductImage);
        for (int j = 5; j < 10; j++) {
            homePage.tabIndex(j);
            homePage.toComponent();
            homePage.imagePresentControl(ProductListPageObjects.productImage);
        }
    }
}
