package hw1.tests;

import com.codeborne.selenide.Configuration;
import hw1.model.AutomationPracticeForm;
import hw1.pages.AutomationPracticeFormPage;
import org.junit.jupiter.api.BeforeAll;

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
