package tests;

import com.codeborne.selenide.Configuration;
import model.AutomationPracticeForm;
import org.junit.jupiter.api.BeforeAll;
import pages.AutomationPracticeFormPage;

import static com.codeborne.selenide.Selenide.open;

public class Base {

    AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage();
    AutomationPracticeForm form = new AutomationPracticeForm();

    public void openAutomationPracticeFormPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = false;
    }
}
