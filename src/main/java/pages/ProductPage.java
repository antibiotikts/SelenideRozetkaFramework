package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;
import widgets.header.Header;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static resources.MyCondition.elementExists;

public class ProductPage extends Header {
    private final By productBody = By.xpath("//div[@class='product-about']");
    private final By product = By.xpath("//button[@class='buy-button button button--with-icon button--green button--medium ng-star-inserted']");
    private final By basketClose = By.xpath("//button[@class='modal__close']");
    private final By comparisonButton = By.xpath("//button[@class='compare-button ng-star-inserted']");

    public ProductPage addOnBasket() {
        actions().moveToElement($(product)).click().perform();
        if (elementExists(basketClose)) {
            System.out.println("Открылся попап корзины");
            $(basketClose).click();
        }
        if(!elementExists(productBody)) {
            System.out.println("Oткрылось окно корзины");
            back();
        }
        return this;
    }

    public ProductPage addOnBasket2() {
        actions().moveToElement($(product)).click().perform();
        $(basketClose).should(appear, Duration.ofSeconds(10)).click();
        return this;
    }

    public ProductPage addOnComparison() {
        $(comparisonButton).click();
        return this;
    }
}
