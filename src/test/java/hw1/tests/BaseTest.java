package hw1.tests;

import com.codeborne.selenide.Configuration;
import hw1.model.PracticeFormViewModel;
import hw1.pages.AutomationPracticeFormPage;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage();
    PracticeFormViewModel form = new PracticeFormViewModel();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";
    }
}
