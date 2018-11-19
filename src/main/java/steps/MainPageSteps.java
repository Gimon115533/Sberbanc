package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Anton 05.11.2018
 */

public class MainPageSteps {
//    @Step("выбран пункт меню {0}")
//    public void selectMenuItem(String menuItem){
//        new MainPage().selectMenuItem(menuItem);
//    }


    @Step("Нажать на страхование")
    public void insurance(){
        new MainPage().insuranceMainMenu.click();
    }

    @Step("Нажать на страхование путешественников")
    public void insuranceTrip(){
        new MainPage().insuranceTripMainMenu.click();
    }

//    @Step("выбран вид страхования {0}")
//    public void selectMenuInsurance(String menuItem){
//        new MainPage().selectInsuranceItem(menuItem);
//    }
}
