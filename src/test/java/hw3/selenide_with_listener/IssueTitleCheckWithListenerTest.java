package hw3.selenide_with_listener;

import com.codeborne.selenide.logevents.SelenideLogger;
import hw3.Base;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class IssueTitleCheckWithListenerTest extends Base {

    @Test
    public void issueTitleCheckTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        openMainPage();
        $(By.name("q")).setValue(REPOSITORY).pressEnter();
        $(By.linkText("ZhiAlex/RestAssuredTestProject")).click();
        $(By.id("issues-tab")).shouldBe(visible);
    }
}
