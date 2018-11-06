package steps;

import pages.SelectPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Anton 05.11.18
 */

public class SelectPageStaps {
    @Step("выполнено нажатие на Минимальная")
    public void clicButonMinimaize(){
        new SelectPage().sendButonMinimaize.click();
    }
    @Step("выполнено нажатие на Оформить")
    public void goToNetPage(){
        new SelectPage().sendButonFarmalize.click();
    }
}
