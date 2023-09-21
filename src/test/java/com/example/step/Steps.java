package com.example.step;

import com.example.hook.Hook;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

@ScenarioScoped
public class Steps {

    int result = 0;

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        this.result = arg0 + arg1;
    }

    @Then("The result is {int}")
    public void theResultIs(int arg0) {
        Assertions.assertEquals(result, arg0);
    }

    @Then("The hook was correctly injected")
    public void theHookWasCorrectlyInjected() {
        Assertions.assertTrue(Hook.isStrCorrectlyInjected);
    }
}
