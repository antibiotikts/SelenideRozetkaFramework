import static com.codeborne.selenide.Configuration.timeout;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import widgets.header.Header;

import static com.codeborne.selenide.Selenide.open;

//@Execution(ExecutionMode.CONCURRENT)
public class BaseTest {

    protected Header header = new Header();

    public static void setUp() {
        timeout = 4000;
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
