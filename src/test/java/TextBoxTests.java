import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void setUp() {
        open("/text-box");
        $("#userName").click();
        $("#userName").setValue("Test Madi");
        $("#userEmail").setValue("madi@mail.ru");
        $("#permanentAddress").setValue("Test Madi");
        $("#submit").click();

        $("#output").shouldHave(text("Test Madi"), text("madi@mail.ru"));

    }

}
