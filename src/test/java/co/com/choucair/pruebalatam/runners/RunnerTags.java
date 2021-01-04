package co.com.choucair.pruebalatam.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/PruebaLatam.feature",
        tags = "@stories",
        glue = "co.com.choucair.pruebalatam.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
