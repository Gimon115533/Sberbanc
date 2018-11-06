package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
 * Created by Anton 05.11.2018
 */

public class TravelPage {

    @FindBy(xpath = "//*[contains(@data-pid,'2247407')]//*[@class='kit-button kit-button_color_green kit-button_size_m']")
    public WebElement sendButonOnline;



    public TravelPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);

    }


}
