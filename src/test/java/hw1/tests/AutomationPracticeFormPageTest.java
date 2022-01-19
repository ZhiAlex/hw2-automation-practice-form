package hw1.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AutomationPracticeFormPageTest extends Base {

    @Test
    public void fillAutomationPracticeFormPage() {

        openAutomationPracticeFormPage();

        automationPracticeFormPage.setValues(form);

        $(byText(form.getfName() + " " + form.getlName())).shouldBe(visible);
        $(byText(form.getEmail())).shouldBe(visible);
        $(byText(form.getGender())).shouldBe(visible);
        $(byText(form.getPhone())).shouldBe(visible);
        $(byText(form.getBirthday())).shouldBe(visible);
        $(byText(
                form.getSubjects().get(0) + ", " + form.getSubjects().get(1) + ", " + form.getSubjects().get(2)
        )).shouldBe(visible);
        $(byText(form.getHobbies())).shouldBe(visible);
        $(byText("cat.png")).shouldBe(visible);
        $(byText(form.getAddress())).shouldBe(visible);
        $(byText(form.getStates().get(0) + " " + form.getCities().get(0))).shouldBe(visible);
    }
}
