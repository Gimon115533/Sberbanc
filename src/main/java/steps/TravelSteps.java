package steps;

import pages.TravelPage;
import ru.yandex.qatools.allure.annotations.Step;

public class TravelSteps {
    @Step("выполнено нажатие на Оформить онлайн")
    public void goToSendAppPage(){
        new TravelPage().sendButonOnline.click();
    }
}
