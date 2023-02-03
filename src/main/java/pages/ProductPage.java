package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;
import widgets.header.Header;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ProductPage extends Header {
    private final By product = By.xpath("//button[@class='buy-button button button--with-icon button--green button--medium ng-star-inserted']");
    private final By basketClose = By.xpath("//button[@class='modal__close']");

    public boolean elementExists(By element) {
        try {
            $(element).should(visible);
            return true;
        } catch (ElementNotFound error) {
            System.out.println("Корзина не окрылась: "+error);
            return false;
        }
    }

    public ProductPage addOnBasket() {
        actions().moveToElement($(product)).click().perform();
        if (elementExists(basketClose)) {
            $(basketClose).click();
        }
        return this;
    }

    public ProductPage addOnBasket2() {
        actions().moveToElement($(product)).click().perform();
        $(basketClose).should(appear, Duration.ofSeconds(10)).click();
        return this;
    }
}
