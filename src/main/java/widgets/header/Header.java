package widgets.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.BasketPage;
import pages.CatalogPage;
import pages.HeaderMenuPage;
import widgets.BaseWidget;

import static com.codeborne.selenide.Selenide.$;

public class Header extends BaseWidget {
    private final SelenideElement header = $(By.xpath("//header[@class='header']"));
    private final By headerMenu = By.xpath(".//button[@class='header__button ng-tns-c109-1']");
    private final By headerCatalog = By.xpath(".//button[@class='button button--medium button--with-icon menu__toggle ng-star-inserted']");
    private final By headerSearchInput = By.xpath(".//button[@class='button button--medium button--with-icon menu__toggle ng-star-inserted']");
    private final By headerButtonSearchInput = By.xpath(".//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']");
    private final By headerLogin = By.xpath(".//rz-user[@class='header-actions__component']");
    private final By headerComparison = By.xpath(".//rz-comparison[@class='header-actions__component']");
    private final By headerBasket = By.xpath(".//rz-cart[@class='header-actions__component']");


    public HeaderMenuPage openHeaderMenu() {
        header.find(headerMenu).click();
        return new HeaderMenuPage();
    }

    public CatalogPage openHeaderCatalog() {
        header.find(headerCatalog).click();
        return new CatalogPage();
    }

    public void headerSearchInput(String input) {
        header.find(headerSearchInput).setValue(input);
        header.find(headerButtonSearchInput).click();
    }

    public void openHeaderLogin() {
        header.find(headerLogin).click();
    }

    public void openHeaderComparison() {
        header.find(headerComparison).click();
    }

    public BasketPage openHeaderBasket() {
        header.find(headerBasket).click();
        return new BasketPage();
    }






}
