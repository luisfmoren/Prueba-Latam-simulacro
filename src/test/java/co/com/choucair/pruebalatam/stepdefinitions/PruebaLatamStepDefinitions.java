package co.com.choucair.pruebalatam.stepdefinitions;

import co.com.choucair.pruebalatam.questions.Answer;
import co.com.choucair.pruebalatam.tasks.GeneralLatam;
import co.com.choucair.pruebalatam.tasks.OpenUp;
import co.com.choucair.pruebalatam.userinterface.GeneralPageLatam;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PruebaLatamStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis wants verify your travel code$")
    public void thanLuisWantsVerifyYourTravelCode() {
        OnStage.theActorCalled("luis").wasAbleTo(OpenUp.thePage());
    }


    @When("^he access to the page latam$")
    public void heAccessToThePageLatam() {
        OnStage.theActorInTheSpotlight().attemptsTo(GeneralLatam.the());
    }

    @Then("^he will the numbers of caracters of your travel code$")
    public void heWillTheNumbersOfCaractersOfYourTravelCode() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(7)));
    }
}
