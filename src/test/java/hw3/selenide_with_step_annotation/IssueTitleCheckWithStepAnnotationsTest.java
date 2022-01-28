package hw3.selenide_with_step_annotation;

import org.junit.jupiter.api.Test;

public class IssueTitleCheckWithStepAnnotationsTest extends IssueTitleCheckSteps {

    @Test
    public void issueTitleCheckTest() {

        openMainPageStep();
        findRepositoryStep();
        openRepositoryStep();
        issueTitleCheckStep();
    }
}
