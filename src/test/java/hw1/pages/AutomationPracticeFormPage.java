package hw1.pages;

import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class AutomationPracticeFormPage {

    public void setFName(String fName) {
        $("#firstName").setValue(fName);
    }

    public void setLName(String lName) {
        $("#lastName").setValue(lName);
    }

    public void setEmail(String email) {
        $("#userEmail").setValue(email);
    }

    public void setGender(String gender) {
        String xpath = String.format("//label[text()='%s']", gender);
        $(By.xpath(xpath)).click();
    }

    public void setMobilePhone(String phone) {
        $("#userNumber").setValue(phone);
    }

    public void setSubject(String subject) {
        $("#subjectsInput")
                .setValue(subject).pressEnter();

    }

    public void checkHobbiesCheckbox(int value) {
        String xpath = String.format("//div[@id='hobbiesWrapper']//input[@value='%s']", value);
        $(By.xpath(xpath)).parent().click();
    }

    public void loadFile(String filepath) {
        $("#uploadPicture").uploadFile(new File(filepath));
    }

    public void setAddress(String address) {
        $("#currentAddress").setValue(address);
    }

    public void setState(String state) {
        $("#react-select-3-input").setValue(state).pressEnter();
    }

    public void setCity(String city) {
        $("#react-select-4-input").setValue(city).pressEnter();
    }

    public void clickSubmitButton() {
        $("#submit").scrollTo().click();
    }

}
