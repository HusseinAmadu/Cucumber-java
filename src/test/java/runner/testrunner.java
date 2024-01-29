package runner;

import TestPage.testPage;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features/login.feature"
        ,glue= {"steps"}
        ,plugin= {"pretty","html:target/cucumber-html-report.html"})
public class testrunner extends testPage {
}
