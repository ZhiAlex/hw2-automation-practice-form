package hw3.selenide_with_step_annotation;

import hw3.Base;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class IssueTitleCheckSteps extends Base {

    @Step("open main page")
    public void openMainPageStep() {
        openMainPage();
    }

    @Step("finding a repository: " + REPOSITORY)
    public void findRepositoryStep() {
        $(By.name("q")).setValue(REPOSITORY).pressEnter();
    }

    @Step("open a repository: " + REPOSITORY)
    public void openRepositoryStep() {
        $(By.name("q")).setValue(REPOSITORY).pressEnter();
    }

    @Step("issue title check")
    public void issueTitleCheckStep() {
        $(By.name("q")).setValue(REPOSITORY).pressEnter();
    }
}
