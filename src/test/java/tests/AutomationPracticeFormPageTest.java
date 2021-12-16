package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AutomationPracticeFormPageTest extends Base {

    @Test
    public void fillAutomationPracticeFormPage() throws InterruptedException {
        openAutomationPracticeFormPage();
        automationPracticeFormPage.setFName(form.getfName());
        automationPracticeFormPage.setLName(form.getlName());
        automationPracticeFormPage.setEmail(form.getEmail());
        automationPracticeFormPage.setGender(form.getGender());
        automationPracticeFormPage.setMobilePhone(form.getPhone());
        automationPracticeFormPage.setSubject(form.getSubjects().get(0));
        automationPracticeFormPage.setSubject(form.getSubjects().get(1));
        automationPracticeFormPage.setSubject(form.getSubjects().get(2));
        automationPracticeFormPage.checkHobbiesCheckbox(1);
        automationPracticeFormPage.loadFile(form.getFilepath());
        automationPracticeFormPage.setAddress(form.getAddress());
        automationPracticeFormPage.setState(form.getStates().get(0));
        automationPracticeFormPage.setCity(form.getCities().get(0));
        automationPracticeFormPage.clickSubmitButton();

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
