import org.junit.jupiter.api.BeforeEach;
import widgets.header.Header;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected Header header = new Header();

    @BeforeEach
    public void openUrl() {
        open("https://rozetka.com.ua/ua/");
    }
}
