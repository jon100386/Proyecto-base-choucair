package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.JavascriptExecutor;

public class Search implements Task {
    private String course;
    private ChoucairAcademyPage choucairAcademyPage;

    public Search(String course) {
        this.course = course;
    }


    public static Performable the(String course) {
        return Tasks.instrumented(Search.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_CC),
                Enter.theValue(course).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO));
                JavascriptExecutor js = (JavascriptExecutor) choucairAcademyPage.getDriver();
                js.executeScript("window.scrollBy(0,500)");
                actor.attemptsTo(Click.on(SearchCoursePage.SELECT_COURSE));


    }
}