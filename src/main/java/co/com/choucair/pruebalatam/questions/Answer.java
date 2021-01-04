package co.com.choucair.pruebalatam.questions;

import co.com.choucair.pruebalatam.tasks.GeneralLatam;
import co.com.choucair.pruebalatam.userinterface.GeneralPageLatam;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private int question;

    public Answer(int question) {
        this.question = question;
    }

    public static Answer toThe(int question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;

        String text = Text.of(GeneralPageLatam.TEXT_CODE).viewedBy(actor).asString();

        String[] arreglo= text.split("\n");

        String[] arregloCode = arreglo[0].split(", ");

        if(question == arregloCode[2].length()){
            result=true;
        }
        else {
            result = false;
        }

        return result;
    }
}
