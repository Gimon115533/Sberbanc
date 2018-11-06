package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
 * Created by Anton 05.11.2018
 */

public class SelectPage {
    @FindBy(xpath = "//*[@class='b-form-section']//*[@class='b-form-box-block']//*[@class='b-form-prog-box b-form-active-box']")
    public WebElement sendButonMinimaize;

    @FindBy(xpath = "//span[contains(text(),'Оформить')]")
    public WebElement sendButonFarmalize;



    public SelectPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);

    }
}
