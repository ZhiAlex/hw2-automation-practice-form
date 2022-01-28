package hw1.tests;

import org.junit.jupiter.api.Test;

public class PracticeFormViewModelPageTest extends BaseTest {

    @Test
    public void fillAutomationPracticeFormPage() throws InterruptedException {

        automationPracticeFormPage.openPage();

        automationPracticeFormPage.setValues(form);

        System.out.println(form.fName + " " + form.lName);
        System.out.println(form.email);
        System.out.println(form.gender);
        System.out.println(form.phone);
        System.out.println(form.birthday);
        System.out.println(form.subjects.get(0) + ", " +
                form.subjects.get(1) + ", " + form.subjects.get(2));
        System.out.println(form.hobbies);
        System.out.println(form.filepath);
        System.out.println(form.address);
        System.out.println(form.states.get(0) + form.cities.get(0));

        automationPracticeFormPage
                .checkResultFields("Student Name", form.fName + " " + form.lName)
                .checkResultFields("Student Email", form.email)
                .checkResultFields("Gender", form.gender)
                .checkResultFields("Mobile", form.phone)
                .checkResultFields("Date of Birth", form.birthday)
                .checkResultFields("Subjects", form.subjects.get(0) + ", " +
                        form.subjects.get(1) + ", " + form.subjects.get(2))
                .checkResultFields("Hobbies", form.hobbies)
                .checkResultFields("Picture", "cat.png")
                .checkResultFields("Address", form.address)
                .checkResultFields("State and City", form.states.get(0) + " " + form.cities.get(0));
    }
}