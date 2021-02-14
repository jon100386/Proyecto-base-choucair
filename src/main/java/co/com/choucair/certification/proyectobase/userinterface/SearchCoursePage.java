package co.com.choucair.certification.proyectobase.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target BUTTON_CC = Target.the("select courses and certifications").located(By.xpath("//*[@id=\"certificaciones\"]/a/img"));
    public static final Target INPUT_COURSE = Target.the("look for the course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click on IR to search for the course").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Click to search the course").located(By.partialLinkText("Analista Bancolombia"));
    public static final Target NAME_COURSE = Target.the("Extract the name of the course").located(By.xpath("//h1"));

}
