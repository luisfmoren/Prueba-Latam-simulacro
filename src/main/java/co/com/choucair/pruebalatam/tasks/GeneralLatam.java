package co.com.choucair.pruebalatam.tasks;

import co.com.choucair.pruebalatam.userinterface.GeneralPageLatam;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GeneralLatam implements Task {

    public static Performable the(){
        return Tasks.instrumented(GeneralLatam.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GeneralPageLatam.BUTTON_TRAVEL),
                Click.on(GeneralPageLatam.DATA_YOUR_TRAVEL),
                Click.on(GeneralPageLatam.WHERE_DATA_TRAVEL),
                WaitUntil.the(GeneralPageLatam.WINDOW_CODE, isVisible()).forNoMoreThan(5).seconds(),
                Switch.toDefaultContext());
    }

}
