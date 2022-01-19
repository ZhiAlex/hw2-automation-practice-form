package hw1.pages;

import com.codeborne.selenide.SelenideElement;
import hw1.model.AutomationPracticeForm;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class AutomationPracticeFormPage {

    SelenideElement
            firstname = $("#firstName"),
            lastname = $("#lastName"),
            userEmail = $("#userEmail"),
            userNumber = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            uploadPicture = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            submitButton = $("#submit");

    public void setFName(String fName) {
        firstname.setValue(fName);
    }

    public void setLName(String lName) {
        lastname.setValue(lName);
    }

    public void setEmail(String email) {
        userEmail.setValue(email);
    }

    public void setGender(String gender) {
        String xpath = String.format("//label[text()='%s']", gender);
        $(By.xpath(xpath)).click();
    }

    public void setMobilePhone(String phone) {
        userNumber.setValue(phone);
    }

    public void setSubject(String subject) {
        subjectsInput.setValue(subject).pressEnter();
    }

    public void checkHobbiesCheckbox(int value) {
        String xpath = String.format("//div[@id='hobbiesWrapper']//input[@value='%s']", value);
        $(By.xpath(xpath)).parent().click();
    }

    public void loadFile(String filepath) {
        uploadPicture.uploadFile(new File(filepath));
    }

    public void setAddress(String address) {
        currentAddress.setValue(address);
    }

    public void setState(String state) {
        stateInput.setValue(state).pressEnter();
    }

    public void setCity(String city) {
        cityInput.setValue(city).pressEnter();
    }

    public void clickSubmitButton() {
        submitButton.scrollTo().click();
    }

    public void setValues(AutomationPracticeForm form) {
        setFName(form.getfName());
        setLName(form.getlName());
        setEmail(form.getEmail());
        setGender(form.getGender());
        setMobilePhone(form.getPhone());
        setSubject(form.getSubjects().get(0));
        setSubject(form.getSubjects().get(1));
        setSubject(form.getSubjects().get(2));
        checkHobbiesCheckbox(1);
        loadFile(form.getFilepath());
        setAddress(form.getAddress());
        setState(form.getStates().get(0));
        setCity(form.getCities().get(0));
        clickSubmitButton();
    }
}
