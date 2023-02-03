package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import widgets.header.Header;
import widgets.sidebar.SortingSidebar;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ProductsPage extends Header {
    private final SelenideElement sortingSidebar = $(byXpath("//rz-filter-stack[@class='ng-star-inserted']"));
    private final SelenideElement sortingSelect = $(byXpath("//select[@class='select-css ng-untouched ng-pristine ng-valid ng-star-inserted']"));
    private final SelenideElement product = $(byClassName("goods-tile__inner"));

    public ProductsPage sortBySalesman() {
        sortingSidebar.find(byXpath(".//a[contains(@href, 'seller=rozetka')]")).click();
        return new ProductsPage();
    }

    public ProductsPage sorting(String checkbox) {
        sortingSidebar.find(withText(checkbox)).click();
        return new ProductsPage();
    }

    public ProductsPage sortBy(String sort) {
        sortingSelect.click();
        sortingSelect.find(byText(sort)).click();
        return new ProductsPage();
    }

    public ProductPage openProduct() {
        product.click();
        return new ProductPage();
    }
}
