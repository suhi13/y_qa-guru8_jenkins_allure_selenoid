package tests.lesson8;

import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import steps.RegistrationFormSteps;

public class RegistrationFormTest {
    RegistrationFormSteps steps = new RegistrationFormSteps();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    @Tag("positive")
    public void checkRegistrationFormTest() {
        steps.openPage();
        steps.fillRegistrationForm();
        steps.submitForm();
        steps.verifySubmittedData();
    }

    @Test
    @Tag("negative")
    @DisplayName("User tries to submit empty form")
    void checkSubmittingEmptyRegistrationFormTest() {
        steps.openPage();
        steps.submitForm();
    }
}