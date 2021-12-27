package hw2.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HasJunit5Code {

    @Test
    public void checkSoftAssertions() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(By.linkText("Soft assertions")).shouldBe(visible).click();
        $(byText("@ExtendWith")).parent().parent().shouldBe(visible);
    }
}
