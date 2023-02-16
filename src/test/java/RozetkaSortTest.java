import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RozetkaSortTest extends BaseTest{
    @Test
    @DisplayName("Проверка сортировки по чекбоксам")
    public void sortingTest() {
        header
                .headerSearchInput("Кросовки")
                .sorting("Nike")
                .sorting("Adidas")
                .openProduct()
                .addOnBasket();
    }
}
