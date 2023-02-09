import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RozetkaTest extends BaseTest {

    @Test
    @Disabled
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
    public void loginTest() {
        header
                .openHeaderLogin()
                .enterEmail("login@gmail.com")
                .enterPassword("Password")
                .closeLoginPage();
    }


    @Test
    @Disabled
    public void searchInputTest() {
        header
                .headerSearchInput("iphone")
                .openProduct()
                .addOnBasket()
                .openHeaderBasket()
                .cleanBasket()
                .closeBasket();
    }

    @Test
    @Disabled
    public void sortingTest() {
        header
                .headerSearchInput("Кросовки")
                .sorting("Nike")
                .sorting("Adidas")
                .openProduct()
                .addOnBasket();
    }

    @Test
    public void comparisonTest() {
        header
                .headerSearchInput("Стол")
                .openProduct()
                .addOnComparison()
                .openHeaderComparison()
                .openComparisonPage();
    }

    @Test
    public void comparisonCleanTest() {
        header
                .headerSearchInput("Носки")
                .openProduct()
                .addOnComparison()
                .openHeaderComparison()
                .cleanComparison()
                .closeComparisonPopup();
    }
}
