package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
 * Created by Anton 05.11.2018
 */

public class MainPage {

//    @FindBy(xpath = "//*[@class='lg-menu__list']")
//    WebElement menuItems;

//    @FindBy(xpath = "//*[contains(@class,'lg-menu')]//*[contains(text(),'Путешествия и покупки')]")
//    WebElement menuInsurance;

    @FindBy(xpath = "//span[text()='Страхование']")
    public WebElement insuranceMainMenu;
    @FindBy(xpath = "//*[contains(@class,'lg-menu')]//*[contains(text(),'Путешествия и покупки')]")
    public WebElement insuranceTripMainMenu;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

//    public void selectMenuItem(String itemName) {
//        menuItems.findElement(By.xpath("//li[contains(@class,'lg-menu')]//*[contains(text(), '" + itemName + "')]")).click();
//    }
//
//    public void selectInsuranceItem(String itemName) {
//        menuInsurance.findElement(By.xpath("//*[contains(@class,'lg-menu')]//*[contains(text(),'" + itemName + "')]")).click();
//    }
}
