package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/phlebocreation.feature", glue={"steps"},
tags=("@login1"),
monochrome=true,
//tags={"@login and @assignordertophlebo"},
plugin= {"pretty","html:target/htmlreports/phleboreport.html"})
public class Runner {

}
