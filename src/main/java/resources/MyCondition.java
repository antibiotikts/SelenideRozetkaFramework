package resources;

import com.codeborne.selenide.ex.ElementNotFound;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MyCondition {
    public static boolean elementExists(By element) {
        try {
            $(element).should(visible);
            return true;
        } catch (ElementNotFound error) {
            System.out.println(error);
            return false;
        }
    }
}
