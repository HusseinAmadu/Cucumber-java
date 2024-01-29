package runner;

import TestPage.testPage;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/oopLogin.feature"
        ,glue= {"steps"}
        ,plugin= {"pretty","html:target/cucumber-html-report.html"})
public class ooptestrunner extends testPage {
}
