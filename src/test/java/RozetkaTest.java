import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static com.codeborne.selenide.Selenide.open;

public class RozetkaTest extends BaseTest {

    @Test
    @DisplayName("Поиск товара через коталог")
    public void catalogSearchTest() {
        header
                .openHeaderCatalog()
                .openProducts("Одяг, взуття та прикраси", "Чоловіче взуття", "Кеди")
                .sortBy("Новинки")
                .openProduct()
                .addOnBasket()
                .openHeaderBasket()
                .cleanBasket()
                .closeBasket();
    }

    @Test
    @DisplayName("Поиск товара в строке поиска")
    public void searchInputTest() {
        header
                .headerSearchInput("iphone")
                .openProduct()
                .addOnBasket()
                .openHeaderBasket()
                .cleanBasket()
                .closeBasket();
    }
}
