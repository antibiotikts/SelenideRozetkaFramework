import org.junit.jupiter.api.Test;

public class RozetkaLoginAndComparTest extends BaseTest{

    @Test
    public void loginTest() {
        header
                .openHeaderLogin()
                .enterEmail("login@gmail.com")
                .enterPassword("Password")
                .closeLoginPage();
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
