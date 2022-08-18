package runnerpkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Arinder\\eclipse-workspace\\WellTechInternshipProjectBDDPOM\\src\\test\\java\\features\\ServiceforJobPlacement.feature",
                  glue ="step_Definition",
                   monochrome=   true,
                   plugin= {"pretty","html:target/cucumberReport.html" }
                   )
public class RunnerClass {

}
