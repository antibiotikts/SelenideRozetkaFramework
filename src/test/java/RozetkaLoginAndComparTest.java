import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RozetkaLoginAndComparTest extends BaseTest{

    @Test
    @DisplayName("Ввод логина и пароля")
    public void loginTest() {
        header
                .openHeaderLogin()
                .enterEmail("login@gmail.com")
                .enterPassword("Password")
                .closeLoginPage();
    }

    @Test
    @DisplayName("Добавление товара в сравнение")
    public void comparisonTest() {
        header
                .headerSearchInput("Стол")
                .openProduct()
                .addOnComparison()
                .openHeaderComparison()
                .openComparisonPage();
    }

    @Test
    @DisplayName("Очистка товаров в 'сравнении'")
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
