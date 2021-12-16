package model;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class AutomationPracticeForm {

    private final String fName;
    private final String lName;
    private final String email;
    private final String gender;
    private final String phone;
    private final String birthday;
    private final List<String> subjects;
    private final String hobbies;
    private final String filepath;
    private final String address;
    private final List<String> states;
    private final List<String> cities;

    public AutomationPracticeForm() {
        Faker faker = new Faker();
        SimpleDateFormat format = new SimpleDateFormat("dd MMMMM,yyyy", Locale.US);

        this.fName = faker.name().firstName();
        this.lName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.gender = "Male";
        this.phone = faker.numerify("##########");
        this.birthday = format.format(new Date());
        this.subjects = List.of("English", "Physics", "Maths");
        this.filepath = "src/test/resources/files/cat.png";
        this.address = faker.address().fullAddress();
        this.states = List.of("NCR", "Haryana");
        this.cities = List.of("Delhi", "Gurgaon", "Noida");
        this.hobbies = "Reading";
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getFilepath() {
        return filepath;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getStates() {
        return states;
    }

    public List<String> getCities() {
        return cities;
    }

    public String getHobbies() {
        return hobbies;
    }
}
