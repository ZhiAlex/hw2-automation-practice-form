package hw3;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;

import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selenide.open;

public class Base {

    public final String REPOSITORY = "ZhiAlex/RestAssuredTestProject";

    public void openMainPage() {
        open("https://github.com/");
    }

    @Attachment(value = "Screenshot", type = "text/html", fileExtension = "html")
    public byte[] attachPageSource() {
        return WebDriverRunner.source().getBytes(StandardCharsets.UTF_8);
    }

    @AfterEach
    public void savePageSource() {
        attachPageSource();
    }
}
