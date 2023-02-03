package widgets.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Header {
    private final SelenideElement header = $(By.xpath("//header[@class='header']"));

}
