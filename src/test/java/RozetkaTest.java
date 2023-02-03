import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

public class RozetkaTest extends BaseTest {

    @Test
    public void catalogSearchTest() {
        header
                .openHeaderCatalog()
                .openProducts("Одяг, взуття та прикраси", "Чоловіче взуття", "Кеди")
                .sorting("Rozetka")
                .sorting("Nike")
                .sorting("Adidas")
                .sortBy("Новинки")
                .openProduct()
                .addOnBasket2()
                .openHeaderBasket();
    }
}
