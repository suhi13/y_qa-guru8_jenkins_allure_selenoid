package tests.lesson8;

import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import steps.RegistrationFormSteps;

public class RegistrationFormTest {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    public void checkRegistrationWithFakerTest() {
        RegistrationFormSteps steps = new RegistrationFormSteps();

        steps.openPage();
        steps.fillRegistrationForm();
        steps.verifySubmittedData();
    }
}