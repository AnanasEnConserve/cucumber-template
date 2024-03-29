package runner.steps;

import general.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SetupTeardown extends BaseClass {

    @Before
    public void setup(Scenario scenario) {
        System.out.println("Running scenario " + scenario.getName());
        setupFromBaseClass(scenario);
    }

    @After
    public void teardown(Scenario scenario) {
        System.out.println("Scenario " + scenario.getName() + " has " + scenario.getStatus());
        teardownFromBaseClass(scenario);
    }
}
