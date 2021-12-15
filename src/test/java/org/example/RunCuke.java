package org.example;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//create class run cuke for running all methods
@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        tags = "@Register or @ReferaProduct or @NewsComment or  @Navigate",
        plugin =  { "pretty", "html:target/cucumber/report.html" }
)

public class RunCuke {
}
