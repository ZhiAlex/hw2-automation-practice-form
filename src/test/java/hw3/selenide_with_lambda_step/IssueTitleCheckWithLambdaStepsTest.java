package hw3.selenide_with_lambda_step;

import hw3.Base;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class IssueTitleCheckWithLambdaStepsTest extends Base {

    @Test
    public void issueTitleCheckWithLambdaStepsTest() {

        step("open main page", this::openMainPage);
        step("finding a repository: " + REPOSITORY, () -> {
            $(By.name("q")).setValue(REPOSITORY).pressEnter();
        });
        step("open repository: " + REPOSITORY, () -> {
            $(By.linkText(REPOSITORY)).click();
        });
        step("issue title check", () -> {
            $(By.id("issues-tab")).shouldBe(visible);
        });
    }
}
