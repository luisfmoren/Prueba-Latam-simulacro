package co.com.choucair.pruebalatam.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GeneralPageLatam {

    public static final Target BUTTON_TRAVEL = Target.the("Button to acces a travel")
            .located(By.id("lnk-xp_all_web_header_menuMyTripsTxt"));

    public static final Target DATA_YOUR_TRAVEL = Target.the("button access for enter your data travel")
            .located(By.id("tab_search_order"));

    public static final Target WHERE_DATA_TRAVEL = Target.the("button access where find your data travel")
            .located(By.id("undefined-dialog-open"));

    public static final Target WINDOW_CODE = Target.the("window code")
            .located(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div"));

    public static final Target TEXT_CODE = Target.the("Button to acces a travel")
            .located(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/button[2]/div[2]/div/span"));

}
