package tests.lesson8;

import static com.codeborne.selenide.Condition.visible;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pages.RegistrationPage;
import steps.RegistrationFormSteps;

public class RegistrationFormTest extends TestBase {

    RegistrationFormSteps steps = new RegistrationFormSteps();

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
        RegistrationPage registrationPage = new RegistrationPage();

        steps.openPage();
        steps.submitForm();
        registrationPage.modalTitle.shouldBe(visible);
    }
}