package Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="use_cases",
glue = "Test", plugin= {"html: target/cucumber.html"}
)
public class Tests {

}
