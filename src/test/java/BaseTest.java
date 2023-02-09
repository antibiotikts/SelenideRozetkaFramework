import static com.codeborne.selenide.Configuration.timeout;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import widgets.header.Header;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected Header header = new Header();

    public static void setUp() {
        timeout = 3000;
    }

    @BeforeEach
    public void openUrl() {
        open("https://rozetka.com.ua/ua/");
    }

    @AfterEach
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
