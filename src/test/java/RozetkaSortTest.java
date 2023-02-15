import org.junit.jupiter.api.Test;

public class RozetkaSortTest extends BaseTest{
    @Test
    public void sortingTest() {
        header
                .headerSearchInput("Кросовки")
                .sorting("Nike")
                .sorting("Adidas")
                .openProduct()
                .addOnBasket();
    }
}
