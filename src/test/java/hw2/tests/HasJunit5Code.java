package hw2.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HasJunit5Code {

    @Test
    public void checkSoftAssertions() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();

        $(by("data-filterable-for", "wiki-pages-filter"))
                .lastChild().scrollTo().lastChild().click();
        $(byText("SoftAssertions")).click();
        $(byText("@ExtendWith")).scrollTo().shouldBe(visible);
    }
}
