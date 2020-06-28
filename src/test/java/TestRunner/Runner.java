package TestRunner;


import BaseClass.BaseTest;
import io.cucumber.java.an.Cuan;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/G S Sastry/Axone Workspace/BDDFramework_Cucumber/src/test/resources/features/search.feature",
        glue ="StepDefinition",
        tags = "@Test",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:test-output"}
        )
public class Runner extends BaseTest {


}
